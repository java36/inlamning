package inlämningsuppgift1.copy6;

public abstract class Animal implements FoodWeight
{
	//Inkapsling: instansvariabler deklareras som privat och andra klasser kan bara 
	//använda dem genom getters och setters
	private String name;
	private double weight;
	

	
	
	public Animal(String name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		return weight;
	}
	
	//Polymorphism: Metoden finns i alla djur som arvar från Animal men de returnerar olika data
	public String getFoodType()
	{
		return "mat";
	}
	
}
