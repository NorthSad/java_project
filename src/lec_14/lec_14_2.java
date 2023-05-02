package lec_14;
// Борисков Д.А.
// Интерфейс для печати
interface Printable {
    void print();
}

// Класс Book, который реализует интерфейс для печати
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Книга: " + title);
    }

    public String getTitle() {
        return title;
    }
}

// Класс Magazine, который реализует интерфейс для печати
class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Журнал: " + title);
    }

    public String getTitle() {
        return title;
    }

    // Статический метод для печати только названий журналов
    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println("Журнал: " + ((Magazine) printable).getTitle());
            }
        }
    }
}

// Статический метод для печати только названий книг
class BookUtils {
    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println("Книга: " + ((Book) printable).getTitle());
            }
        }
    }
}

public class lec_14_2 {
    public static void main(String[] args) {
        // Массив, содержащий книги и журналы
        Printable[] printables = new Printable[4];
        printables[0] = new Book("Безмолвие");
        printables[1] = new Magazine("National Geographic");
        printables[2] = new Book("Гарри Поттер и Орден Феникса");
        printables[3] = new Magazine("Playboy");

        // Цикл по массиву и вызов метода print()
        for (Printable printable : printables) {
            printable.print();
        }

        // Вызов статических методов для печати только названий книг и журналов
        BookUtils.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
