//Дан целочисленный массив с количеством элементов п
//Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
//создать только 1 массив(итоговый)

package m2.odnom_mass.t10;

import java.util.*;

public class Task10_Main {
	public static void main(String argv[]) {
		int n;
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Введите размерность массива ");
		n=scn.nextInt();
		
		int ar[]=new int [n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Введите элемент массива ");
			ar[i]=scn.nextInt();
			if(i%2!=0) ar[i]=0;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+"\t");
		}
		
		System.out.println();

		}		
	}

