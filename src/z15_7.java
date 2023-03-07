import java.util.Scanner;

public class z15_7 {
    public static  void  main(String[] args){
        java.util.Scanner C = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a=0;
        while (a!=123){
            a = C.nextInt();
            if (a!=123)
                System.out.println("Код неверный, повторите ввод.");
            else
                System.out.println("Код принят");
        }
    }
}
