//Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

package m2.decomposition.t12;

import java.util.*;

public class T12_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int K;
		int N;
		int am = 0; // количество элементов массива
		
		System.out.println("Input K(digit summ)>>>");
		K = scn.nextInt();
		
		System.out.println("Input N(max integer)>>>");
		N = scn.nextInt();
		

		
		for(int i=0;i<N;i++) {  // определяем am
			if(DigitSumm(i)==K) {
				am++;
				System.out.print(i+"  ");
			}
		}
		
		int []Q= new int[am];// создаём массив под искомые числа
		
		System.out.println("Q is");

		for(int i=0,j=0;i<N;i++) {  //	вносим искомые числа в массив и выводим его
			if(DigitSumm(i)==K) {
				Q[j]=i;
				System.out.print(Q[j]+"\t");
				j++;
			}
		}
	}
	
	private static int DigitSumm(int a) { //ф-ия определяет сумму цифр челого числа
		
		int k = 0;
		int Summ = 0;
		int a1 = a;
		
		if(a1==0)k=1;//определяем количество цифр числа k
		
		while(a1 >= 1) { 
			a1 /= 10;
			k++;
		}
		
		
		for(int i=0;i<k;i++) { //находим сумму цифр числа
			Summ += (a/Math.pow(10, k-i-1))%10;
		}
		return Summ;
	}

}
