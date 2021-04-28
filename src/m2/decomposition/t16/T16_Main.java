//Написать программу, определяющую сумму n-значных чисел, содержащих только нечётные цифры

package m2.decomposition.t16;

import java.util.*;

public class T16_Main {

	public static void main(String[] args) {
		int n, summ = 0;
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.println(">>>");
		n=scn.nextInt();
		
		for(int i = (int) Math.pow(10, n-1); i < Math.pow(10, n); i++) {
			
			if(AreDigitsOdd(i)) {
				summ+=i;
				System.out.print(i+"  ");
			}			
			System.out.println();
		}
		
		System.out.println("\nSumm is "+summ);
		
		System.out.println("qq"+IsOdd(11));
		
	}
	
	public static int AmountOfDigits(int n) {
		int amount=0;
		
		while(n>0) {
			n/=10;
			amount++;
		}
		
		return amount;
	}
	
	private static boolean IsOdd(int n) {
		boolean IsOdd = true;
		
		if(n%2==0) IsOdd= false;
		
		return IsOdd;
	}
	
	private static boolean AreDigitsOdd(int x) {
		boolean flag = true;
		
		int n = AmountOfDigits(x);
		
		int []Dig = new int[n]; 
		
		for(int i = 0; i < n; i++) {
			Dig[i]=(int) ((x/Math.pow(10, n-i-1))%10);
			System.out.print(Dig[i]+"  ");
		}
		
		for(int i = 0; i < n; i++) {
			if(!IsOdd(Dig[i])) {
				flag = false;
				break;
			}
		}
		
		return flag;		
	}

}
