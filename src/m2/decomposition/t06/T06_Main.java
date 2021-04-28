//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

package m2.decomposition.t06;

import java.util.*;

public class T06_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print("Input 3 numbers");
		int a=scn.nextInt(), b=scn.nextInt(), c=scn.nextInt();
		
		System.out.println("\nNod of "+a+","+b+","+c+"is: "+NOD(NOD(a,b),c));
		
	}
	
	public static int NOD(int a, int b) {
		int NOD;
		
		while(a!=b) {
			if(a>b) {
				a-=b;
			}
			else b-=a;
		}
		
		NOD=a;
		
		return NOD;
	}

}
