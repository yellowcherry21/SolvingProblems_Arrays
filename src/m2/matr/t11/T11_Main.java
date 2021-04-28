//Матрицу 10x20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу
//и номера строк, в которых число 5 встречается три и более раз

package m2.matr.t11;

import java.util.*;

public class T11_Main {

	public static void main(String[] args) {
		Random r=new Random();
		int[][]arr=new int[10][20];
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<20;j++) {
				arr[i][j]=r.nextInt(16);
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.print("---------------------------------------------------------------"+"\nString's are: ");
		
		for(int i=0;i<10;i++) {
			int k=0;//counter
			for(int j=0;j<20;j++) {
				if(arr[i][j]==5) k++;
			}
		if(k>=3) System.out.print(i+1+" ");
		}
		
	}

}
