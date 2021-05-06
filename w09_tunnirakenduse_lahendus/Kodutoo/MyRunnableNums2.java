public class MyRunnableNums2 implements Runnable{
    @Override
    public void run(){
        for(int i = 10; i > 0; i--){
            System.out.println("Thread 3: " +i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread 3 is done!");
    }
}
