package AllTask.SixTask;

import java.time.Duration;
import java.time.Instant;

public class InsertionSort {
    public static void insertionSort(int [] array){
        for(int remember = 1;remember < array.length;++remember){

            int value = array[remember];
            int i = remember - 1;

            for(;i >= 0;--i){
                if(value < array[i]){
                    array[i + 1] = array[i];
                }else{
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
    public static void seeInsertionSort(int [] array){
        Instant begin = Instant.now();
        insertionSort(array);
        Instant finish = Instant.now();
        Duration duration = Duration.between(begin,finish);

        System.out.println("Сортировка вставками " + duration.getNano()/1000);
        //for(int number : array){
        //    System.out.print(number + " ");
        //}
        //System.out.println();
    }
}
