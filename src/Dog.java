public class Dog {
    private String names;
    private int ages;
    private int weights;
    public Dog(String names, int ages, int weights) {
        this.names = names;
        this.ages = ages;
        this.weights = weights;
    }
    public Dog() {
    }
    public void sayGav() {
        System.out.println("Гав-гав!");
    }
    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }
    public int getAges() {
        return  ages;
    }
    public void setAges(int ages) {
        this.ages = ages;
    }
    public  int getWeights(){
        return  weights;
    }
    public  void  setWeights(int weights){
        this.weights = weights;
    }
}
