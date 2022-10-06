package AlgoritmUniversity;

public class MainFibanachi {
    public static void main(String[] args) {

        System.out.println(fibanashi2(10));
        System.out.println(fibanachi(10));
    }

    public static int fibanachi(int number){
        if(number <= 1){
            return number;
        }
        return fibanachi(number - 1) + fibanachi(number - 2);
    }
    public static int fibanashi2(int n){
        int k = 1;
        int b = 0;
        int d;
        for(int i = 1;i < n;++i){
            d = k;
            k = k + b;
            b = d;
        }
        return k;
    }
}
