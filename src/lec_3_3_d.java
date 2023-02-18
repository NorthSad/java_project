import java.util.Scanner;

public class lec_3_3_d {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Введите натуральное число q: ");
        int q = input.nextInt();
        System.out.println("Введите натуральное число w: ");
        int w = input.nextInt();
        System.out.println("Результат деления: " + q/w + ", статок деления: "+ q%w);
    }
}
