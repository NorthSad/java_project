public class lec_9_2_3 {
    public static void main(String[] args){
        int[] myScores2 = {5, 5, 4, 3, 2, 4};
        Error zd3 = new Error();
        zd3.setScores(myScores2);
        zd3.displayScores();
        int[] copyScores = zd3.getScores();
        copyScores[1] = 1;
        zd3.displayScores();
    }
    static class Error{
        private int[] scores;
        public void setScores(int[] scores){
            this.scores = new int[scores.length];
            System.arraycopy(scores, 0, this.scores, 0, scores.length);
        }
        public void displayScores(){
            for (int number : scores){
                System.out.print(number+" ");
            }
            System.out.println();
        }
        public int [] getScores(){
            int[] copyScores = new int[scores.length];
            System.arraycopy(scores, 0, copyScores, 0, copyScores.length);
            return copyScores;
        }
    }
}
