class Vehicle
{
	private String model;
	private int cc;

	public String getModel()
	{
		return model;
	}
	public int getCc()
	{
		return cc;
	}

	Vehicle()
	{

	} 
	Vehicle(String model,int cc)
	{
		this.model=model;
		this.cc=cc;

	}
}

	class Car extends Vehicle
	{
		private String colour;
		private double price;

		public String getColour()
		{
			return colour;
		}

		public double getPrice()
		{
			return price;
		}

		Car()
		{

		}
		Car(String colour,double price,String model,int cc)
		{
			super(model,cc);
			this.colour=colour;
			this.price=price;

		}
	}

	class Bike extends Vehicle
	
	{
		private String colour;
		private double price;

		public String getColour()
		{
			return colour;
		}

		public double getPrice()
		{
			return price;
		}

		Bike()
		{

		}
		Bike(String colour,double price,String model,int cc)
		{
			super(model,cc);
			this.colour=colour;
			this.price=price;
			
		}
	}

	class Maruti extends Car
	
	{
		String owner;
		long regno;

		Maruti(String owner,long regno,String colour,double price,String model,int cc)
		{
			super(colour,price,model,cc);
			this.owner=owner;
			this.regno=regno;
		}

		public void Display()
		{
			System.out.println("the owner is "+owner);
			System.out.println("the regno is "+regno);
			System.out.println("the colur is "+getColour());
			System.out.println("the price is "+getPrice());
			System.out.println("the model is "+getModel());
			System.out.println("the cc is "+getCc());
		}
	}

	class Nano extends Car
	
	{
		String owner;
		long regno;

		Nano(String owner,long regno,String colour,double price,String model,int cc)
		{
			super(colour,price,model,cc);
			this.owner=owner;
			this.regno=regno;
		}

		public void Display()
		{
			System.out.println("the owner is "+owner);
			System.out.println("the regno is "+regno);
			System.out.println("the colur is "+getColour());
			System.out.println("the price is "+getPrice());
			System.out.println("the model is "+getModel());
			System.out.println("the cc is "+getCc());
		}
	}

	class Tvs extends Bike
	
	{
		String owner;
		long regno;

		Tvs(String owner,long regno,String colour,double price,String model,int cc)
		{
			super(colour,price,model,cc);
			this.owner=owner;
			this.regno=regno;
		}

		public void Display()
		{
			System.out.println("the owner is "+owner);
			System.out.println("the regno is "+regno);
			System.out.println("the colur is "+getColour());
			System.out.println("the price is "+getPrice());
			System.out.println("the model is "+getModel());
			System.out.println("the cc is "+getCc());
		}
	}

	class Pulsor extends Bike
	{
		String owner;
		long regno;

		Pulsor(String owner,long regno,String colour,double price,String model,int cc)
		{
			super(colour,price,model,cc);
			this.owner=owner;
			this.regno=regno;
		}

		public void Display()
		{
			System.out.println("the owner is "+owner);
			System.out.println("the regno is "+regno);
			System.out.println("the colur is "+getColour());
			System.out.println("the price is "+getPrice());
			System.out.println("the model is "+getModel());
			System.out.println("the cc is "+getCc());
		}
	}

	class VehiclesMainDriver
	{
		public static void main(String[] args) 
		{
		
		System.out.println("the details :");
		System.out.println();	
		
		Maruti m=new Maruti("chutki",1000,"red",100000.656,"Maruti",111);
		m.Display();
		System.out.println("***********************************************");

		Nano n=new Nano("raju",1001,"yellow",200000.345,"Nano",112);
		n.Display();
		System.out.println("***********************************************");


		Tvs t=new Tvs("dolu",123,"blue",25000.543,"tvs",113);
		t.Display();
		System.out.println("***********************************************");


		Pulsor p=new Pulsor("bolu",123,"black",35000.6543,"pulsor",114);
		p.Display();
		System.out.println("***********************************************");


	}
}





