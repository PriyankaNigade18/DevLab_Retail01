package week2;

public class OperatorsDemo {

	public static void main(String[] args)
	{

		int a=100,b=20;
		System.out.println("Addition is:"+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is" +(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		//Unary operators
		
		/*
		 * Increment ++
		 * a++  post increment
		 * ++a  pre increment
		 * 
		 * a=10
		 * a++  means a=a+1
		 * 
		 */
		
		int x=100;
		System.out.println(x);//100
		System.out.println(++x);//101
		
		
		int y=200;
		System.out.println(y);//200
		System.out.println(y++);//200 post
		System.out.println(y);//201
		
		int c=99;
		int d=c++;
		
		System.out.println(d);//99
		System.out.println(c);//100
		
		
		int c1=578;
		int d1=c1++;
		
		System.out.println(d1);//578
		System.out.println(c1);//579
		
		
		int e=90;
		int f=++e;
		
		System.out.println(f);//91
		System.out.println(e);//91
		
		
		int i=649;
		int j=++i;
		System.out.println(j);//650
		System.out.println(i);//650
		
		/*
		 * Decrements 
		 * a--   post decrement
		 * --a 	pre decrement
		 */
		
		
		int r=79;
		System.out.println(r);//79
		System.out.println(r--);//79
		System.out.println(r);//78
		
		int s=45;
		System.out.println(s);//45
		System.out.println(--s);//44
		
		
		int a1=89;
		int b1=--a1;
		System.out.println(a1);//88
		System.out.println(b1);//88
		
		
		int r1=539;
		int s1=r1--;
		System.out.println(r1);//538
		System.out.println(s1);//539
		
		//! not logical boolean
		boolean status=true;
		System.out.println(status);//true
		
		System.out.println(!status);//false
		
		System.out.println("Relational operators");
		//r=78 s=44 a1,b1=88 s1=539 r1=538
		
		System.out.println("less than <: "+(r<a1));//true
		System.out.println("greater than >: "+(s1>a1));//true
		System.out.println(s<=r);//true
		System.out.println(a1>=b1);//true
		System.out.println(b1>r1);//false
		System.out.println(a1==b1);//true
		System.out.println(s1==r1);//false
		
		System.out.println(s1!=r1);//true
		System.out.println(a1!=b1);//false
		
		System.out.println("Logocal Operators");
		/*
		 * a        b       &&(a&&b)AND        ||(a||b)OR    !NOT(!a)
		 * true   true       true				true			false
		 * true   false       false              true			false
		 * false  true		  false              true			true
		 * false  false		   false             false          true
		 * 
		 */
		
		System.out.println(a1==b1 && s1!=a1);//true
		System.out.println(a1==b1 && s1==r1);//false
		System.out.println(a1!=b1 && s1!=a1);//false
		System.out.println(a1!=b1 && s1==r1);//false
		
		
		
		System.out.println(a1==b1 || s1!=a1);//true
		System.out.println(a1==b1 || s1==r1);//true
		System.out.println(a1!=b1 || s1!=a1);//true
		System.out.println(a1!=b1 || s1==r1);//false
		
		
		//not 
		System.out.println(a1==b1);//true
		System.out.println(!(a1==b1));//false
		
		
		
		
		
		
		

	}

}
