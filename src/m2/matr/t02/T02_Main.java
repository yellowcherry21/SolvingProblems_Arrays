//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

package m2.matr.t02;

import java.util.*;
public class T02_Main {

	public static void main(String[] args) {
		Random r=new Random();
		int n=4;
		int [][]mass=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mass[i][j]=r.nextInt(15);
				System.out.print(mass[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) System.out.print(mass[i][j]+"  ");
			}
		}
	}

}
