public class lec_2_2 {
    public static void main(String[] args) {

        System.out.println("Hello Java! или Здравствуй Java");
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
