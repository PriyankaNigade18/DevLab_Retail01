package array_String_Demo;

public class MultiDArray {

	public static void main(String[] args)
	{
		// Using new keyword
		
		int sid[][]=new int[2][3];
		sid[0][0]=10;
		sid[0][1]=20;
		sid[0][2]=30;
		
		sid[1][0]=40;
		sid[1][1]=50;
		sid[1][2]=60;
		
		
		
		System.out.println("Number of rows: "+sid.length);//2
		System.out.println("Number of columns: "+sid[0].length);//3
		System.out.println(sid[1][1]);//50
		
		
		System.out.println("******** Nested For loop************");
		
		//row
		for(int r=0;r<sid.length;r++)
		{
			//cell
			for(int c=0;c<sid[r].length;c++)
			{
				System.out.print(sid[r][c]+"   ");
			}
			System.out.println();//next row
		}
		
		System.out.println("********************************");
		
		//using literal Multi D array
		
		int id[][]= {{10,20},{30,40},{50,60}};
		System.out.println("Number of rows: "+id.length);//3
		System.out.println("Number of Columns: "+id[0].length);//2
		
		System.out.println("************For each loop*************");
		
		for(int i[]:id)//i holds row
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("************************************");
		
		Object data[][]= {{"UserN","Password"},{"Admin","admin123"},{"Alisa","test123"},{"Dhruti","test12345"}};
		
		System.out.println("********for each loop*****************");
		for(Object i[]:data)
		{
			for(Object j:i)
			{
				System.out.print(j+"      ");
			}
			System.out.println();
			
		}
		
		
		System.out.println("********To skip the heading***********");
		
		
		for(int i=1;i<data.length;i++)
		{
			
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"     ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
