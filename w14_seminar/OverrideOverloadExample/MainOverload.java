public class MainOverload {

    int sum(int x){
        return x;
    }

    
    int sum(int x, int y){
        return x + y;
    }

    
    int sum(int x, int y, int z){
        return x + y + z;
    }

    public static void main(String[] args){
        MainOverload main = new MainOverload();

        System.out.println(main.sum(5));
       
        System.out.println(main.sum(6, 7));
        
        System.out.println(main.sum(8, 9, 10));
    }
    
}
