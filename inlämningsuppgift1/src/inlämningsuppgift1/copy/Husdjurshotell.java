package inl‰mningsuppgift1.copy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Husdjurshotell 
{
	public static void main(String[] args)
	{
		HotelPets pets = new HotelPets();
		
//		pets.addPet(new Dog("sergio", 7));
		
		try
		{
			String input = JOptionPane.showInputDialog("Which animal is to be fed?");
			while(!input.matches("^[A-Za-z≈ƒ÷Â‰ˆ]+$"))
			{
				input = JOptionPane.showInputDialog("Error, Please enter the name again");
			}
			
			for(int i=0; i < pets.getPets().size(); i++)
			{
				if(input.equalsIgnoreCase(pets.getPets().get(i).getName()))
				{
					JOptionPane.showMessageDialog(null, pets.getPets().get(i).getFoodWeight()+" gr "+pets.getPets().get(i).getFoodType());
					break;
				}
				else if(i == pets.getPets().size()-1 && !(input.equalsIgnoreCase(pets.getPets().get(i).getName())))
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
