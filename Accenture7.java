import java.util.Scanner;
import java.util.Arrays;
class Accenture7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[N];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}

		if(N<=0)
		{

			System.out.println("-1");
		}
		else
		{

		String[] sarr=new String[arr.length*2];
		int index=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
            String[] temp = arr[i].split("_");  
            for (int j = 0; j < temp.length; j++) 
            {
                sarr[index++] = temp[j];             
            }
        }

		System.out.println(Arrays.toString(sarr));

        int max=0;
		for(int i=1;i<sarr.length;i+=2)
		{
			if(Integer.parseInt(sarr[i])>max)
			{
				max=Integer.parseInt(sarr[i]);
			}
		}
		System.out.println(max);
	}

 
	}
}