//Находит второй по величине элемент в массиве

package m2.decomposition.t05;

import java.util.*;

public class T05_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		Random r = new Random();
		
		System.out.print(">>> ");
		int n=scn.nextInt();
		int []ar=new int[n];
		
		
		for(int i = 0;i<n;i++) {
			ar[i]=r.nextInt(14);
			System.out.print(ar[i]+"\t");
		}
		
		int max=Max(ar),max2=maxNext(ar);
		
		System.out.print("\nMax is: "+max+"\nMax2 is: "+max2);
		
		
	}
	
	public static int Max(int []ar) {
		int max=ar[0];
		
		for(int i =0;i<ar.length;i++) {
			if(max<ar[i]) max=ar[i];
		}
		return max;
	}
	
	public static int maxNext(int []ar) {
		int max=Max(ar), max2=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(max2<ar[i]&&ar[i]<max) max2=ar[i];
		}
		return max2;
	}

}
