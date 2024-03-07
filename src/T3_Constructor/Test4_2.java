package T3_Constructor;

public class Test4_2 {
	String model;
	String color;
	int speed;
	
	Test4_2(String model)
	{
		this(model, "흰색", 250);
	}
	Test4_2(String model, String color)
	{
		this(model, color, 250);
	}
	Test4_2(String model, String color, int speed)
	{
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
