import java.util.Scanner;

public class lec_3_3_b {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Введите первое число: ");
        int number1 = input.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("Сумма двух чисел равна: "+sum);
    }
}
