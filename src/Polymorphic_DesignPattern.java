class Car                                         // open-closed extensible cost effective project reference
	{
		private int year;
		private Engine engine;
		
		public Car(int theYear,Engine theEngine)
		{
			year=theYear;
			engine=theEngine;
		}
		public String toString()
		{
			return year + "--" +engine;
		}
		public Car(Car other)
		{
			year=other.year;
//			if(other.engine instanceof TurboEngine)
//				engine= new TurboEngine((TurboEngine)(other.engine));
//			else
//			engine= new Engine(other.engine);
			engine= other.engine.copy();               
		}
	}

class Engine
{
	public Engine() {}
	protected Engine(Engine other) {}
	public Engine copy()                                                  // making manual copy polymorphic method
	{
		//use reflection here to make a copy 
		return new Engine(this);
	}
	public String toString()
	{
		return getClass().getName() +":" + hashCode();
	}
}
class TurboEngine extends Engine
{
	public TurboEngine()
	{
		super();
	}
	public TurboEngine(TurboEngine other)
	{
		super(other);
	}
//	public Engine copy()
//	{
//		return new TurboEngine(this);
//	}
}
class PistonEngine extends Engine
{
	public PistonEngine()
	{
		super();
	}
	public PistonEngine(PistonEngine other)
	{
		super(other);
	}
//	public Engine copy()
//	{
//		return new PistonEngine(this);
//	}
}
public class Polymorphic_DesignPattern
{
	public static void main(String[] args) 
	{
		Car car1= new Car(2019, new PistonEngine());//Here we can change any class like TuroboEngine or Engine or PistionEngine no need of changing in car class
		System.out.println(car1); 
		Car car2=  new Car(car1);
		System.out.println(car2);
	}

}
