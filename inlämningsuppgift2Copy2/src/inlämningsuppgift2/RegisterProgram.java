package inlämningsuppgift2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class RegisterProgram 
{
	ClientList cl = new ClientList();
	
	public RegisterProgram()
	{		
		
		String input;
		int index;
		
		while(true)
		{
			try 
			{
				input = getUserInput();
				index = identifyClient(input);
				if(index >= 0 && index < cl.getClientList().size())
				{
					writeLog(cl.getClientList().get(index));
				}
				showClientInfo(index);
			}
			catch(NullPointerException e)
			{
				
				System.exit(0);
			} 	
		}
	}
	
	public String getUserInput()
	{	
		String input = "";
	
		input = JOptionPane.showInputDialog("Please enter name or 10-digit personnummer (e.g. 8108275192):");
		while(!input.matches("^[A-Za-zåäöÅÖÄ]+ [A-Za-zåäöÅÖÄ]+$|^[0-9]{10}$"))
		{
			input = JOptionPane.showInputDialog("Error. Please try again");
		}
		
		return input;
	}

	public int identifyClient(String input)
	{
		int index = 0;
		String[] nameArray = cl.getNameArray();
		String[] personnummerArray = cl.getPersonnummerArray();
				
		if(input.matches("^[A-Za-zåäöÅÖÄ]+ [A-Za-zåäöÅÖÄ]+$"))
		{
			for(int i=0; i<nameArray.length; i++)
			{
				if(input.equalsIgnoreCase((nameArray[i])))
				{
					index = i;
					break;
				}
				else if(input.equalsIgnoreCase("training coach"))
				{
					index = nameArray.length;
					break;
				}
				else if(i == nameArray.length-1 && !input.equalsIgnoreCase((nameArray[i])))
				{
					index = -1;
					break;
				}
			}
		}
		else if(input.matches("^[0-9]{10}$"))
		{
			for(int i=0; i<personnummerArray.length; i++)
			{
				if(input.equals(personnummerArray[i]))
				{
					index = i;
					break;
				}
				else if(i == personnummerArray.length-1 && !input.equals(personnummerArray[i]))
				{
					index = -1;
					break;
				}
			}
		}
		return index;
	}
	
	public void showClientInfo(int index)
	{
		if(index == -1)
		{
			JOptionPane.showMessageDialog(null, "Member not found");
		}
		else if(index >= 0 && index < cl.getClientList().size())
		{
			JOptionPane.showMessageDialog(null, cl.getClientList().get(index).toString());
		}
		else if(index == cl.getClientList().size())
		{
			Coach coach = new Coach();
		}
	}

	public void writeLog(Client c)
	{
		String log = "";
		BufferedWriter bw = null;
		Date date;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateAndTime;
		
		try 
		{
			bw = new BufferedWriter(new FileWriter("log.txt", true));
		} 
		catch (IOException e1) {
			
			e1.printStackTrace();
		}
					
		if(c.getMembershipStatus().equals("Member"))
			{
				date = new Date();
				dateAndTime = sdf.format(date);
				log = String.format("%s\t%s\t%s\t\n", dateAndTime,c.getName(),c.getPersonnummer());
						
			}
					
		if(log != null)
		{
			try {
				bw.append(log);
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
			log = null;					
		}
		try 
		{
			bw.close();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
