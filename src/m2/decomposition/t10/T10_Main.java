//Цифры в числа записать в массив

package m2.decomposition.t10;

import java.util.*;

public class T10_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		int N=AmountOfDigits(n);
		
		int [] ar=new int [N];
		
		for(int i = 0;i<N;i++) {
			ar[i]=GetDigit(n,i);
			System.out.print(ar[i]+"\t");
		}
		
		
	}
	
	public static int GetDigit(int n, int pos) {
		int number=0,nn = n;
		for(int i = 0;i<AmountOfDigits(n)-pos-1;i++) {
			nn=nn/10;
			//System.out.print("!"+amount+"!");
		}
		
		number=nn%10;
		
		return number;
	}
	
	public static int AmountOfDigits(int n) {
		int k=0;
		
		while (n>0) {
			n/=10;
		    k++;
		}
		return k;
	}
	
	
	
}
