public class Main {
    public static void main(String args[]) {
        Game game1 = new Skyrim(30000000, 2011, "Skyrim");
        game1.present();

        System.out.println("-----------------------------");

        Game game2 = new Starcraft(184828323, 2010, "Starcraft");
        game2.present();
      }
}
