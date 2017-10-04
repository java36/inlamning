package inlämningsuppgift1.copy6;

public class Snake extends Animal
{
	
	
	public double getFoodWeight()
	{
		return 20;
	}
	
	@Override
	public String getFoodType()
	{
		return "ormpellets";
	}
	
	public Snake(String name, int weight) {
		super(name, weight);
		
	}

}
