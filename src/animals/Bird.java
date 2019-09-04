package animals;

public class Bird extends AbstractAnimals

{
  public Bird(String name, int yearDiscovered)
  {
    super(name, yearDiscovered); // super is what we use to grab the field from the parents
  }
  //We are going ot have to override abstract methods
  // move, breath, reproduce

  @Override
  public String getMove()
  {
    return "Fly";
  }
  @Override
  public String getBreath()
  {
    return "Lungs";
  }
  @Override
  public String reproduce()
  {
    return "Eggs";
  }

}
