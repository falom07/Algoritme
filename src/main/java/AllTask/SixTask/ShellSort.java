package AllTask.SixTask;

import javax.management.InstanceAlreadyExistsException;
import java.time.Duration;
import java.time.Instant;

public class ShellSort {
    public static void shellSort(int [] array){
        int step = array.length / 2;
        for(;step > 0;step = step / 2){
            for(int i = step;i < array.length;i++){
                for(int j = i;j >= step && array[j] < array[j-step];j -= step){
                    int keep = array[j];
                    array[j] = array[j -step];
                    array[j - step] = keep;
                }
            }
        }
    }
    public static void seeShellSort(int []array){
        Instant begin = Instant.now();
        shellSort(array);
        Instant finish = Instant.now();
        Duration duration = Duration.between(begin,finish);
        System.out.println("Shell sort " + duration.getNano()/1000);
        //for(int number : array){
        //    System.out.print(number + " ");
        //}
        //System.out.println();
    }
}
