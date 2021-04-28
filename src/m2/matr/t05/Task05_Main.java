// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

package m2.matr.t05;

import java.util.*;

public class Task05_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		//Random r=new Random();
		
		System.out.print("������� ������ n: ");
		int n=scn.nextInt();

		int [][]ar=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j]=i+1;
				System.out.print(ar[i][j]+"  ");
			}
		System.out.println();
		}
		
	}

}
