public class Main{
    public static void main(String args[]){

        Pendel pendel = new Pendel(100);
        Thread thread = new Thread(pendel);
        thread.start();
    }
}