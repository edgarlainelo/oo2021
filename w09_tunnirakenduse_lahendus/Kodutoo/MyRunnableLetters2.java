public class MyRunnableLetters2 implements Runnable {
    @Override
    public void run(){
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};

        for(int i = 10; i>=0; i--){
            System.out.println("Thread 4: "+ letters[i]);

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread 4 is done!");
    }
}
