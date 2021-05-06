public class ThreadKodutoo {

    public static void main(String[] args){
       
        MyRunnableNums runnableNums = new MyRunnableNums();
        Thread thread1 = new Thread(runnableNums);

        MyrunnableLetters runnableLetters = new MyrunnableLetters();
        Thread thread2 = new Thread(runnableLetters);

        MyRunnableNums2 runnableNums2 = new MyRunnableNums2();
        Thread thread3 = new Thread(runnableNums2);

        MyRunnableLetters2 runnableLetters2 = new MyRunnableLetters2();
        Thread thread4 = new Thread(runnableLetters2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
    }
}
