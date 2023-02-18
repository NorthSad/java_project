import java.util.ArrayList;
import java.util.List;
public class wrapp {
    private static void doSomething(Object obj){
    }
    public static void main(String args[]){
        int i = 10;
        char c = 'a';
        //примитивы просты в использовании
        int j = i+3;
        //полиморфизм достигается с помощью классов-оболочек, мы не можем использовать примитивы здесь
        doSomething(new Character(c));

        List<Integer> list = new ArrayList<Integer>();
        //классы-оболочки могут быть использованы в коллекциях
        Integer in = new Integer(i);
        list.add(in);
        //Автоупаковка заботится о преобразовании примитива в соответственный класс-оболочку
        list.add(j);
        //классы-оболочки могут быть null
        in = null;
    }
}
