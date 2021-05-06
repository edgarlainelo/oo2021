public class MyrunnableLetters implements Runnable {
    @Override
    public void run(){
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};

        for(int i = 0; i<11; i++){
            System.out.println("Thread 2: "+ letters[i]);

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread 2 is done!");
    }
}
