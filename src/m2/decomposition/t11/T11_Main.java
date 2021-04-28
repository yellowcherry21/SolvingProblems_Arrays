//В каком из двух чисел больше цифр?

package m2.decomposition.t11;

import java.util.Scanner;

public class T11_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print("Input 2 integers: ");		
		int n1=scn.nextInt(),n2=scn.nextInt();
		
		CompareAmounts(n1,n2);
		
		System.out.println();
		
	}
	
	public static int AmountOfDigits(int n) {
		int amount=0;
		
		while(n>0) {
			n/=10;
			amount++;
		}
		
		return amount;
	}
	
	public static void CompareAmounts(int n1, int n2) {
		int Am1=AmountOfDigits(n1),Am2=AmountOfDigits(n2);
		
		if (Am1>Am2) System.out.print("В первом числе больше цифр");
		if (Am2>Am1) System.out.print("Во втором числе больше цифр");
		if (Am1==Am2) System.out.print("Количество цифр одинаково");
	}

}
