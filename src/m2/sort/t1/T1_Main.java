//Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
//Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого
//при этом не используя дополнительный массив.

package m2.sort.t1;

import java.util.*;

public class T1_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		Random r=new Random();
		System.out.println("Input n1,n2,k");
		int n1=scn.nextInt(), n2=scn.nextInt(), k=scn.nextInt();
		
		int []ar1 = new int[n1];
		int []ar2 = new int[n2];
		int []arRes = new int[n1+n2];
		
		for(int i = 0; i < n1; i++) {
			ar1[i]=r.nextInt(9);
			System.out.print(ar1[i]+"\t");
		}
		
		System.out.println();
		
		for(int i = 0; i < n2; i++) {//инициализация
			ar2[i]=-1*r.nextInt(9);
			System.out.print(ar2[i]+"\t");
		}
		
		for(int i = 0; i < k; i++) {
			arRes[i] = ar1[i];
		}
		
		System.out.println("\n!");
		
		for(int i = k; i < n2 + k; i++) {
			arRes[i]=ar2[i-k];
		}
		
		for(int i = n2+k; i < n1 + n2; i++) {
			arRes[i]=ar1[i-n2];
		}
		
		for(int i = 0; i < n1 + n2; i++) {
			System.out.print(+arRes[i]+"\t");
		}
		
	}

}
