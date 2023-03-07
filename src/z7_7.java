import java.util.*;
public class z7_7 {
    public static Scanner in=new Scanner(System.in);
    public static void main (String[] args) {
        int students, chears;
        System.out.println("Введите кол-во учеников:");
        students = in.nextInt();
        System.out.println("Введите кол-во стульев:");
        chears = in.nextInt();
        if (chears>=students)
            System.out.println("Ученикам есть где сесть.");
        else System.out.println("Ученикам не хватит мест.");
    }

}

