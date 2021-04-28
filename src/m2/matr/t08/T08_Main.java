// В числовой матрице поменять местами два столбца любых столбца

package m2.matr.t08;

import java.util.*;

public class T08_Main {

	public static void main(String[] args) {
		System.out.print(">>>");
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		Random r=new Random();
		int n=scn.nextInt();
		int [][]ar=new int[n][n];
		
		for(int i=0;i<n;i++) {//Инициализация и вывод исх. матрицы
			for(int j=0;j<n;j++) {
				ar[i][j]=r.nextInt()%15;
				System.out.print(ar[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.println("Введите номера двух столбцов: ");
		
		int p=scn.nextInt();
		int q=scn.nextInt();
		for(int i=0;i<n;i++) {// swap
			int temp=0;
			temp=ar[i][p-1];
			ar[i][p-1]=ar[i][q-1];
			ar[i][q-1]=temp;
		}
		
		for(int i=0;i<n;i++) {// вывод итоговой м-цы
			for(int j=0;j<n;j++) {
				System.out.print(ar[i][j]+"\t");
			}
		System.out.println();
		}
	}
}
