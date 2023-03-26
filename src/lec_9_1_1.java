public class lec_9_1_1 {
    public static void main(String[] args) {

        Person1 Катя = new Person1("Катя", 32, "пр.гагарина", "+7953 456 9876");
        Катя.вывестиИмя();
        Катя.вывестиВозраст();
        Катя.вывестиТелефон();
        Катя.вывестиАдрес();  // Исправлена ошибка, метод private, заменён на метод protected

        System.out.println(Катя.имя);
        System.out.println(Катя.адрес);
        System.out.println(Катя.возраст);
        System.out.println(Катя.телефон);   // Исправлена ошибка, метод private, заменён на метод protected
    }
}
