package tests;
import main.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest{

	@Test
	public void testForCheckRightAngledTrue(){
		Triangle rightAngledt=new Triangle(3,5,4);
		assertTrue(rightAngledt.checkRightAngled());
	}

	@Test
	public void testForCheckRightAngledFalse(){
		Triangle rightAngledf=new Triangle(3,5,3);
		assertFalse(rightAngledf.checkRightAngled());
	}
		
	@Test
	public void testForCheckIsScalenTrue(){
		Triangle isScalent=new Triangle(3,6,4);
		assertTrue(isScalent.checkIsScalen());
	}

	@Test
	public void testForCheckIsScalenFalse(){
		Triangle isScalenf=new Triangle(3,5,5);
		assertFalse(isScalenf.checkIsScalen());
	}
	
	@Test
	public void testForCheckIsIsoscelesTrue(){
		Triangle isIsosceles=new Triangle(3,6,6);
		assertTrue(isIsosceles.checkIsIsosceles());
	}

	@Test
	public void testForCheckIsIsoscelesFalse(){
		Triangle isIsosceles=new Triangle(3,5,4);
		assertFalse(isIsosceles.checkIsIsosceles());
	}

	@Test
	public void testForCheckIsEquilateralTrue(){
		Triangle isEquilateral=new Triangle(3,3,3);
		assertTrue(isEquilateral.checkIsEquilateral());
	}

	@Test
	public void testForCheckIsEquilateralFalse(){
		Triangle isEquilateral=new Triangle(3,5,4);
		assertFalse(isEquilateral.checkIsEquilateral());
	}
}