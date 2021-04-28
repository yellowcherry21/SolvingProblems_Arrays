//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
//Сколько таких действий надо произвести, чтобы получился нуль

package m2.decomposition.t17;

import java.util.*;

public class T17_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int k = 0;
		System.out.println(DigitSumm(n));
		
		while(n>0) {
			n-=DigitSumm(n);
			System.out.print(n+" ");
			k++;
		}
		System.out.println("Repeats amount is: "+k);

	}
	
	public static int AmountOfDigits(int n) {
		int amount=0;
		
		while(n>0) {
			n/=10;
			amount++;
		}
		
		return amount;
	}
	
	public static int DigitSumm(int x) {
		
		int summ=0;
		int n = AmountOfDigits(x);
		
		for(int i=0;i<n;i++) {
			summ+=(x/Math.pow(10, n-i-1))%10;
		}
		
		return summ;
		
	}

}
