//найти и вывести пары простых чисел "близнецы" на промежутке [n, 2n]

package m2.decomposition.t13;

import java.util.*;

public class T13_Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.println(">>>Input n > 2");
		
		int n = scn.nextInt();
		int am=0;
		
		System.out.println("Interval ["+n+", "+2*n+"]"+" will be cheked");
		
		for(int i=n;i<2*n;i++) {
			if(IsPrime(i)) {
				am++;
				System.out.print(i+"  ");
			}
		}
		
		System.out.println("are prime numbers on interval");
		
		int []A = new int[am];
		
		for(int i=n, j=0;i<2*n;i++) {
			if(IsPrime(i)) {
				A[j]=i;
				j++;
			}
		}
		
		for(int i = 0; i < am - 1;i++) {
			if(A[i]+2==A[i+1]) System.out.println("Pare is: ("+A[i]+", "+A[i+1]+") ");
		}
		

	}
	
	private static boolean IsPrime(int n) {
		
		boolean is = true;
		for(int i=2;i<n;i++) {
			if(n%i==0)is=false;
		}
		return is;
	}

}
