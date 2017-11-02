package inlämningsuppgift2;

import java.io.PrintWriter;
import java.text.ParseException;

import org.junit.Test;

import junit.framework.TestCase;

public class ClientTest 
{
Client sut;
	
	@Test
	public void check_name() 
	{
		sut = new Client("John Stones","8010121234", "2017-10-12");
		
		TestCase.assertTrue(sut.getName() == "John Stones");
		TestCase.assertFalse(sut.getName() == "John Bones");
		
		sut = new Client("JohnStones","8010121234", "2017-10-12");		
		
		TestCase.assertTrue(sut.getName() == null);
		
		sut = new Client("John   Stones","8010121234", "2017-10-12");
			
		TestCase.assertTrue(sut.getName() == null);
		
		sut = new Client("John S6ones","8010121234", "2017-10-12");		
		
		TestCase.assertTrue(sut.getName() == null);
		
		
	}
	
	@Test
	public void check_personnummer()
	{
		sut = new Client("John Stones","8010121234", "2017-10-12");
		
		TestCase.assertTrue(sut.getPersonnummer() == "8010121234");
		TestCase.assertFalse(sut.getPersonnummer() == "9010121234");
		
		sut = new Client("John Stones","801012124343", "2017-10-12");
		TestCase.assertFalse(sut.getPersonnummer() == null);
		
		sut = new Client("John Stones","8011y212412", "2017-10-12");
		TestCase.assertTrue(sut.getPersonnummer() == null);
		
		
	}
	
	@Test
	public void check_lastPayment()  
	{
		sut = new Client("John Stones","8010121234", "2017-10-12");
		
		TestCase.assertTrue(sut.getLastPayment().equals("2017-10-12"));
		TestCase.assertFalse(sut.getLastPayment().equals("12-10-2017"));
		
		sut = new Client("John Stones","8010121234", "12-10-2017");
		
		try {
			TestCase.assertFalse(sut.getLastPayment().equals("15-10-2017"));
			
		}
		catch(NullPointerException e)
		{
			System.out.println("date is null");
		}
	}
	
	@Test
	public void check_membershipStatus() 
	{
		sut = new Client("John Stones","8010121234", "2017-10-12");
		
		TestCase.assertTrue(sut.getMembershipStatus().equals("Member"));
		TestCase.assertFalse(sut.getMembershipStatus().equals("Former Member"));
		
		sut = new Client("John Stones","8010121234", "2015-10-12");
		TestCase.assertFalse(sut.getMembershipStatus().equals("Member"));
		TestCase.assertTrue(sut.getMembershipStatus().equals("Former Member"));
		
		sut = new Client("John Stones","8010121234", "12.10.2017");
	
		try 
		{
		TestCase.assertTrue(sut.getMembershipStatus().equals("Not Member"));
		TestCase.assertFalse(sut.getMembershipStatus().equals("Member"));
		}
		catch(NullPointerException e)
		{
			System.out.println("the date is null");
		}
		
		sut = new Client("John Stones","8010121234", "12.10.2017");
		
		try 
		{
		TestCase.assertTrue(sut.getMembershipStatus().equals("Not Member"));
		TestCase.assertFalse(sut.getMembershipStatus().equals("Member"));
		}
		catch(NullPointerException e)
		{
			System.out.println("the date is null");
		}
	}

}
