package inlämningsuppgift2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person 
{
	private String name;
	private String personnummer;
		
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = (name.matches("^[A-Za-zÅÖÄåöä]+ [A-Za-zÅÖÄåöä]+$") ? name : null);
	}
	public String getPersonnummer()
	{
		return personnummer;
	}
	public void setPersonnummer(String personnummer)
	{
		this.personnummer = (personnummer.matches("^\\d{10}|\\d{12}$") ? personnummer : null);
	}
	
	public Person()
	{
		
	}
	
	public Person(String name, String personnummer)
	{
		this.name = (name.matches("^[A-Za-zÅÖÄåöä]+ [A-Za-zÅÖÄåöä]+$") ? name : null);
		this.personnummer = (personnummer.matches("^\\d{10}|\\d{12}$") ? personnummer : null);
		
	}
	
	@Override
	public String toString() {
		
		return String.format("Name: %s\nPersonnummer: %s", name, personnummer);
	}

}
