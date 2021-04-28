//Сформировать случайную матрицу m x n, состоящую из нулей и единиц
// причем в каждом столбце число единиц равно номеру столбца. 

package m2.matr.t14;

import java.util.*;

public class T14_Main {

	public static void main(String[] args) {
		System.out.print(">>>");
		Random r=new Random();
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Input m ,n: m>n");
		int m=scn.nextInt(), n=scn.nextInt();
		
		int []Kol1=new int [n];
		int [][]ar=new int[m][n];
		
		for(int i=0;i<m;i++) {	
			for(int j=0;j<n;j++) {
				ar[i][j]=0;
			}
		}
		
		for(int j=0;j<n;j++) {
			Kol1[j]=0;
			int i=0;
			while(Kol1[j]<j+1) {
				System.out.print("(");
				if(ar[i][j]==0) {
					ar[i][j]=r.nextInt(2);
				    if(ar[i][j]==1) Kol1[j]++;
				}
				System.out.print("k="+Kol1[j]+",");
				i++;
				if(i>m-1) i=1;
				System.out.print(")");
			}
			System.out.println();
		}
        
        System.out.println("Matrix is:\n");
        
        System.out.println();
        
        for(int i=0;i<m;i++) {			
			for(int j=0;j<n;j++) {
				System.out.print(ar[i][j]+"  ");
			}
		System.out.println();
		}
		
	}

}
