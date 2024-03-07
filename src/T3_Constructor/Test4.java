package T3_Constructor;

public class Test4 {
	String model;
	String color;
	int speed;
	
	Test4(String model)
	{
		this.model = model;
		this.color = "흰색";
		this.speed = 200;
	}
	Test4(String model, String color)
	{
		this.model = model;
		this.color = color;
		this.speed = 200;
	}
	Test4(String model, String color, int speed)
	{
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
