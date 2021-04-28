//Задан массив D. 
//Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
//с номерами от k до m

package m2.decomposition.t08;

import java.util.*;

public class Task08_Main {
	public static void main(String []argv) {
		Random r = new Random();
		
		System.out.println("Input amount of elements");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
		int [] arr=new int [n];
		
		for(int i =0;i<n;i++) {
			arr[i]=r.nextInt(33);
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\nInput k");
		
		int k = scn.nextInt(),k1=k+1,k2=k+2;
		
		System.out.println("summ of D["+k+"] + D["+k1+"] +D["+k2+"] is: "+SummOfThree(arr,k));
	}
	
	public static int SummOfThree(int []ar, int k) {
		return ar[k-1]+ar[k]+ar[k+1];
	}

}
