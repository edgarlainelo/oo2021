public abstract class Parent {
  public String name;
  public String dream;
  public int age;
  // mõelge kolmas välja

  public Parent(String name, String dream){
    this.name = name;
    this.dream = dream;
  }

  public void favouriteHobbyIs(String hobby){
    System.out.println(this.name + "'s favourite hobby is " + hobby);
  }

  public void firstThingIDo(){
    System.out.println("I brush my teeth");
  }

  public abstract void howISpendMyEvenings();
}

// Looge uus klass, mis extendib parentit
// kasutage super keywordi, kas konstruktoris
// või meetodis