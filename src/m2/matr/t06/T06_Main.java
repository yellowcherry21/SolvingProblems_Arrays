//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

package m2.matr.t06;

import java.util.*;

public class T06_Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.print(">>>");
		int n=scn.nextInt();
		int[][]arr=new int [n][n];
		
		for(int i=0;i<n;i++) {   //генерация
			for(int j=0;j<n;j++) {
				arr[i][j]=1;
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		
		
		for(int i=1;i<n/2;i++) {    //левая верхняя(2ая)четверть
			for(int j=0;j<i;j++) {
				arr[i][j]=0;
			}
		}
		
		for(int i=n-2;i>(n/2-1);i--) {   //левая нижняя (3я) четверть
			for(int j=0;j<(n-i-1);j++) {
				arr[i][j]=0;
			}
		}
		
		for(int i=1;i<n/2;i++) {  // правая верхняя(1ая) четверть
			for(int j=n-1;j>n-i-1;j--) {
				arr[i][j]=0;
			}
		}
		
		for(int i=n-2;i>(n/2-1);i--) {//  левая нижняя(4ая) четверть 
			for(int j=n-1;j>i;j--) {
				arr[i][j]=0;
			}
		}
			
		System.out.println();
		
		for(int i=0;i<n;i++) {       // вывод
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}

}
