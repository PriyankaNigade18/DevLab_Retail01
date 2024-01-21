package week1;

public class TypeCasting 
{

	
	public static void main(String[] args) 
	{
		//Primitive to primitive 
		/*
		 * implicit
		 * ------------
		 * Smaller size data into larger size
		 * automatic conversion --JVM
		 * byte-->short-->char-->int-->long-->float-->double
		 */
		char c1='A';
		int x=c1;
		
		System.out.println("char to int: "+x);//65
		
		int y=89;//4byte
		float d1=y;//4byte
		System.out.println("int to float: "+d1);//89.0
		
		
		/*
		 * Explicit
		 * ------------
		 * larger size data into smaller size
		 * manual conversion 
		 *double-->float-->long-->int-->char-->short-->byte
		 * 
		 * In explicit casting operator (data type)
		 */
		
		long l1=7878890009998L;//8byte
		int a=(int)l1;//4byte
		System.out.println("long to int data is: "+a);
		
		int b=100;//4byte
		char c2=(char) b;//2byte
		System.out.println("int to char: "+c2);
		
		
		float f2=56.78F;
		int c=(int) f2;
		System.out.println("float to int: "+c);
		
		
		
		


	}

}
