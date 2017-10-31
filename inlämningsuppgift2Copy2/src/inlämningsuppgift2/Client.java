package inlämningsuppgift2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client extends Person
{
	
	private Date lastPayment;
	
	Date todayDate = new Date();
	Date lastYearDate = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public Client()
	{
		
	}
	
	public Client(String name, String personnummer, String lastPayment)
	{
		super(name, personnummer);
		
		try {
			this.lastPayment = (lastPayment.matches("^\\d{4}-\\d{2}-\\d{2}$") ? sdf.parse(lastPayment) : null);
		} 
		catch (ParseException e) {
			
			System.out.println("Wrong date format");;
		}
		
	}

	public String getLastPayment()
	{
		return sdf.format(lastPayment);
	}
	public void setLastPayment(String lastPayment)
	{
		try 
		{
			this.lastPayment = (lastPayment.matches("^\\d{4}-\\d{2}-\\d{2}$") ? sdf.parse(lastPayment) : null);
		} 
		catch (ParseException e) 
		{
			
			System.out.println("Wrong date format");;
		}
	}

	public String getMembershipStatus() {
		
		String membership = null;
		lastYearDate.setYear(todayDate.getYear()-1);
		
		if(lastPayment.before(todayDate) && lastPayment.after(lastYearDate))
			membership = "Member";
		else if(lastPayment.before(lastYearDate))
			membership = "Former Member";
		else if(getName() == null || getPersonnummer() == null || getLastPayment() == null)
			membership = "Not Member";
		
		return membership;
	}
	
	@Override
	public String toString() {
		
		return String.format("Name: %s\nPersonnummer: %s\nMembership Type: %s\nDate of last payment: %s", getName(), getPersonnummer(), getMembershipStatus(), sdf.format(lastPayment));
	}





}
