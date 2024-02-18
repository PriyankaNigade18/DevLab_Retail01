package array_String_Demo;

public class Primenumber {

	public static void main(String[] args)
	{
		int c=0;
		int num=27;
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				c++;
			}
			
		}
		if(c==2)
		{
		System.out.println(num+"Is prime number");	
		}
		else
		{
			System.out.println(num+"Is not a prime number");
		}

	}

}
