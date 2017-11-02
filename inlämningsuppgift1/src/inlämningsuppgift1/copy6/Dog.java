package inlämningsuppgift1.copy6;

public class Dog extends Animal {

	
	public double getFoodWeight()
	{
		return Math.round(getWeight()*10);
	}
	
	@Override
	public String getFoodType()
	{
		return AnimalFood.HUNDFODER.getName();
	}
	
	public Dog(String name, int weight) {
		super(name, weight);
		
	}
	

}
