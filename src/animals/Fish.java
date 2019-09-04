package animals;

public class Fish extends AbstractAnimals

{
  public Fish(String name, int yearDiscovered)
  {
    super(name, yearDiscovered); // super is what we use to grab the field from the parents
  }
  //We are going ot have to override abstract methods
  // move, breath, reproduce

  @Override
  public String getMove()
  {
    return "Swim";
  }
  @Override
  public String getBreath()
  {
    return "Gills";
  }
  @Override
  public String reproduce()
  {
    return "Eggs";
  }

}
