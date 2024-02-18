package oop.DataAbstraction;

public class TestHospital {

	public static void main(String[] args)
	{
		//child class ref and child class object
		NobelHs n1=new NobelHs();
		n1.physioService();
		n1.cardioService();
		n1.dentalService();
		n1.medicalService();
		n1.neroService();
		n1.covid19Test();
		
		
		System.out.println("*******************************");
		
		IMA i1=new NobelHs();
		i1.dentalService();
		i1.physioService();
		i1.covid19Test();
		
		System.out.println("*******************************");

		USMA u1=new NobelHs();
		u1.cardioService();
		u1.neroService();
		u1.covid19Test();
		
		
		
		
	}

}
