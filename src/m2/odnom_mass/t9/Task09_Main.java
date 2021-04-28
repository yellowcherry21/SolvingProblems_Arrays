//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них

package m2.odnom_mass.t9;

public class Task09_Main {

	public static void main(String[] args) {
		int N;
		int mass[]= {5,3,3,6,2,2,2,1,1};
		N=mass.length;
		int list[]=new int[N];
		
		for(int i=0;i<N;i++) {
			System.out.print(mass[i]+"\t");
		}
		System.out.println();
		
		int len=0, maxcount=1;
		 for (int i=0; i<N; i++) {// Перебираем все элементы массива.
		     int count=0; // Счетчик в 0.      
		       for (int j=i; j<N; j++) // Перебираем все элементы от i до конца.
		        if (mass[i] == mass[j]) count++;// Если элемент [i] совпадает с одним из последующих [j],
		                                        // то увеличиваем значение счетчика.
		        if (count==maxcount){ // Если очередное число встречается maxcount раз, 
                    list[len]=i; // То занесём его в список.
		            len++;
		        } // Увеличиваем значение переменной.
		        if (count>maxcount) { // Если число больше максимального,
		           maxcount=count; // тогда оно максимальное.
		           // =1 Присаваеиваем элемент массива в новую переменную             
		           len=1; // Разрушаем прежний список...
		           list[0]=i; } // и формируем новый.
		    }
		 for(int i=0; i<len; i++) {
			 System.out.println( mass[list[i]]); 
		}
	}

}
