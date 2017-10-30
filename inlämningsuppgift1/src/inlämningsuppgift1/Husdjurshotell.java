package inl‰mningsuppgift1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Husdjurshotell 
{
	public static void main(String[] args)
	{
		List<Animal> animals = new ArrayList<>();
		
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
		
		try
		{
			String input = JOptionPane.showInputDialog("Which animal is to be fed?");
			while(!input.matches("^[A-Za-z≈ƒ÷Â‰ˆ]+$"))
			{
				input = JOptionPane.showInputDialog("Error, Please enter the name again");
			}
			
			for(int i=0; i < animals.size(); i++)
			{
				if(input.equalsIgnoreCase(animals.get(i).getName()))
				{
					JOptionPane.showMessageDialog(null, animals.get(i).getFoodWeight()+" gr "+animals.get(i).getFoodType());
					break;
				}
				else if(i == animals.size()-1 && !(input.equalsIgnoreCase(animals.get(i).getName())))
				{
					JOptionPane.showMessageDialog(null, "Animal not found");
				}
				
			}
			
		}
		catch(NullPointerException e)
		{
			System.exit(0);
		}
	}

}
