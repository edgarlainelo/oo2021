public class MyRunnableNums implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i < 11; i++){
            System.out.println("Thread 1: " +i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread 1 is done!");
    }
}
