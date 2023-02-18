import java.util.Scanner;

public class lec_3_3_c {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Введите трёхзначное число: ");
        int n = input.nextInt();
        System.out.println("Сумма цифр числа " + n +" равна "+((n%10)+((n/10)%10)+(n/100)));
    }
}
