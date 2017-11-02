package inlämningsuppgift1.copy6;

public class Cat extends Animal
{
	
	public double getFoodWeight()
	{
		return Math.round(getWeight()*100/15);
	}
	
	@Override
	public String getFoodType()
	{
		return AnimalFood.KATTFODER.getName();
	}
	
	
	public Cat(String name, int weight) {
		super(name, weight);
		
	}

}
