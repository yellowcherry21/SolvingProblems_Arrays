// Отсортировать строки матрицы по возрастанию и убыванию значений элементов. 

package m2.matr.t12;

import java.util.*;

public class T12_Main {

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
		
		System.out.println("Убывание: ");
		
		for(int k=0;k<n;k++) {//убывание
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(arr[k][j]<arr[k][j+1]) {
						temp=arr[k][j];
						arr[k][j]=arr[k][j+1];
						arr[k][j+1]=temp;
					}
				}
			}
		}
		
		System.out.println();
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.println("Возрастание: ");

		for(int k=0;k<n;k++) {//возрастание
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(arr[k][j]>arr[k][j+1]) {
						temp=arr[k][j];
						arr[k][j]=arr[k][j+1];
						arr[k][j+1]=temp;
					}
				}
			}
		}
		
		System.out.println();
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
	}
}
