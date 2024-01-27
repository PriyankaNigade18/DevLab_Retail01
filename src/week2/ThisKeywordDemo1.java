package week2;

public class ThisKeywordDemo1 
{
	public void m1()
	{
		System.out.println("M1 is calling");
		this.m2();
	}
	public void m2()
	{
		System.out.println("M2 is calling");
		this.m3();
	}
	public void m3()
	{
		System.out.println("M3 is calling");
		//this.m1();//StackOverflowError
	}

	public static void main(String[] args)
	{
		
		ThisKeywordDemo1 t1=new ThisKeywordDemo1();
		t1.m1();
		
		//t1.m2();
		
		
		
		// TODO Auto-generated method stub

	}

}
