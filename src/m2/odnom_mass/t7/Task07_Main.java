// Даны действительные числа a1, a2, ... a2n. Найти
//max(a1+a2n, a2+a2n-1, ... , an+an+1).

package m2.odnom_mass.t7;

import java.util.*;

public class Task07_Main {
	public static void main(String argv[]) {
		@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		int N=scn.nextInt(), n=2*N ;
		System.out.println("n is: "+n);
		
		int ar[]=new int[n];
		int ar1[]=new int[N];
		
		for(int i=0;i<n;i++) {
			ar[i]=scn.nextInt();
		}
		
		int Max=ar[0]+ar[n-1];
		
		for(int i=0;i<N;i++) {
			ar1[i]=ar[i]+ar[n-i-1];
			if(Max<ar1[i]) Max=ar1[1];
		}
		
		for(int i=0;i<N;i++) {
			System.out.println("Pair is : ("+ar[i]+","+ar[n-1-i]+")" );
		}
		System.out.print("\nMax is: "+Max);
	}

}
