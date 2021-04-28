//Сортировка обменами(пузырьковая)

package m2.sort.t4;

import java.util.Random;
import java.util.Scanner;

public class T04_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		Random r = new Random();
		
		int n = scn.nextInt();
		
		int []ar = new int[n];
		
		for(int i = 0; i< ar.length;i++) {
			ar[i] = 5*i + r.nextInt(5);
			System.out.print(ar[i]+", ");
		}
		
		int temp = 0;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(ar[j] < ar[j+1]  ) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		
		System.out.println("\n____________________");
		
		for(int i = 0; i < n; i++) {
			System.out.print(ar[i]+", ");
		}

	}

}
