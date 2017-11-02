package inlämningsuppgift1.copy3;

public class Snake extends Animal
{
	
	
	public double getFoodWeight()
	{
		return 20;
	}
	public String getFoodType()
	{
		return "Snake food";
	}
	
	public Snake(String name, int weight) {
		super(name, weight);
		
	}

}
