package inlämningsuppgift1;

public class Dog extends Animal {

	
	public double getFoodWeight()
	{
		return Math.round(getWeight()*10);
	}
	public String getFoodType()
	{
		return "Dog food";
	}
	
	public Dog(String name, int weight) {
		super(name, weight);
		
	}
	

}
