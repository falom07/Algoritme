package AllTask.SixTask;

import java.time.Duration;
import java.time.Instant;

public class QuickSort {
    public static void quickSort(int [] array,int startIndex,int lastElement){//O(log * N)
        if(startIndex >= lastElement) return;

        int index = partition(array, startIndex, lastElement);

        quickSort(array, startIndex, index - 1);
        quickSort(array, index + 1, lastElement);


    }
    public static int partition(int [] array,int startIndex,int lastElement){
        int pivot = array[lastElement];
        int element = startIndex - 1;

        for(int i = startIndex;i < lastElement; ++ i){
            if(array[i] < pivot){
                element++;
                swap(array,element,i);
            }
        }
        ++element;
        swap(array,element,lastElement);
        return element;
    }
    public static void swap (int [] array,int first,int second){
        int keepFirst = array[first];
        array[first] = array[second];
        array[second] = keepFirst;
    }
    public static void seeQuickSort(int []array,int firstElement,int lastElement){
        Instant begin = Instant.now();
        quickSort(array,firstElement,lastElement);
        Instant last = Instant.now();
        Duration duration = Duration.between(begin,last);
        System.out.println("Быстрая сортировка " + duration.getNano()/1000);
        //for(int number : array){
        //    System.out.print(number + " ");
        //}
        //System.out.println();
    }

}
