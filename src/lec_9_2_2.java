public class lec_9_2_2 {
    public static void main(String[] args){
        int[] myScores = {5, 5 ,4, 3, 2, 4};
        Error zd2 = new Error();
        zd2.setScores(myScores);
        zd2.displayScores();
        myScores[1] = 1;
        zd2.displayScores();
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
}}
