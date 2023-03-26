class Person1 {

    String имя;
    protected int возраст;
    public String адрес;
    protected String телефон;

    public Person1(String имя, int возраст, String адрес, String телефон){
        this.имя = имя;
        this.возраст = возраст;
        this.адрес = адрес;
        this.телефон = телефон;
    }
    public void вывестиИмя(){
        System.out.printf("имя: %s \n", имя); // Для форматирования аргумента, который является строкой
    }
    void вывестиВозраст(){
        System.out.printf("возраст: %d \n", возраст); // Для форматирования аргумента, который является десятичным целым числом
    }
    protected void вывестиАдрес(){
        System.out.printf("адрес: %s \n", адрес);
    }
    protected void вывестиТелефон(){
        System.out.printf("телефон: %s \n", телефон);
    }}