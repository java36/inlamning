package inlämningsuppgift2;

import org.junit.Test;

import junit.framework.TestCase;

public class ClientListTest
{
	ClientList sut;
	
	@Test
	public void does_list_exist()
	{
		sut = new ClientList();
		
		TestCase.assertTrue(sut.getClientList() != null);
		TestCase.assertFalse(sut.getClientList() == null);
	}
	
	@Test
	public void test_list_content()
	{
		sut = new ClientList();
		
		TestCase.assertTrue(sut.getClientList().get(0).getName().equals("Alhambra Aromes"));
		TestCase.assertFalse(sut.getClientList().get(0).getName().equals("Bear Belle"));
		
		TestCase.assertTrue(sut.getClientList().get(5).getPersonnummer().equals("7911061234"));
		TestCase.assertFalse(sut.getClientList().get(5).getPersonnummer().equals("791106123"));
		
		TestCase.assertTrue(sut.getClientList().get(3).getMembershipStatus().equals("Member"));
		
		TestCase.assertTrue(sut.getClientList().get(7).getLastPayment().equals("2017-08-18"));
		
		TestCase.assertTrue(sut.getClientList().get(13).getName().equals("Nahema Ninsson"));
	}

}
