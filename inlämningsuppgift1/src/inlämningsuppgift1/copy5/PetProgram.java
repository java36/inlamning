package inlämningsuppgift1.copy5;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PetProgram extends JFrame
{
	private JComboBox box;
	private JButton button;
	private String[] animalNames = new String[5];
	private String[] messages = new String[5];
	private JLabel answer;
	
	public PetProgram()
	{
		super("Husdjurshotell");
		setLayout(new FlowLayout());
		
		
		HotelPets pets = new HotelPets();
		for(int i=0; i<pets.getPets().size();i++)
		{
			animalNames[i] = pets.getPets().get(i).getName();
			messages[i] = pets.getPets().get(i).getFoodWeight()+" gr of "+pets.getPets().get(i).getFoodType();
		}
		
		
		try
		{
			Object test = JOptionPane.showInputDialog(null, "Välj djur:", "Djurshotellet", JOptionPane.INFORMATION_MESSAGE, null, animalNames, animalNames[0]);
			String test2 = test.toString();
			System.out.println(test);
			
			for(int i=0; i < pets.getPets().size(); i++)
			{
				if(test2.equalsIgnoreCase(pets.getPets().get(i).getName()))
				{
					JOptionPane.showMessageDialog(null, pets.getPets().get(i).getFoodWeight()+" gr "+pets.getPets().get(i).getFoodType());
					break;
				}
				else if(i == pets.getPets().size()-1 && !(test2.equalsIgnoreCase(pets.getPets().get(i).getName())))
				{
					JOptionPane.showMessageDialog(null, "Djuret finns inte i husdjurshotellet");
				}
				
			}
		}
		
		catch(NullPointerException e)
		{
			System.exit(0);
		}
//		box = new JComboBox(animalNames);
//		add(box);
//		
//		button = new JButton("Enter");
//		add(button);
//		
//		EventHandler handler = new EventHandler();
//		box.addItemListener(handler);
//		button.addItemListener(handler);
		
		
		
		
		

		
		
		try
		{
			
			
		}
		catch(NullPointerException e)
		{
			System.exit(0);
		}
	
	}
	private class EventHandler implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
			
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				answer = new JLabel(messages[box.getSelectedIndex()]);
			}
			
		}
		
	}

}
