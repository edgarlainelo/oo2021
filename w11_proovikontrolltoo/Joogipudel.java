public class Joogipudel {
    int maht; //liitrites
    String puudelityyp;
    int maksumus;
    int pudelimass; //grammides
    Jook jook = new Jook("Vesi", 1, 1000);

    public void setPudel(int maht, String pudelityyp, int maksumus, int pudelimass){
        this.maht = maht;
        this.puudelityyp = pudelityyp;
        this.maksumus = maksumus;
        this.pudelimass = pudelimass;

    }

    //y = m/V -> m = V*y
    public int findMass(){
        if(jook != null){
            int m = (maht * jook.erikaal)*1000;
            int vastus = pudelimass + m;
            System.out.println("Joogipudeli mass koos joogiga on: " + vastus);
            return vastus;
        } else {
            System.out.println("Joogipudeli mass ilma jooki on: " + pudelimass);
            return pudelimass;
        }    
    }

    public void findOmahind(){
        if(jook != null){
            int vastus = jook.liitriOmahind + maksumus;
            System.out.println("Joogipudeli omahahind koos joogiga on: " + vastus);
        } else {
            System.out.println("Joogipudeli omahind joogita on: " + maksumus);
        }
    }
}
