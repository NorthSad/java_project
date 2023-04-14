//Борисков Д.А.
package gl_8;
// Суперкласс с закрытыми членами:
class Вase{
    // Закрытое текстовое поле:
    private String name;
    // Закрытое числовое поле:
    private int number;
    // Конструктор суперкласса:
    Вase(String name,int number){
        this.name=name;
        this.number=number;
    }
    // Закрытый метод суперкласса:
    private void show(){
        System.out.println("Объект с именем "+name);}
    // Открытый метод суперкласса:
    void showAll(){
// Обращение к закрытому методу суперкласса:
        show();
// Обращение к закрытому полю суперкласса:
        System.out.println("Числовое поле объекта равно "+number);}
    // Открытый метод суперкласса:
    void setAll(String name,int number){
// Обращение к закрытым полям суперкласса:
        this.name=name;
        this.number=number;}
}
// Подкласс:
class SubВase extends Вase{
    // Конструктор подкласса:
    SubВase(String str,int num){
// Вызов конструктора суперкласса:
        super(str,num);
// Отображение закрытых "ненаследуемых" полей
// с помощью наследуемого открытого метода:
        showAll();}
}
public class PrivateDemo {
    public static void main(String[] args){
// Создание объекта подкласса:
        SubВase obj=new SubВase("НОВЫЙ",1);
// Изменение значений "несуществующих" полей объекта подкласса:
        obj.setAll("ТОТ ЖЕ САМЫЙ",2);
// Отображение значений "несуществующих" полей объекта подкласса:
        obj.showAll();}
}
