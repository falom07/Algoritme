package AllTask.FiveTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст который нужно зашыфровать или разышфровать ");
        String text = scanner.next();
        System.out.println("Напишыте 'ДА' если вам нужно зашыфровать текст и 'НЕТ' если нужно расшыфровать");
        String encryptOrNo = scanner.next();
        if(encryptOrNo.equals("ДА")){
            encryptText(text);
        }else if (encryptOrNo.equals("НЕТ")){
            decipherText(text);
        }


    }
    public static void encryptText(String text){
        char []massiveWithElement = new char[text.length()];

        int key = 100;

        for(int i = 0;i < text.length();++i){
            massiveWithElement[i] = (char) (text.charAt(i) + key);
        }
        System.out.println(massiveWithElement);
    }
    public static void decipherText(String text){
        char []massiveWithElement = new char[text.length()];

        int key = 100;

        for(int i = 0;i < text.length();++i){
            massiveWithElement[i] = (char) (text.charAt(i) - key);
        }
        System.out.println(massiveWithElement);
    }
}
