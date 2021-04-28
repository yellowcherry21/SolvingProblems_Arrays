// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов. 

package m2.matr.t13;

import java.util.*;

public class T13_Main {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.print(">>>");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt(), temp;
		int[][]arr=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=r.nextInt(16);
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.println("Возрастание: ");
		
		for(int k=0;k<n;k++) {  //возрастание
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(arr[j][k]>arr[j+1][k]) {
						temp=arr[j][k];
						arr[j][k]=arr[j+1][k];
						arr[j+1][k]=temp;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.println("Убывание: ");
		
		for(int k=0;k<n;k++) {  //Убывание
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(arr[j][k]<arr[j+1][k]) {
						temp=arr[j][k];
						arr[j][k]=arr[j+1][k];
						arr[j+1][k]=temp;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
	}
}
