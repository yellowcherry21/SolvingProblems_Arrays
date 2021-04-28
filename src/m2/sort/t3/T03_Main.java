//Сортировка выбором

package m2.sort.t3;

import java.util.Scanner;

public class T03_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Input amount of elements: >>>");
		int n = scn.nextInt();
		
		System.out.println("Input " + n + " elements\na1<a2<...<an");
		
		int [] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		
		int maxId = 0;
		
		for(int i = 0; i< n;i++) {
			int maxN = arr[i];
			for(int j = i; j < n; j++) {
				if(arr[j] >= maxN) {
					maxN = arr[j];
					maxId = j;
				}				
				
			}
			arr[maxId] = arr[i];
			arr[i] = maxN;
			System.out.print(arr[i]+", ");
		}
		
		System.out.println();
		
		for(int i =0;i < n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
