package controlFlowStatements;

public class BranchingStatements
{

	public String show()
	{
		return "Hello All!";
	}
	public static void main(String[] args) 
	{

		System.out.println("Program started!");
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}

		System.out.println("Program ends!");
		
		System.out.println("*************************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip certain part of the code from execution
			}else
			{
				System.out.println(i);
			}
		}
		
		
		BranchingStatements b1=new BranchingStatements();
		String res=b1.show();
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
