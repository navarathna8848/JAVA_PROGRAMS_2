import java.util.Scanner;

class ThreeMarks
{
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);

		System.out.println("Enter the mark1:");
		int mark1=a.nextInt();

		System.out.println("Enter the mark2:");
		int mark2=a.nextInt();

		System.out.println("Enter the mark3:");
		int mark3=a.nextInt();

		int avg=(mark1+mark2+mark3)/3;

		System.out.println("Average of three marks:"+avg);
 
	}
	
}