public class MainOverride
{
    public static void main(String args[]){
        LoomOverride loom = new LoomOverride();
        KalaOverride kala = new KalaOverride();

        loom.liikuma();
        kala.liikuma();

        //loom.sooma();
        //kala.sooma();
    }
}