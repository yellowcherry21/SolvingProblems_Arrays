// Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен

package m2.odnom_mass.t2;

public class Task02_Main {

	public static void main(String[] args) {
		int n=12, z=13, kk=0;
		
		double[]arr=new double[n];
		for(int i=0;i<n;i++) {
			arr[i]=4*i;
			if(arr[i]>z) {
				arr[i]=z;
				kk++;
			}
			System.out.print(arr[i]+"\t");
			System.out.print(kk+"\n");
		}
		
	}

}
