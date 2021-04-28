//Задана матрица неотрицательных чисел.
//Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму. 

package m2.matr.t09;

import java.util.*;

public class T09_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		Random r=new Random();
		System.out.println(">>>");
		int n=scn.nextInt(), MaxS;
		
		int [][]arr=new int[n][n];
		
		int[]ArSumS=new int[n];
		
		for(int i=0;i<n;i++) {//определение м-цы
			for(int j=0;j<n;j++) {
				arr[i][j]=r.nextInt(24);
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
				
		for(int i=0;i<n;i++) {//определение(нахождение) сумм
			for(int j=0;j<n;j++) {
				ArSumS[i]+=arr[j][i];
			}
		}
		
		MaxS=ArSumS[0];
		System.out.print("Summs are: " );
		
		for(int i=0;i<n;i++) {//вывод сумм
			System.out.print(ArSumS[i]+",");
		}
		
		for(int i=0;i<n;i++) {
			if(MaxS<ArSumS[i]) MaxS=ArSumS[i]; 
		}
		
		System.out.println("\nMax is: "+MaxS);
	}
}
