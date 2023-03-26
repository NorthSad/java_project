public class Mode {
    public  static  void  main(String[] args){
        Dog jack = new Dog("Джек", 6, 15);
        String jackNames = jack.getNames();
        int jackAges = jack.getAges();
        int jackWeights = jack.getWeights();

        System.out.println("Кличка собаки: "+ jackNames);
        System.out.println("Сколько лет собаке: "+ jackAges);
        System.out.println("Сколько весит собака: "+ jackWeights);
    }
}
