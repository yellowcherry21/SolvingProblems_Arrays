//Найти все чичла Армстронга на промежутке от 1 до k
//
//



package m2.decomposition.t14;

import java.util.*;

public class T14_main {

	public static void main(String[] args) {
		int k;
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Input k>>>");
		
		k = scn.nextInt();
		
		for(int i=1;i<k;i+=1) {
			if(Math.pow(DigitSumm(i), AmountOfDigits(i))==i) System.out.println(i+"  ");
		}
		

	}
	
	private static int DigitSumm(int x) { //ф-ия определяет сумму цифр челого числа
		
		int k = 0;
		int Summ = 0;
		int x1 = x;
		
		if(x1==0)k=1;//определяем количество цифр числа k
		
		while(x1 >= 1) { 
			x1 /= 10;
			k++;
		}
		
		
		for(int i=0;i<k;i++) { //находим сумму цифр числа
			Summ += (x/Math.pow(10, k-i-1))%10;
		}
		return Summ;		
	}
	
	private static int AmountOfDigits(int x) {
		int k = 0;
		
		if(x==0) k=1;
		
		while(x>0) {
			x/=10;
			k++;		
		}
		return k;
	}

}
