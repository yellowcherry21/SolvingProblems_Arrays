//Найти все натуральные n-значные числа, цифры в которых образуют
//строго возсрастающую последовательность 

package m2.decomposition.t15;

import java.util.*;

public class T15_Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.println(">>>");
		int n = scn.nextInt();
		
		for(int i =(int) Math.pow(10, n-1);i<Math.pow(10, n);i++) {
			if(DigitSort(i)) System.out.print(i+"  ");
			if(i%10==0) System.out.println();
		}
		
	}
	
	public static int AmountOfDigits(int n) {
		int amount=0;
		
		while(n>0) {
			n/=10;
			amount++;
		}
		
		return amount;
	}
	
	private static boolean DigitSort(int x) {
		boolean flag = true;
		
		int n =AmountOfDigits(x);
		
		int []A=new int[n];
		
		for(int i=0;i<n;i++) {
			A[i]=(int) ((x/Math.pow(10, n-i-1))%10);
			//System.out.print(A[i]+"  ");
		}
		
		for(int i = 0;i<n-1;i++) {
			if(A[i]>A[i+1]) flag = false;
		}
		
		return flag;
	}

}
