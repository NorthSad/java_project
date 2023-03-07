import java.util.Scanner;

public class z17_10 {
    public static int full(int x){
        int sum = 0;
        while (x>0){
            sum+= x%10;
            x= x/10;
        }
        return sum;
    }
        public static  void  main(String[] args){
            Scanner C = new Scanner(System.in);
            System.out.print("Введите число: ");
            int n = C.nextInt();
            System.out.println("Сумма цифр числа: "+full(n));
        }
}

