package inlämningsuppgift2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Coach extends Person
{
	Scanner scan;
	String readFile = "";
	
	public Coach()
	{
		try
		{
			scan = new Scanner(new File("log.txt"));
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		while(scan.hasNext())
		{
			readFile += scan.nextLine()+"\n";
			
		}
		JOptionPane.showMessageDialog(null, readFile);
		
		
	}
}
