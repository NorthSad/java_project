//Борисков Д.А.
package gl_8;
// Суперкласс:
class Ваse{
    // Текстовое поле суперкласса:
    String name;
    // Конструктор суперкласса:
    Ваse(String name){
        this.name=name;}
    // Метод для отображения значения поля:
    void show(){
        System.out.println("Объект суперкласса: "+name);}
    // Метод выводит приветствие:
    void sayHello(){
        System.out.println("Всем привет!");}
}
// Подкласс:
class SubВаse extends Ваse{
    // Символьное поле подкласса:
    char code;
    // Конструктор подкласса:
    SubВаse(String name,char code){
        super(name);
        this.code=code;}
    // Переопределение метода:
    void show(){
        System.out.println("Объект подкласса: "+name+". Код: "+code);}
}
public class SubRefDemo{
    public static void main(String[] args){
// Объектная переменная суперкласса:
        Ваse obj;
// Ссылка на объект суперкласса:
        obj=new Ваse("Базовый");
// Обращение к методам объекта суперкласса:
        obj.sayHello();
        obj.show();
// Ссылка на объект подкласса:
        obj=new SubВаse("Производный",'A');
// Обращение к методам объекта подкласса:
        obj.sayHello();
        obj.show();}
}
