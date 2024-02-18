package oop.DataAbstraction;
//Multiple inheritance in java
public class NobelHs implements IMA,USMA
{
	
	
	public void medicalService()
	{
		System.out.println("Nobel......Medical Service");
	}

	@Override
	public void physioService() {
		System.out.println("Nobel......Physio Service");
		
	}

	@Override
	public void dentalService() {
		System.out.println("Nobel......Dental Service");

		
	}

	@Override
	public void cardioService() {
		System.out.println("Nobel......CardioService");

		
	}

	@Override
	public void neroService() {
		System.out.println("Nobel......Nero Service");
		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobelHs.....covid19Test()");
		
	}

}
