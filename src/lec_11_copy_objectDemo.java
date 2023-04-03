public class lec_11_copy_objectDemo {
    public static void main(String[] args) {
// Создание объектов:
        lec_11_copy_object objA = new lec_11_copy_object("Первый объект", 100);
        lec_11_copy_object objB = new lec_11_copy_object(objA);
// Отображение информации об объектах:
        objA.show();
        objB.show();
// Изменение второго объекта:
        objB.name = "Второй объект";
        objB.number = 200;
//Отображение информации об объектах:
        objA.show();
        objB.show();
// "Копирование" объекта:
        objA = objB.copy();
// Отображение информации об объектах:
        objA.show();
// Изменение второго объекта:
        objB.name = "Второй объект изменен!";
        objB.number = 300;
// Отображение информации об объектах:
        objA.show();
        objB.show();
    }
    static class lec_11_copy_object {
        // Текстовое поле класса:
        String name;
        // Числовое поле класса:
        int number;
        // Конструктор класса (два аргумента):
        lec_11_copy_object(String str, int num){
            name=str;
            number=num;}
        // Конструктор создания копии:
        lec_11_copy_object(lec_11_copy_object obj){
            name=obj.name;
            number=obj.number;}
        // Метод для создания копии объекта:
        lec_11_copy_object copy(){
// создание объекта копии:
//lec_11_copy_object tmp=new lec_11_copy_object(name,number);
            lec_11_copy_object tmp=new lec_11_copy_object(this);
// Возращение резкльтата:
            return tmp;}
        // Метод для вывлда информации об объекте:
        void show(){
            String text="Поля объекта:\n";
            text+="name: "+name+"\nnumber: "+number;
// Вывод на консоль:
            System.out.println(text);}
    }
}
