public class Pendel implements Runnable{
    private int pikkus;
    private int hammad;

    //võnkeperiood = 2 * Pi * sqrt(pikkus/9.8)

    public Pendel(int pikkus, int hammad){
        this.pikkus = pikkus;
        this.hammad = hammad;
    }

    @Override
    public void run(){
        int vonk = (int) Math.round(2 * 3.14 * Math.sqrt(pikkus/9.8))/10; //jagasin kuna oli vaja teisendada
        int poored = 0;
        System.out.println("Võnkeperiood on umbes: " + vonk + " sekundit");
        
        for(int i = 0; i<100; i++){
            System.out.println("Thread 1: " + i);
            System.out.println("Hammas tegi " + poored + " täis pööret");

            if(i / hammad == 0){ //Praegu see ei tööta
                poored += 1;      
            }
            

            try{
                
                Thread.sleep(vonk*1000); //korrutasin 1000 kuna oli vaja teisendada sekunditesse
            } catch(Exception e){
                System.out.println("Done");
            }

        }
    }


    
}
