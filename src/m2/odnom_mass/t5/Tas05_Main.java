//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

package m2.odnom_mass.t5;

public class Tas05_Main {

	public static void main(String[] args) {
		int n=8;
		int []ar=new int[n];
		
		for(int i = 0;i<n;i++) {
			ar[i]=3*i-5;
			if(ar[i]>i) System.out.print(ar[i]+"\t");
		}
	}

}
