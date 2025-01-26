class Vehicle 
{
	public void move()
	{
		System.out.println("vehicle is moving ");
	}
}

class Train extends Vehicle
{
	@Override

	public void move()
	{
		System.out.println("Train is chiku bukku ");
	}

}

class Auto extends Vehicle 
{

	@Override

	public void move()
	{
		System.out.println("Auto is moving ");
	}


}
class VehiMain
{
	public static void main(String[] args) 
	{
		Vehicle v;//generalized vehicle
		
		v=new Train();
		v.move();

		v=new Auto();
		v.move();
		
	}
}