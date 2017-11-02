package inlämningsuppgift1.copy4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		
		int ind = 0;
		HotelPets pets = new HotelPets();
		for(int i=0; i<pets.getPets().size();i++)
		{
			animalNames[i] = pets.getPets().get(i).getName();
			messages[i] = pets.getPets().get(i).getFoodWeight()+" gr of "+pets.getPets().get(i).getFoodType();
		}
		box = new JComboBox(animalNames);
		add(box);
		
		button = new JButton("Enter");
		add(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				answer = new JLabel(messages[box.getSelectedIndex()]);
				add(answer);
				
			}
			
			
		});
		
		
		
		
		
		

		
		
		try
		{
			
			
		}
		catch(NullPointerException e)
		{
			System.exit(0);
		}
	
	
		
	}

}
