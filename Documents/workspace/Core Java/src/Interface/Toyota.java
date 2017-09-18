package Interface;

public abstract class Toyota implements Icar,Ientertainment {
	public void start()
	{
		System.out.println("Toyota Start");
	}
	public void stop()
	{
		System.out.println("Toyota stop");
	}
	public void turn()
	{
		System.out.println("Toyota turn");
	}
	final public void reverse()
	{
		System.out.println("Toyota reverse");
	}
	public void ac()
	{
		System.out.println("Air conditioning");
	}
	public void audio()
	{
		System.out.println("Toyota audio");
	}
	public void sound()
	{
		System.out.println("Toyota audio");
	}
}

