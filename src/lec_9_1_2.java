public class lec_9_1_2 {
    public static void main(String[] args) {

        Person2 kate = new Person2("Kate", 30);
        System.out.println(kate.getAge());      // 30
        kate.setAge(33);
        System.out.println(kate.getAge());      // 33
        kate.setAge(57);
        System.out.println(kate.getAge());      // 33
    }
}
