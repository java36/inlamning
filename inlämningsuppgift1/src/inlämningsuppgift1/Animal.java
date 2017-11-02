package inlämningsuppgift1;

public abstract class Animal implements FoodWeight
{
	private String name;
	private double weight;
	
//	public abstract double getFoodWeight();
	public String getFoodType()
	{
		return "Animal food";
	}
	
	
	public Animal(String name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	public double getWeight()
	{
		return weight;
	}
	
	

}
