public class Skyrim extends Game{
    private int sold;
    private int releaseYear;
    private String name;

    public Skyrim(int sold, int releaseYear, String name){
        this.sold = sold;
        this.releaseYear = releaseYear;
        this.name = name;
    }

    private int getSold(){
        return sold;
    }

    private int getReleaseYear(){
        return releaseYear;
    }

    private String getName(){
        return name;
    }

    public void present(){
        super.present();
        System.out.println("Name: " + getName() + ". Sold: " + getSold() + ". Release year: " + getReleaseYear());
    }

}
