package inlämningsuppgift1.copy.copy;

import java.util.ArrayList;
import java.util.List;

public class HotelPets 
{
	private List<Animal> animals = new ArrayList<>();
	
	public HotelPets()
	{
		Animal sixten = new Dog("Sixten",5);
		animals.add(sixten);
		Animal dogge = new Dog("Dogge",10);
		animals.add(dogge);
		Animal venus = new Cat("Venus",5);
		animals.add(venus);
		Animal ove = new Cat("Ove",3);
		animals.add(ove);
		Animal hypno = new Snake("Hypno",1);
		animals.add(hypno);		
	}
	
	public void addPet(Animal animal)
	{
		animals.add(animal);
	}
	public void removePet(Animal animal)
	{
		animals.remove(animal);
	}
	public List<Animal> getPets()
	{
		return animals;
	}


}
