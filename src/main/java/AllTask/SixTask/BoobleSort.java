package AllTask.SixTask;

import java.time.Duration;
import java.time.Instant;

public class BoobleSort {
    public static void boobleSort(int [] massive){ // O(N^2) массив в масиве
        for(int i = massive.length -1;i > 1;--i){
            for(int j = 0; j < i ; ++ j){
                if(massive[j] > massive [j + 1]){
                    swap(j,j+1,massive);
                }
            }
        }
    }
    public static void swap(int first, int second, int [] massive){
        int temp = massive[first];
        massive[first] = massive[second];
        massive[second] = temp;
    }
    public static void seeBobleSort(int [] massive){
        Instant begin = Instant.now();
        boobleSort(massive);
        Instant finish = Instant.now();
        Duration duration = Duration.between(begin,finish);
        System.out.println("Пузырьковая сортировка " + duration.getNano()/1000);

        //for(int number : massive){
        //    System.out.print(number + " ");
        //}
        //System.out.println();
    }
}
