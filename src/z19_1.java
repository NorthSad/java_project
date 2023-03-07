public class z19_1 {
    public static  void main(String[] args){
        System.out.println(makenumber(4, 0));
    }
        public static int makenumber(int n, int k){
            int num = 0;
            int i = 0;
            System.out.printf("num = %d | i = %d\n", num, i);
            while (i<=n){
                num = num*10+k;
                i = i+1;
                System.out.printf("num = %d | i = %d\n", num, i);
            }
            return num;
    }
}
