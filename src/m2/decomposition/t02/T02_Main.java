//  Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

package m2.decomposition.t02;

import java.util.Scanner;

import m2.decomposition.t01.T01_Main;

public class T02_Main {

	public static void main(String[] args) {
		int a=Enter(), b=Enter(), c=Enter() ,d=Enter();
		
		int t1=T01_Main.NOD(T01_Main.NOD(a, b),T01_Main.NOD(c, d));
		System.out.println("NOD is : "+ t1);
		
	}
	
	public static int Enter() {
		int A;
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.print(">>>");
		
		while(!scn.hasNextInt()) {
			scn.next();
			System.out.print(">>>");			
		}
		A=scn.nextInt();	
		return A;
	}

}
