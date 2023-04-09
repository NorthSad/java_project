// Борисков Д.А.
package lec_12;
public class lec_12_2 {
    // Имя объекта (текстовое поле):
    String name;
    // Конструктор класса:
    lec_12_2(String name){
        this.name = name;}
    //Метод для отпбражения имени объекта:
    void show(){
        System.out.println("Объект с иминем \""+name+"\".");}
}
class MoreArgsDemo {
    //Статистический метод для изменения ссылки но объект:
    static void ChangeRef(lec_12_2 obj) {
        //Создаётся локальный объект:
        lec_12_2 tmp = new lec_12_2("Локальный Объект");
        obj = tmp;
        //Проверка имени объекта, на который ссылается аргумент:
        obj.show();}
    public static void main (String[] args){
        // Создание объекта:
        lec_12_2 obj = new lec_12_2("Основной Объект");
        //Поверка имени объекта:
        obj.show();
        //Попытка изменить ссылку на объекьт:
        ChangeRef(obj);
        //Проверка результата:
        obj.show();
    }
}
