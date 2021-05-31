package com.eggs.calculate;

public class CalculateEgg {
	
	int totaleggs;
	boolean valid = false;
	
	public CalculateEgg(int totaleggs){
		this.totaleggs = totaleggs;
	}
	
	EggUnit euobj = new EggUnit();
	
	public void calculate() {
		if(this.totaleggs > 0)
		{
			this.valid=true;
			euobj.setGross((this.totaleggs/144));
			euobj.setDozen((this.totaleggs%144)/12);
			euobj.setRemaining((this.totaleggs%144)%12);
		}
		else
		{
			this.valid=false;
		}
	}
		
	public void Display() {
		if(this.valid)
		{
			System.out.println("Gross: "+euobj.getGross());
			System.out.println("Dozens: "+euobj.getDozen());
			System.out.println("Remaining: "+euobj.getRemaining());
		}
		else
			System.out.println("Invalid Input. Try a natural number!");
	}
}

