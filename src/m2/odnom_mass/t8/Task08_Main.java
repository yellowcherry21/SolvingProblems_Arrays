//Дана последовательность целых чисел a1, a2,..., an.
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2,..., an.) 

package m2.odnom_mass.t8;

import java.util.*;

public class Task08_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Input amount of elemnts: ");
		int n=scn.nextInt(), min, k=0,NewN;
		int arr[]=new int [n];
		
		System.out.println("Input "+n+" elements: ");
		
		for(int i = 0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		min=arr[0];
		
		for(int i=0;i<n;i++) {
			if(min>arr[i]) min=arr[i];        //Определили Min
		}
		
		for(int i = 0;i<n;i++) {              //Определили колво минимальных элементов
			if(min==arr[i]) k++;
		}	
		
		NewN=n-k;
		int NewArr[]=new int[NewN];
		System.out.println("Min is: "+min+" k is: "+k+" NewN is: "+NewN);
		
		for(int i=0, j=0;i<n;i++) {
			if(arr[i]!=min) {
				NewArr[j]=arr[i];
				System.out.print(NewArr[j]+"\t");
				j++;
			}
		}
	}

	
	
	
	
	
	
}
