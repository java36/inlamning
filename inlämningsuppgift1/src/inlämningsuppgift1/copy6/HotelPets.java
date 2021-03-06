package inlämningsuppgift1.copy6;

import java.util.ArrayList;
import java.util.List;

public class HotelPets 
{
	//Inkapsling
	private List<Animal> animals = new ArrayList<>();
	
	public HotelPets()
	{
		//Dynamisk bindning: Varje djur deklareras som en Animal. Det betyder att i compile time behandlas djuret 
		//som en variabel av typen Animal och i runtime blir den en Dog, Cat eller Snake.
		
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
	
	//getter
	public List<Animal> getPets()
	{
		return animals;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Animal a : animals)
		{
			s += a.getName()+"\n";
		}
		return  s;
	}

}
