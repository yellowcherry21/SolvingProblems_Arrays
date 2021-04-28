//Сортировка вставками

package m2.sort.t5;

import java.util.Random;
import java.util.Scanner;

public class T05_Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println(">>>");
		int n = scn.nextInt();
		
		int []ar = new int[n];
		
		for(int i = 0;i < n;i++) {
			ar[i] = 10*(n-i)+ r.nextInt(10);
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.print("("+BinarySearch(ar, 10*(n-i))+")");
		}
				
	}
	
	static int BinarySearch(int[]ar, int q) {
		int firstIndex = 0;
		int lastIndex = ar.length-1;
		
		while(firstIndex <= lastIndex) {
			int midIndex = (firstIndex + lastIndex) / 2;
			
			if(ar[midIndex] == q) {
				return midIndex;
			}
			
			else if(ar[midIndex] < q) {
				firstIndex = midIndex + 1;
			}
			
			else if(ar[midIndex] > q) {
				lastIndex = midIndex -1;
			}
		}
		
		System.out.print("LI: "+lastIndex+"; FI: "+firstIndex);
		
		return -1;
	}

}
