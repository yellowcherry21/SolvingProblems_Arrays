// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

package m2.matr.t01;

import java.util.*;

public class T01_Main {

	public static void main(String[] args) {
		Random r=new Random();
		int n=3, m=n+2;
		int matr[][]=new int [m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matr[i][j]=r.nextInt(14);
				System.out.print(matr[i][j]+"(i="+i+"j="+j+")");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(j%2==0&&matr[0][j]>matr[m-1][j])System.out.print(matr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
