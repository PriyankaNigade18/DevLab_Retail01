package array_String_Demo;

public class SingleDArray {

	public static void main(String[] args)
	{
		//using new keyword
		//declare
		int sid[]=new int[5];
		//initialize
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Total Elements in array: "+sid.length);//5
		//single data
		System.out.println(sid[3]);//104
		System.out.println(sid[1]);//default value int=0
		//for Wrong index=ArrayIndexOutOfBoundsException
		//System.out.println(sid[5]);ArrayIndexOutOfBoundsException
		
		System.out.println("done!");
		//iterate array print all the elements
		
		System.out.println("***********Simple for loop*************");
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("***********for each loop*************");
		
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		

		
		System.out.println("****************************");
		
		//using literal way(constant data)
		
		int id[]= {101,102,103,104};
		
		System.out.println("Size of array is: "+id.length);//4
		
		System.out.println(id[3]);//104
		
		System.out.println("Iterate");
		
		System.out.println("***********Simple for loop*************");

		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("***********For eaCH loop*************");

		
		for(int i:id)
		{
			System.out.println(i);
		}
		
		
		System.out.println("************************");
		
		String name[]= {"Jhon","Steve","Rit"};
		System.out.println("Total Elements are: "+name.length);
		System.out.println("***********Simple for loop*************");

		for(int i=0;i<name.length;i++)
		{
		System.out.println(name[i]);
		}
		
		System.out.println("***********for each loop*************");

		for(String i:name)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************************");
		
		int arr[]= {1,2,3};
		
		//print sum of these elements
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of Elements for Array: "+sum);
		
		double marks[]= {23.34,56.44,89.22};
		
		System.out.println("***********Simple for loop*************");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
			
		}
		
		System.out.println("***********For each loop*************");

		for(double i:marks)
		{
			System.out.println(i);
		}
		
		System.out.println("****************************");
		
		Object empdata[]= {"Sarang","pune",30,'M',9764335789L};
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
