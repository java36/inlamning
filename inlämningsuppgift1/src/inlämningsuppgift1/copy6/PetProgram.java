package inlämningsuppgift1.copy6;

import javax.swing.JOptionPane;

public class PetProgram 
{
	public PetProgram()
	{
		HotelPets pets = new HotelPets();
		
		try
		{
			String input = JOptionPane.showInputDialog("Välkommen\nVilket djur ska få mat?");
			while(!input.matches("^[A-Za-zÅÄÖåäö]+$"))
			{
				input = JOptionPane.showInputDialog("Ett fel uppstod. Försök igen");
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
					JOptionPane.showMessageDialog(null, "Djuret finns inte i husdjurshotellet");
				}
				
			}
			
		}
		catch(NullPointerException e)
		{
			System.exit(0);
		}
	
	}

}
