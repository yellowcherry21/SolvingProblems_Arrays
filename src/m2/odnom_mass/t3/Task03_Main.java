//Дан массив действительных чисел, размерность которого N. 
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов

package m2.odnom_mass.t3;

import java.util.*;

public class Task03_Main {

	public static void main(String[] args) {
		int n,AmPos=0, AmNeg=0, Am0=0;
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		Random r=new Random();
		n=scn.nextInt();
		
		double [] mas=new double[n];
		
		for(int i=0;i<n;i++) {
			mas[i]=r.nextDouble()*17;
			if(i%4==0)  mas[i]*=-1.0;
			System.out.print(mas[i]+"\t");
			if(mas[i]>0) AmPos++;
			else if(mas[i]==0) Am0++;
			else AmNeg++;
		}
		
		System.out.println("\nNegative: "+AmNeg+" Positive: "+AmPos+" Zeros: "+Am0);
		
	}

}
