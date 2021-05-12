public class Main{
    public static void main(String args[]){

        Hammasrattas hammasrattas = new Hammasrattas(10);
        System.out.println(hammasrattas.hammad);
        Pendel pendel = new Pendel(100, hammasrattas.hammad);
        Thread thread = new Thread(pendel);
        //System.out.println(5%10);
        thread.start();

        

        
    }
}