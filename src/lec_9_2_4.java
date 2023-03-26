public class lec_9_2_4{
    public static  void main(String[] args){
        Person a = new Person("Egor");
        Person b = new Person("Ivan");
        System.out.println(a.getFriend());
        a.setFriend(b);
        System.out.println(a.getFriend());
        System.out.println(b.getFriend());
    }
}
class Person {
        private String name;
        private Person friend;
    public Person(String name) {
            this.name = name;
        }
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public String toString () {
            return name;
        }
        public Object clone () {
            return new Person(name);
        }
        public void setFriend(Person friend) {
            this.friend = (Person) friend.clone();
        }
        public Person getFriend() {
            return (Person) this.clone();
        }
}