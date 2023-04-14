public class z18_1 {
    public static  void  main(String[] args){
        int n = 5;
        int [] a = new int[n];
        for (int i=0; i<n; i++){
            a[i]=i*(i+1);
            System.out.printf("a[%d] = %d\n",i,a[i]);
        }

    }
}
