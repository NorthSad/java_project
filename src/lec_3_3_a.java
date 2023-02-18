import java.util.Scanner;

public class lec_3_3_a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Пожалуйста, введите ваше имя: ");
        String name = input.next();
        System.out.println("-----------------");
        System.out.println("Hello\n"+name);
    }
}
