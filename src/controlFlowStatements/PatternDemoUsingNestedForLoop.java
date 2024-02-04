package controlFlowStatements;

public class PatternDemoUsingNestedForLoop {

	public static void main(String[] args)
	{
		
		//logic: row--->column--->data
		
		//rows
		for(int r=1;r<=4;r++)
		{
			//columns
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			//next row
			System.out.println();
			
		}
		
		
		System.out.println("***********************");
		
		
		for(int r=1;r<=4;r++)
		{
				
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		
		
		
		//break and continue , return-Branching statements
		
		
		
		
		
		
		
		
		
		
		

	}

}
