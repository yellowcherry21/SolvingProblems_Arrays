//На плоскости заданы координатами N точек
//определить между какими из пар точек самое большое расстояние.

package m2.decomposition.t04;

import java.util.*;

public class MatrixSolution {

	public static void main(String[] args) {
		Random r = new Random();
		
		@SuppressWarnings("resource")
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Input amount of points: ");
		int n = scn.nextInt();
		
		int [][]ar = new int[n][2];
		
		for(int i = 0;i<n;i++) {
			for(int j =0;j<2;j++) {
				ar[i][j]= r.nextInt(10);
				System.out.print(ar[i][j]+"	");
			}
			System.out.println();
		}
		
		double []Distances = new double[n*(n-1)];
		
		for(int i=0, k=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(i==j)j++;
				Distances[k]=DistanceBetweenPoints(ar[i][0],ar[j][0],ar[i][1],ar[j][1]);
				System.out.println(Distances[k]+"	"+"Distance between points "+(i+1)+", "+(j+1));
				k++;
			}

		}

	}
	
	private static double DistanceBetweenPoints(int x1, int x2, int y1, int y2) {
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}

}
