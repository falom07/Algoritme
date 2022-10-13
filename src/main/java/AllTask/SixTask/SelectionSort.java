package AllTask.SixTask;

import java.time.Duration;
import java.time.Instant;

public class SelectionSort {
    public static void selectionSort(int [] array){//O(N^2)
        for(int i = 0;i < array.length;++i){
            int min = i;
            for(int j = i + 1;j < array.length;++j){
                if(array[j] <array[min]){
                    min = j;
                }
            }
            swap(array,min,i);
        }

        }
        public static void swap(int []array,int min,int i){
        int keepNumber = array[i];
        array[i] = array[min];
        array[min] = keepNumber;
    }
    public static void seeSelectionSort(int []array){
        Instant begin = Instant.now();
        selectionSort(array);
        Instant last = Instant.now();
        Duration duration = Duration.between(begin,last);
        System.out.println("Сортировка выбором " + duration.getNano()/1000);
        //for(int number : array){
        //    System.out.print(number + " ");
        //}
        //System.out.println();
    }

}
