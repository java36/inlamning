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
		return AnimalFood.ORMPELLETS.getName();
	}
	
	public Snake(String name, int weight) {
		super(name, weight);
		
	}

}
