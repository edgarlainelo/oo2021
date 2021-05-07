public class Pendel implements Runnable{
    private int pikkus;

    //võnkeperiood = 2 * Pi * sqrt(pikkus/9.8)

    public Pendel(int pikkus){
        this.pikkus = pikkus;
    }

    @Override
    public void run(){
        int vonk = (int) Math.round(2 * 3.14 * Math.sqrt(pikkus/9.8))/10; //jagasin kuna oli vaja teisendada
        System.out.println("Võnkeperiood on umbes: " + vonk + " sekundit");
        
        for(int i = 0; i<11; i++){
            System.out.println("Thread 1: " + i);
            

            try{
                
                Thread.sleep(vonk*1000); //korrutasin 1000 kuna oli vaja teisendada sekunditesse
            } catch(Exception e){
                System.out.println("Done");
            }
        }
    }


    
}
