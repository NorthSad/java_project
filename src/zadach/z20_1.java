import java.util. Scanner;
public class z20_1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 7;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число в массив: ");
            a[i] = reader.nextInt();
        }
        int[] b = newMassive(a);
        System.out.println("Количество отрицательных чисел в массиве: " + b[0]);
        System.out.println("Количество положительных чисел в массиве: " + b[1]);
        System.out.println("Количество нулей в массиве: " + b[2]);
    }
    public static int[] newMassive(int[] x) {
        int n = 3;
        int[] massive = new int[n];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) massive[0]++;
            if (x[i] > 0) massive[1]++;
            if (x[i] == 0) massive[2]++;
        }
        return massive;
    }
}
