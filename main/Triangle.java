package main;

public class Triangle{
	
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public boolean checkRightAngled(){
		
		int length1=0;
		int length2=0;
		int length3=0;

		if(side1>side2 && side1>side3){
			length1=side1;
			length2=side2;
			length3=side3;
		}
		else if(side2>side3){
			length1=side2;
			length2=side3;
			length3=side1;
		}
		else{
			length1=side3;
			length2=side2;
			length3=side1;
		}

		if(length1*length1==(length2*length2)+(length3*length3)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean checkIsScalen(){

		if((side1==side2) || (side1==side3) || (side2==side3)){
			return false;
		}
		else{
			return true;
		}
	}

	public boolean checkIsIsosceles(){

		if((side1==side2) || (side1==side3) || (side2==side3)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean checkIsEquilateral(){

		if(side1==side2 && side1==side3 && side2==side3){
			return true;
		}
		else{
			return false;
		}
	}
}