// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

package m2.matr.t04;

import java.util.*;

public class Task04_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource" )
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Input n/2: ");
		int N=scn.nextInt(), n=2*N;
		int [][]ar=new int[n][n];
		
		
		
		System.out.println("n is: "+n);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0)ar[i][j]=j+1;
				else ar[i][j]=n-j;
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
