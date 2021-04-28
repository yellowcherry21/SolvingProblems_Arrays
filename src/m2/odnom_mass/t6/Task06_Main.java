//Задана последовательность N вещественных чисел. 
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.

package m2.odnom_mass.t6;

public class Task06_Main {

	public static void main(String[] args) {
		int n=9, summ=0;
		int []ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=i+5;
			if(isPrime(i)) summ+=ar[i];
			System.out.print(ar[i]+"\t"+summ+"! ");
		}
		
		
		System.out.println("\n"+summ);		
	}
	
	public static boolean isPrime(int n) {
		boolean isPrime=true;
		for(int i=2;i<=n-1;i++) {
			int k;
			k=n%i;
			if(k==0) {
				isPrime =false;
				break;
			}
		}
		return isPrime;
		
	}

}
