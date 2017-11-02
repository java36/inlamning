package inlämningsuppgift2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientList {
	
	private List<Client> clientList = new ArrayList<>();
	
	public ClientList()
	{	
		String fileInfo = fileRead();
		clientListMaker(fileInfo);
	}
	
	public String fileRead()
	{
		String input = "";
		
		Scanner scan = null;
		try {
			scan = new Scanner(new File("customers.txt"));
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		scan.useDelimiter(", |\\R");
		
		
		while(scan.hasNext())
		{
			input += scan.next()+"\n";			
		}
		return input;
	}
	
	public void clientListMaker(String input)
	{
		Scanner scan = new Scanner(input);
		
		do
		{
			Client client = new Client();
			client.setPersonnummer(scan.nextLine());
			client.setName(scan.nextLine());
			client.setLastPayment(scan.nextLine());
			clientList.add(client);
		}while(scan.hasNext());
		
		
		scan.close();
	}
	public List<Client> getClientList()
	{
		return clientList;
	}
	
	public String[] getNameArray()
	{
		String[] nameArray = new String[clientList.size()];
		
		for(int i=0; i<nameArray.length; i++)
		{
			nameArray[i] = clientList.get(i).getName();
		}
		return nameArray;
	}
	public String[] getPersonnummerArray()
	{
		String[] personnummerArray = new String[clientList.size()];
		
		for(int i=0; i<personnummerArray.length; i++)
		{
			personnummerArray[i] = clientList.get(i).getPersonnummer();
		}
		return personnummerArray;
	}
	
	

}
