package week1;

public class DatatypesDemo 
{

	public static void main(String[] args) 
	{
		//boolean 1bit true / false
		
		boolean status=true;
		System.out.println("boolean data is: "+status);
		
		status=false;
		System.out.println("updated boolean data is: "+status);
		
		boolean newstatus=false;
		System.out.println("new boolean data is: "+newstatus);
		
		System.out.println("*****************************");
		
		/*
		 * character data type
		 * ------------------------
		 *  2byte
		 *  1.single character
		 *  2.store special character
		 *  3.store unicode/ASCII value of character
		 *  
		 *  A-Z =65 to 90
		 *  a-z =97 to 122
		 *  0 to 9 =48 to 57
		 */
		
		
		char c1='A';
		System.out.println("Single character is: "+c1);
		char c2='@';
		System.out.println("Special character is: "+c2);
		char c3=69;//69 as ascii for character E
		System.out.println("Character for Ascii 69: "+c3);
		
		char c4=122;//122 is ascii for z
		System.out.println("character for Ascii 122: "+c4);
		
		System.out.println("************************");
		
		/*
		 * integer type
		 * --------------
		 * byte --->short--->int--->long
		 * default data type for any number in java is: int 
		 */
		
		//byte 1byte -128 to 127
		byte b1=120;
		System.out.println("byte data is: "+b1);
		byte b2=127;
		//Type mismatch: cannot convert from int to byte
		//byte b3=129;
		
		System.out.println("byte data is: "+b2);
		
		byte b3=-128;
		System.out.println("byte data is: "+b3);
		
		//byte b4=-129;
		
		//byte b5=1000;
		//short 2byte -32768 to 32767
		short s1=32767;
		System.out.println("short data is: "+s1);
		
		short s2=-32768;
		System.out.println("short data is: "+s2);
		
		
		//int 4byte 
		
		int i1=90000;
		System.out.println("int data is: "+i1);
		
		int i2=90897766;
		System.out.println("int data is: "+i2);
		
		//The literal 99999999999 of type int is out of range 
		//int i3=99999999999;
		
		//long 8byte 
		long l1=99999999999L;
		System.out.println("long data is: "+l1);
		
		System.out.println("********************************");
		
		/*
		 * floating point 
		 * --------------------
		 * 1.float -smaller floating point number 4byte
		 * 2.double -larger floating pint number 8byte (default)
		 * 
		 */
		double d1=78.88;
		System.out.println("double data is: "+d1);
		
		float f1=45.67F;
		System.out.println("float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
