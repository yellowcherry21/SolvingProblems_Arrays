//Написать метод(методы) для нахождения НОД и НОК двух натуральных чисел

package m2.decomposition.t01;

import java.util.*;

public class T01_Main {

	public static void main(String[] args) {
		
		int A, B;
		
		Random random = new Random();
		
		A = random.nextInt(40);
		B = random.nextInt(50);
		System.out.println("A is "+A+"; B is "+B);
		int NOD, NOK;
		
		
		NOD = NOD(A, B);
		NOK = NOK(A, B);
		
		System.out.println("NOD is :"+NOD+"\nNOK is :"+NOK);
	}
	
	
	public static int NOD(int a, int b) {		
		while(a!=b) {
			if(a>b) {
				a-=b;
			} else b-=a;
			//System.out.println(a+" "+b);
		}
		
		return a;
	}
	
	public static int NOK(int a,int b) {
		int nok;
		nok=a*b/NOD(a, b);
		return nok;
	}

}
	
