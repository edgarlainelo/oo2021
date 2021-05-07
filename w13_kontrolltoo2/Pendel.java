public class Pendel implements Runnable{
    private int pikkus;

    //võnkeperiood = 2 * Pi * sqrt(pikkus/9.8)

    public Pendel(int pikkus){
        this.pikkus = pikkus;
    }

    @Override
    public void run(){
        int vonk = (int) Math.round(2 * 3.14 * Math.sqrt(pikkus/9.8));

        for(int i = 0; i<11; i++){
            System.out.println("Thread 1: " + i);

            try{
                Thread.sleep(vonk);
            } catch(Exception e){
                System.out.println("Done");
            }
        }
    }


    
}
