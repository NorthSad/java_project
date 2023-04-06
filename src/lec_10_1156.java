// Борисков Д.А
//Найти минимальное, максимальное и среднее значение в массиве целых чисел.
import  java.util.Scanner;
public class lec_10_1156 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.print("Введите длинну массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите числа массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Введённый массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        // min
        int min = array[0];// создаём переменную и задаём ей нулевой элемент массива
        // ройдёмся по каждому элементу массива в поиске минимального
        for(int i=0;i<array.length;i++){
            if (min>array[i]){// Если элемент больше сдующего, то min принимает значение следющего элемента
                min = array[i];
            }
        }
        //Вывод минимального
        System.out.println("");
        System.out.print("Минимальное число: "+min);

        // max
        int max = array[0];// создаём переменную и задаём ей нулевой элемент массива
        // Пройдёмся по каждому элементу массива в поиске максимального
        for(int i=0;i<array.length;i++){
            if (max<array[i]){// Если элемент меньше сдующего, то mах принимает значение следющего элемента
                max = array[i];
            }
        }
        // Вывод максимального
        System.out.println("");
        System.out.print("Мксимальное число: "+max);

        //sr
        int sr = 0;// создаём переменную и приравневаем к нулю
        // Проходимся по всей длинне массива
        for(int i=0; i<array.length;i++){
            sr+=array[i]/array.length;//Делим сумму всех чисел массива на его длинну
        }
        //Вывод среднего
        System.out.println("");
        System.out.print("Среднее значение: "+sr);
    }
}

