//Даны числа X, Y, Z, Т — длины сторон четырехугольника.	
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

package m2.decomposition.t09;

import static java.lang.Math.*;
import java.util.Scanner;

public class T09_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		double diag, Part1_Square, Part2_Square, x, y, z, t;
		
		System.out.println(">>>");
		
		x=scn.nextDouble();
		y=scn.nextDouble();
		z=scn.nextDouble();
		t=scn.nextDouble();
		
		diag=Hypotenuse(x,y);
		
		Part1_Square=RightTriangleSquare(x,y);
		
		Part2_Square=FormulaGerona(z,t,diag);
		
		System.out.println(Part1_Square+Part2_Square);
		
		
		
	}
	
	public static double RightTriangleSquare(double a,double b) {
		return (a*b)/2;
	}
	
	public static double FormulaGerona(double a, double b, double c) {
		double p;
		p=(a+b+c)/2;
		return sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public static double Hypotenuse(double a,double b) {
		return sqrt(pow(a,2)+pow(b,2));
	}

}
