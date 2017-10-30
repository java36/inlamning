package inlämningsuppgift1.copy3;

public class Cat extends Animal
{
	
	public double getFoodWeight()
	{
		return Math.round(getWeight()*100/15);
	}
	public String getFoodType()
	{
		return "Cat food";
	}
	
	
	public Cat(String name, int weight) {
		super(name, weight);
		
	}

}
