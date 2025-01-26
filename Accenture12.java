import java.util.Scanner;
class Accenture12
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner (System.in);
		int jarno=sc.nextInt();

		int chocoscount[]=new int[jarno];

		for(int i=0;i<chocoscount.length;i++)
		{
			chocoscount[i]=sc.nextInt();
		}

	        int sum_a=0;
			int sum_b=0;
			int sum_c=0; 
	    
	    for(int i=0;i<chocoscount.length;i++)
		{
			

			while(chocoscount[i]>0)
			{
				sum_a+=1;
				chocoscount[i]=chocoscount[i]-1;

				if(chocoscount[i]!=0)
				{
					sum_b+=1;
				    chocoscount[i]=chocoscount[i]-1;
				}	

				if(chocoscount[i]!=0)
				{
					sum_c+=1;
				    chocoscount[i]=chocoscount[i]-1;
				}
			}
			
		}
		    System.out.println(sum_a);
			
	}
	
}