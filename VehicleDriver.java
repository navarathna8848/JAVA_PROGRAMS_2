class Vehicle
{
	int model;
	Vehicle()
	{

	}
	Vehicle(int model)
	{
		this.model=model;
	}
}

class Car extends Vehicle
{
	int no_of_doors;
	String brand;
	double price;

	public Car(int no_of_doors,String brand,double price,int model)
	{
		super(model);
		this.no_of_doors=no_of_doors;
		this.brand=brand;
		this.price=price;

	}
}

class Ecar extends Car
{
	int battery_level;
	public Ecar(int no_of_doors,String brand,double price,int battery_level,int model)
	{
		super(no_of_doors,brand,price,model);
		this.battery_level=battery_level;
	}

	public void Display()
	{
		System.out.println("the no of doors is :"+no_of_doors);
		System.out.println("the brand is :"+brand);
		System.out.println("the price is :"+price);
		System.out.println("the battery_level is :"+battery_level);
		System.out.println("the model is :"+model);
	}
}

class VehicleDriver
{
	public static void main(String[] args) 
	{
		Ecar ec=new Ecar(4,"toyoto",100000.89,88,2026);
		ec.Display();


	}
}