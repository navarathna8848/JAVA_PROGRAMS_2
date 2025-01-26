class Ball
{
	private double radius;

	Ball()
	{

	}

	Ball(double radius)
	{
		this.radius=radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius=radius;
	}
}

class BasketBall extends Ball
{
	String colour1;
	double price1;

	BasketBall()
	{

	}

	BasketBall(String colour1,double price1,double radius)
	{
		super(radius);
		this.colour1=colour1;
		this.price1=price1;
	}

}

class TennisBall extends Ball
{
	String colour2;
	double price2;

	TennisBall()
	{

	}

	TennisBall(String colour2,double price2,double radius)
	{
		super(radius);
		this.colour2=colour2;
		this.price2=price2;
	}
}

class Bag
{
	Ball b;

	public void addBall(Ball b)
	{
		if(this.b==null)
		{
			this.b=b;
			System.out.println("ball is added successfully !!! ");
		}	
		
		else
		{
			System.out.println("the bag is full already ");
		}
	}

	public void removeBall()
	{
		if(this.b!=null)
		{
			this.b=null;
			System.out.println("ball is removed successfully !!! ");
		}
		else
		{
			System.out.println("the bag is already empty ");
		}

	}

	public void isEmpty()
	{
		if(this.b==null)
		{
			System.out.println("the bag is empty ");
		}
		else
		{
			System.out.println("the bag is full ");
		}

	}

	public void checkGame()
	{
		if(this.b instanceof TennisBall)
			{
				TennisBall tb=(TennisBall)b;
				System.out.println(tb.colour2);
				System.out.println(tb.price2);
				System.out.println(tb.getRadius());
			}
	
			else
			{
				BasketBall bb=(BasketBall)b;
				System.out.println(bb.colour1);
				System.out.println(bb.price1);
				System.out.println(bb.getRadius());
			}


	}
}

class UserInterface
{
	public static void main(String[] args) 
	{
		Bag bag=new Bag();

		boolean flag=true;

		while(flag)
		{

		System.out.println("-----------WELCOME TO OUR PLAYGROUND-------------");
		System.out.println("1.addball ");
		System.out.println("2.removeBall ");
		System.out.println("3.check ball ");
		System.out.println("4.check game ");
		System.out.println("5.exit ");
		System.out.println("-------------------------------------------------");

		java.util.Scanner sc=new java.util.Scanner(System.in);
		int ch=sc.nextInt();

		

		switch(ch)
		{
			case 1:
			{
				System.out.println("1.BasketBall");
				System.out.println("2.TennisBall");
				int choice=sc.nextInt();

				if(choice==1)
				{

				    bag.addBall(new BasketBall("brown",200.2d,202.2d));
				    break;
			       }

			       else
			       {
			           bag.addBall(new TennisBall("white",200.2d,202.2d));
				    break;

			       }

			}
			case 2:
			{
				bag.removeBall();
				break;
			}

			case 3:
			{
				bag.isEmpty();
				break;
			}
			case 4:
			{
				bag.checkGame();
				break;
			}
			case 5:
			{
				flag=false;
				break;

			}
			default:
			{
				System.out.println("invalid options ");

			}

		}


		}
		
	}
}