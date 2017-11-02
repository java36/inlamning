package inl�mningsuppgift1.copy6;

import javax.swing.JOptionPane;

public class PetProgram 
{
	public PetProgram()
	{
		HotelPets pets = new HotelPets();
		
		try
		{
			String input = JOptionPane.showInputDialog("V�lkommen\nVilket djur ska f� mat?");
			while(!input.matches("^[A-Za-z������]+$"))
			{
				input = JOptionPane.showInputDialog("Ett fel uppstod. F�rs�k igen");
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
