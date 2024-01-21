package week1;

public class WrapperDemo {

	public static void main(String[] args) 
	{
		/*
		 * primitive data as object we use Wrapper class
		 */

		String s1="200";//string type
		System.out.println(s1+100);//100100
		//String type to int
		/*
		 * //NumberFormatException-When string data is not convertable
		 */
		int num=Integer.parseInt(s1);
		System.out.println(num+100);//200
		
		
		String s2="56.67";
		System.out.println(s2+11.11);//56.6711.11
		//string to double
		double d1=Double.parseDouble(s2);
		System.out.println(d1+11.11);//
		
		
		//int--->String   valueOf()
		
		int x=300;
		System.out.println(x+100);//400
		String ss1=String.valueOf(x);
		System.out.println(ss1+100);//300100
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
