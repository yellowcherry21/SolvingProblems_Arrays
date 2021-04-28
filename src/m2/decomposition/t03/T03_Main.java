// Вычислить площадь правильного шестиугольника со стороной а
//используя метод вычисления площади треугольника. 

package m2.decomposition.t03;

import java.util.*;

public class T03_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print(">>>");
		int a=scn.nextInt();	
		double S, Final_Sq;
		
		S=SquareOfTriangle(a);
		
		Final_Sq=6*S;
		
		System.out.println("Square of hexagon is :"+Final_Sq);
	
		
	}
	public static double SquareOfTriangle(int a) {
		return a*a*Math.sqrt(3)/4;
	}

}
