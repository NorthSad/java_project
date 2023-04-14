import java.util.Scanner;

public class z8_11 {
    public static Scanner in=new Scanner(System.in);
    public static void main (String[] args) {
        int students, chears;
        System.out.println("Введите кол-во учеников:");
        students = in.nextInt();
        System.out.println("Введите кол-во стульев:");
        chears = in.nextInt();
        if (chears==students)
            System.out.println("Ученикам есть где сесть.");
        if (chears>students)
            System.out.println("Кол-во лишних стульев: "+(chears-students));
        if (chears<students)
            System.out.println("Кол-во нехватающих стульев: "+(students-chears));
    }

}
