//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

package m2.decomposition.t07;

public class T07_Main {
	public static void main(String argv[]) {
		int summ=0;
		
		for(int i=0;i<10;i++) {
			if(i%2!=0)summ+=Factorial(i);
		}
		System.out.println("Result is: "+summ);
	}
	
	public static int Factorial(int result) {
		int amount=result;
		for(int i=1;i<amount;i++) {
			result*=(amount-i);
		}
		return result;
	}
}
