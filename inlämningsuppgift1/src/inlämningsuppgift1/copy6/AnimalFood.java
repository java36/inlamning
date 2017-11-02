package inlämningsuppgift1.copy6;

public enum AnimalFood 
{
	HUNDFODER("Hundfoder"),
	KATTFODER("Kattfoder"),
	ORMPELLETS("Ormpellets");
	
	
	private String name;
	private AnimalFood(String name)
	{
		this.name= name;
		
		
	}
	
	public String getName()
	{
		return name;
	}
	

}
