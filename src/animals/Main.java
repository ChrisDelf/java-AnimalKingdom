package animals;

import java.util.*;

public class Main
{


 public static void main(String[] args)
 {


  //Constructor Mammal

    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccon", 1758);
    Mammal bigfoot = new Mammal("BigFoot", 2021);

// Construct Birds

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

//The fishies

    Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

ArrayList<AbstractAnimals> animalList = new ArrayList<>(); // adding the animals to the the array animalList

//Mammals
 animalList.add(panda);
 animalList.add(zebra);
 animalList.add(koala);
 animalList.add(sloth);
 animalList.add(armadillo);
 animalList.add(raccoon);
 animalList.add(bigfoot);

 //birds

 animalList.add(pigeon);
 animalList.add(peacock);
 animalList.add(toucan);
 animalList.add(parrot);
 animalList.add(swan);

//Fishies

 animalList.add(salmon);
 animalList.add(catfish);
 animalList.add(perch);

 // Sorting by year named using the lambdas

animalList.sort((o1, o2)-> o2.yearDiscovered - o1.yearDiscovered);
animalList.forEach((o) -> System.out.println("Name: " + o.name + " / " + "Year: " + o.yearDiscovered));
System.out.println();

 }

}
