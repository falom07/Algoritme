package AllTask.TaskOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] massive = createMassive(); // вызываем метод по созданию массива
        takeElement(massive);


    }
    public static int[] createMassive(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество елементов которое должен содержать масиив ");
        int sizeOfMasive = scanner.nextInt();//запрашывем длинну массива

        int [] massive = new int [sizeOfMasive]; // создание массива
        for(int i = 0;i < sizeOfMasive;++i){
            int randomNumber = random.nextInt(-1000,1000);
            massive[i] = randomNumber;
        } // заполнение массива случайными числами
        Arrays.sort(massive);
        for(int i = 0;i <sizeOfMasive;++i){
            System.out.println((i + 1) + ") " + massive[i]);
        } // показываем весь массив

        return massive;
    }
    public static void takeElement(int [] massive){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число,индекс которого вы б хотели видеть ");
        int number = scanner.nextInt();// спаршываем число

        int index = Arrays.binarySearch(massive,number);// ищим елемент по индексу


        if(index >= 0){
            System.out.println("Елемент который вам нужен находится на позиции " + (index + 1));
        }else{
            System.out.println("В массиве нету такого елемента");
        }
        howMushSteep(massive.length);
        // выводим елемент на экран
    }// выводим елемент на экран
    public static void howMushSteep(int size){
        int next = 1;
        int previous = 0;

        while(true){
            int nextPow = (int) Math.pow(2,next);
            int previousPow = (int) Math.pow(2,previous);
            if(previousPow < size && size <= nextPow){
                break;
            }
            ++previous;
            ++next;
        }
        System.out.println("Количество шагов для того что бы найти число по нужному индексус составляет O(log n) или максимум " + next + " шагов");
    } // показывает количесво шагов

}
