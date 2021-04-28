//Сформировать квадратную матрицу по правилу... 

package m2.matr.t07;

import java.util.*;

public class T07_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.print(">>>");
		int n=scn.nextInt();
		double [][] arr=new double[n][n];
		int counter=0;
		
		for(double i=0;i<n;i++) {
			for(double j=0;j<n;j++) {
				arr[(int) i][(int) j]=Math.sin((i*i-j*j)/n);
				System.out.print(arr[(int)i][(int)j]+"\t");
				if(arr[(int) i][(int) j]==0) {
					System.out.print("\t"+"\t");
					counter++;
				}
			}
		System.out.println();
		}
		System.out.println("Amount of positive elements is: "+counter);
	}

}
