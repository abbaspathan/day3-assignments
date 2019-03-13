package tests;
import main.Vehicle;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest{

	@Test
	public void testChangeSpeedOfVehicle(){

		Vehicle vehicle=new Vehicle(50.0,90.0,"Jon Deo");
		assertEquals(80,vehicle.changeSpeedOfVehicle(30),0.20);
	}

	@Test
	public void testChangeInDirectionLeft(){
		
		Vehicle vehicle1=new Vehicle(50.0,90.0,"Jon Deo");
		assertEquals(60.0,vehicle1.changeDirection(30.0,0),0.02);
	}


	@Test
	public void testVehicleStop(){
		
		Vehicle vehicle2=new Vehicle();
		assertEquals(0.0,vehicle2.stopVehicle(),0.02);
		vehicle2.toString();
	}
}