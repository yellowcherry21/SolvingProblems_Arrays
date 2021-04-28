//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

package m2.matr.t15;

import java.util.*;

public class T15_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		Random r=new Random();
		int n=scn.nextInt();
		
		int [][] ar=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j]=r.nextInt()%14;
				System.out.print(ar[i][j]+"\t");
			}
		System.out.println();
		}
		
		int maxEl=ar[0][0];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(maxEl<ar[i][j]) maxEl=ar[i][j];
			}
		}
		System.out.println("Max element is : "+maxEl+" New Matrix is : ");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0&&j%2==0) ar[i][j]=maxEl;
				System.out.print(ar[i][j]+"\t");
			}
		System.out.println();
		}
	}

}
