// Найти положительные элементы главной диагонали квадратной матрицы. 

package m2.matr.t10;

import java.util.*;

public class T10_Main {

	public static void main(String[] args) {
		System.out.println(">>>");
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		Random r =new Random();
		int n=scn.nextInt();
		
		int [][] arr=new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=r.nextInt()%14-3;
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j&&arr[i][j]>0)  System.out.print(arr[i][j]+"\t");
			}
		}
	}

}
