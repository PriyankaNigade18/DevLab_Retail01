package controlFlowStatements;

public class LoopDemo {

	public static void main(String[] args)
	{

		//for loop: Number of iterations are know use for loop
		//print Hello 10 time
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello");
		}

		
		System.out.println("*********************");
		
		//print  1 to 10 number
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("*********************");
		//print 10 to 1 numbers
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		
		//by default for loop condition always true
//		for(;;)
//		{
//			System.out.println("Hi");//infinite
//		}
		
		System.out.println("***************");
		
		//while loop- If number of iterations are not known then use while loop
		
		//Calculate sum of digits of number
		//num=123=  1+2+3= 6 
		
		int num=1234;
		int r,sum=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
			
		}
		
		System.out.println("for number 1234 Sum of digits are: "+sum);
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println("Welcome to loop control statement!");
			i++;
			
		}
		
		System.out.println("******************************");
		
		
		//do while= Exit control loop for one time iteration if condition fail we use 
		
		int x=1;
		do
		{
			System.out.println("Hello All!");
			x++;
		}while(x>5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
