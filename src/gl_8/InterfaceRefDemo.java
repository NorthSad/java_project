// Борисков Д.А.
package gl_8;
// Интерфейс:
interface Ваsе{
    // Метод объявлен в интерфейсе:
    void show();}
// Класс реализует интерфейс:
class А implements Ваsе{
    // Описание метода интерфейса:
    public void show(){
        System.out.println("Это метод класса A!");}
}
// Этот класс также реализует интерфейс:
class В implements Ваsе{
    // Описание метода интерфейса:
    public void show(){
        System.out.println("Это метод класса B!");}
}
public class InterfaceRefDemo {
    public static void main(String[] args){
// Интерфейсная переменная:
        Ваsе ref;
// Ссылка на объект первого класса:
        ref=new А();
// Вызов метода через интерфейсную переменную:
        ref.show();
// Ссылка на объект второго класса:
        ref=new В();
// Вызов того же метода через интерфейсную переменную:
        ref.show();}
}
