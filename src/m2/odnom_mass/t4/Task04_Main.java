//Даны действительные числа а1 ,а2 ,..., аn 
//Поменять местами наибольший и наименьший элементы

package m2.odnom_mass.t4;

import java.util.*;

public class Task04_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		int n, max, min, PosMax=0, PosMin=0, temp=0;
		System.out.println("Input N: ");
		n=scn.nextInt();
		
		int []ar=new int[n];
		
		System.out.println("Input n elements: ");
		
		for(int i=0;i<n;i++) {
			ar[i]=scn.nextInt();
			
		}
		
		max=ar[0];
		min=ar[0];
		
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+"\t");
			if(min>ar[i]) {
				min=ar[i];
				PosMin=i;
			}
			
			if(max<ar[i]) {
				max=ar[i];
				PosMax=i;
			}
			
		}
		System.out.println("\nNew massive: ");
		
		temp=ar[PosMin];
		ar[PosMin]=ar[PosMax];
		ar[PosMax]=temp;
		
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+"\t");
			
		}
		
				
		System.out.println("\nMax is: "+max+" Min is: "+min);
	}

}
