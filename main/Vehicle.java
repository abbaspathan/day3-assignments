package main;

public class Vehicle{

	private static long highestVehicleIdentificationNumber=76543;
	private double currentSpeed;
	private double currentDirection;
	private String ownerName;
	private long vehicleIdNumber;
	public final static int LEFT=0;
	public final static int RIGHT=1;

	public Vehicle(){
		vehicleIdNumber=++highestVehicleIdentificationNumber;
	}

	public Vehicle(double currentSpeed,double currentDirection,String ownerName){
		this();
		this.currentSpeed=currentSpeed;
		this.currentDirection=currentDirection;
		this.ownerName=ownerName;
	}

	public static long gethighestVehicleIdentificationNumber(){
		return highestVehicleIdentificationNumber;
	} 

	public double getCurrentSpeed(){
		return currentSpeed;
	}
	
	public double getCurrentDirection(){
		return currentDirection;
	}

	public String getOwnerName(){
		return ownerName;
	}

	public long getVehicleIdNumber(){
		return vehicleIdNumber;
	}
	
	public double changeSpeedOfVehicle(double increaseSpeed){
		
		this.currentSpeed=this.currentSpeed+increaseSpeed;
		return currentSpeed;
	}

	public double changeDirection(double directionDegree,int direction){
		
		double result=0.0;
		if(direction==RIGHT){
			result=currentDirection + directionDegree;
			if(result>=360){
				currentDirection=result-360;
			}
			else{
				currentDirection=result;
			}
			
		}
		else if(direction==LEFT){

			result=currentDirection-directionDegree;
			if(result<0){
				result=360-(Math.abs(result));
			}
			currentDirection=result;
		}
			return currentDirection;
	}

	public double stopVehicle(){

		this.currentSpeed=0.0;
		return currentSpeed;
	}
	
	public String toString(){

		return ownerName;
	}
}