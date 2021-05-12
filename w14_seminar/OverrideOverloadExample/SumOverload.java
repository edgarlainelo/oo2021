public class SumOverload {

    public int sum(int x){
        return x;
    }

    @Overload
    public int sum(int x, int y){
        return x + y;
    }

    @Overload
    public int sum(int x, int y, int z){
        return x + y + z;
    }
}
