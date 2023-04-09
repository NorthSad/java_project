package lec_12;
//Борисков Д.А.
import javax.swing.*;
public class lec_12_4 {
    public static void main(String[] args){
        new MyClass(12).show();// Создаётся анонимный объект класса MyClass
        AObjDemo.show(new MyClass(24));// Применяется статистический метод show()
    }
}
class MyClass{
    int[] nums;
    MyClass(int n){
        nums=new int[n];
        for(int i=0;i<nums.length;i++)
            nums[i]=i+1;}
    void show(){
        String text="Натуральные числа:\n";
        for(int i=0;i<nums.length;i++)
            text+=nums[i]+" ";
        JOptionPane.showMessageDialog(null,text);
    }
}
class AObjDemo{
    static void show(MyClass obj){
        String text="Элемента массива:\n";
        int n = (int) Math.ceil(Math.sqrt(obj.nums.length));
        for (int i=0;i<obj.nums.length-1;i++){
            text +=obj.nums[i]+((i+1)%n==0? ">> дальше\n" : " : ");
        }
        text +=obj.nums[obj.nums.length-1]+ ". конец";
        JOptionPane.showMessageDialog(null, text);
    }
}