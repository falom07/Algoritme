package AllTask.SixTask;

import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 100;
        int [] massive1 = new int[size];
        int [] massive2 = new int[size];
        int [] massive3 = new int[size];
        int [] massive4 = new int[size];
        int [] massive5 = new int[size];
        int [] massive6 = new int[size];
        for(int i = 0;i<size;++i){
            Random random = new Random();
            int element = random.nextInt(100);
            massive1[i] = element;
            massive2[i] = element;
            massive3[i] = element;
            massive4[i] = element;
            massive5[i] = element;
            massive6[i] = element;
        }


        BoobleSort.seeBobleSort(massive1); // первая сортировка пузырьковая сортировка
        QuickSort.seeQuickSort(massive2,0,massive2.length - 1);// вторая сортировка быстрая сортировка
        SelectionSort.seeSelectionSort(massive3);// третья сортировка сортировка выбором
        InsertionSort.insertionSort(massive4);//четвертая сортировка сортировка вставками
        ShellSort.seeShellSort(massive5);//пятая сортировка сортировка Шелла


    }
}
