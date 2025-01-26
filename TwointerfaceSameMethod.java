interface I1
{
	default void m1()
	{
		System.out.println("m1 in I1 ");

	}
}
interface I2
{
	default void m1()
	{
		System.out.println("m1 in I2 ");
	}
}
class Child implements I1,I2
{
	@Override
	public void m1()
	{
		I1.super.m1();
		I2.super.m1();
		System.out.println("m1 in child class ");
	}
}
class TwointerfaceSameMethod
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.m1();
		
	}
}