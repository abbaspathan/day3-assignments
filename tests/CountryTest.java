package tests;
import org.junit.Test;
import main.Country;
import org.junit.Before;
import static org.junit.Assert.*;

public class CountryTest{

	Country array[];	

	@Before
	public void setUp(){
		array=new Country[4];
		array[0]=new Country("India",13300000,328709);
		array[1]=new Country("China",16300000,428709);
		array[2]=new Country("America",1300000,578709);
		array[3]=new Country("australia",3300000,32870);
	}

	@Test
	public  void testLargestAreaOfCountry(){
		Country actualCountry=new Country("America",1300000,578709);
		Country expectedCountry=new Country().findLargestArea(array);
		assertEquals(actualCountry.getCountryName(),expectedCountry.getCountryName());
		assertEquals(actualCountry.getCountryPopulation(),expectedCountry.getCountryPopulation());
		assertEquals(actualCountry.getCountryArea(),expectedCountry.getCountryArea());
	}

	@Test
	public  void testLargestPopulationOfCountry(){
		Country actualCountry=new Country("China",16300000,428709);
		Country expectedCountry=new Country().findLargestPopulation(array);
		assertEquals(actualCountry.getCountryName(),expectedCountry.getCountryName());
		assertEquals(actualCountry.getCountryPopulation(),expectedCountry.getCountryPopulation());
		assertEquals(actualCountry.getCountryArea(),expectedCountry.getCountryArea());
	}
	
	@Test
	public void testLargestPopulationCountryDensity(){
		Country actualCountry=new Country("australia",3300000,32870);
		Country expectedCountry=new Country().findLargestPopulationDensity(array);
		assertEquals(actualCountry.getCountryName(),expectedCountry.getCountryName());
		assertEquals(actualCountry.getCountryPopulation(),expectedCountry.getCountryPopulation());
		assertEquals(actualCountry.getCountryArea(),expectedCountry.getCountryArea());
		
	}
}
