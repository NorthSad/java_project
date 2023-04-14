import java.util.Scanner;

public class z14_6 {
    public static void main(String[] args) {
        Scanner C = new Scanner(System.in);
        System.out.print("Введите 27 числел (через пробел): ");
        int max = -999, min = 999, sr = 0, sum= 0;
        for (int i = 0; i < 27; i++){
            sr = C.nextInt();
                if (sr>max) {
                max = sr;
            }
            if (sr<min){
                min = sr;

            }
            sum= (sum + sr);
        }
        sum=sum/27;
        sr= (max+min)/2;
        System.out.println("Максимум: "+max+"\nМинимум: "+min);
        System.out.println("Среднее арифметическое максмума и минимума: "+sr);
        System.out.println("Среднее арифметическое всех чисел:  "+sum);
    }
}
