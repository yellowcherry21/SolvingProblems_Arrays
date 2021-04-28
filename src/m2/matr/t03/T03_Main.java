//Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 

package m2.matr.t03;

import java.util.*; 

public class T03_Main {

	public static void main(String[] args) {
		int k, p, n;
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		Random r=new Random();
		System.out.print(">>>");
		n=scn.nextInt();
		int [][]ar=new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j]=r.nextInt(15);
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("Input k and p: ");
		
		k=scn.nextInt();
		p=scn.nextInt();
		
		for(int i=0;i<n;i++) {//k-�� ������
			if(i==k-1) {
				for(int j=0;j<n;j++) {
				    System.out.print(ar[i][j]+"  ");
			    }
			}
			System.out.println();
		}
				
		for(int i=0;i<n;i++) {//p-�� ������� 
			for(int j=0;j<n;j++) {
			    if(j==p-1)System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
