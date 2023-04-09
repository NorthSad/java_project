package lec_12;
import javax.swing.*;
//Борисков Д.А.
class TheBig {
    // Текстовое поле внешнего класса:
    String name;
    // Поле внешнего класса - объектаная переменная внутреннего класса:
    TheSmall ID;

    TheBig(String name, int n) {
        // Значение тектового поля внешнего класса:
        this.name = name;
        // Создание объекта внутреннего класса:
        ID = new TheSmall(n);
        ID.show();}

    //Метод внешнего класса возвращает текстовую строку с именем объекта внешнего класса:
    String getName() {
        String txt = "Имя объекта:" + name + ".\n";
        return txt;}

    //Внутренний класс:
    class TheSmall {
        //Поле внутреннего класса - переменная массива:
        int[] code;

        //Конструктор внутреннего класса:
        TheSmall(int n) {
            // Создание массива:
            code = new int[n];
            // Заполнение массива случайными числами (от 0 до 9):
            for (int i = 0; i < code.length; i++)
                code[i] = (int) (10*Math.random());}

        // Метод внутреннего класса, он возвращает строку с кодом объекта внутреннего класаа:
        String getCode() {
            //Начальная строка:
            String txt = "Код объекта: |";
            //Формирование полного текста:
            for (int i =0;i<code.length; i++)
                txt+= code[i] +"|";
            //Результат:
            return txt;}

        // Метод для отображения сообщения с именем объекта внешнего класса и кодом объекта внутреннего класса:
        void show() {
            //Текстовая строка:
            String txt = getName() + getCode();
            //Отображение сообщения:
            JOptionPane.showMessageDialog(null, txt);}
    }
}
class lec_12_5 {
    public static void main(String[] args){
        //Анонимный объект внешнего класса:
        new TheBig(" БОЛЬШОЙ",7);
    }
}
