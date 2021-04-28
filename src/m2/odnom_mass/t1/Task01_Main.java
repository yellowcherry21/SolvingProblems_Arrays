//Найти сумму элементов массива, кратных K

package m2.odnom_mass.t1;
import java.util.*;

public class Task01_Main {

	public static void main(String[] args) {
		int n,k=3, summ=0;
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		
		int []ar=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=i+5;
			if(ar[i]%k==0) summ+=ar[i];
			System.out.print(ar[i]+"\t");
		}
		
		System.out.println("\n"+summ);
		
	}

}
