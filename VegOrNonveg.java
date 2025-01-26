import java.util.Scanner;
class VegOrNonveg
{
	
	public static void main(String[] args)
	
	 {
		Scanner a=new Scanner(System.in);

		System.out.println("veg or non-veg:");
		String choice=a.next();

		String res = choice.equals("veg")? "panneer is on the way" : "chicken biriyani is on the way";

			System.out.println(res);

	}

}