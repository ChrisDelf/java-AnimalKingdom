package animals;

public abstract class AbstractAnimals // use this to to give child objects methods
{
  // fields --> each animal must of have a unique id a name and a year discovered
  public String name;;
  public int yearDiscovered;
  public static int MaxId = 0;
  public int id;

// Contructor
public AbstractAnimals(String name, int yearDiscovered)
{
  MaxId++;
  this.id = MaxId;
  this.name = name;
  this.yearDiscovered = this.yearDiscovered;

}

//methods
 public String eatFood()
{
  return "Yum Crunch";
}
//abstract methods

public abstract String getMove();
public abstract String getBreath();
public abstract String reproduce();



}
