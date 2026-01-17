package Q4;
import java.util.*;
class Fruit
{
	protected void func()
	{
		System.out.println("Fruit class protected method");
	}
}
public class Apple extends Fruit
{
	public static void main(String[] args)
	{
		System.out.println("Inside apple class. calling parent class protected method...");
		Fruit f = new Fruit();
		f.func();
	}
}
