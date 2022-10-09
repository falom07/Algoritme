package AllTask.FourTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(check());
        System.out.println(check());
        System.out.println(check());
        System.out.println(check());
        System.out.println(check());
        System.out.println(check());
        System.out.println(check());
        System.out.println(check());
        System.out.println(check());
    }
    public static boolean check(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример :");
        String example = scanner.nextLine();
        int size = example.length();
        example += "...";
        int rideArcs = 0;
        int leftArcs = 0;
        for(int i = 0; i < size; ++i){
            String character = example.substring(i,i+1);
            String characterPrevious = "+";
            if(i == 0){
                characterPrevious = "+";
            }else{
                characterPrevious = example.substring(i-1,i);
            }
            String characterNext = example.substring(i+1,i+2);
            if(leftArcs < rideArcs){
                return false;
            }
            if(character.equals("(") ){
                ++leftArcs;
                if(characterPrevious.equals("-") || characterPrevious.equals("+") || characterPrevious.equals("/") || characterPrevious.equals("*")|| characterPrevious.equals("(") ){
                }else{
                    return false;
                }
                if (characterNext.equals("+") || characterNext.equals("/") || characterNext.equals("*") || characterNext.equals(")")){
                    return false;
                }
            }else if(character.equals(")")){
                ++rideArcs;
                if(characterPrevious.equals("-") || characterPrevious.equals("+") || characterPrevious.equals("/") || characterPrevious.equals("*")){
                    return false;
                }else if (characterNext.equals("+") || characterNext.equals("/") || characterNext.equals("*") || characterNext.equals("-") || characterNext.equals(".") || characterNext.equals(")")){
                }else{
                    return false;
                }
            }
        }
        if(leftArcs != rideArcs){
            return false;
        }else{
            return true;
        }
    }
}
