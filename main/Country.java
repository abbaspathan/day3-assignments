package main;
public class Country{
	
	private String countryName;
	private long countryPopulation;
	private long countryArea;

	public Country(){
	
	}

	public Country(String countryNamr,long countryPopulation,long countryArea){
		this.countryName=countryName;
		this.countryPopulation=countryPopulation;
		this.countryArea=countryArea;
	}
	
	public String getCountryName(){
		return countryName;
	}
	public long getCountryPopulation(){
		return countryPopulation;
	}	
	public long getCountryArea(){
		return countryArea;
	}

	public Country findLargestArea(Country array[]){
		
		int variable=0;
		long result=array[0].countryArea;
		int index=0;
		for(variable=1;variable<array.length;variable++){
			if(result<array[variable].countryArea){
				result=array[variable].countryArea;
				index=variable;
			}			
		}
		return array[index];
	}
	public Country findLargestPopulation(Country array[]){
		
		int variable=0;
		long result=array[0].countryPopulation;
		int index=0;
		for(variable=1;variable<array.length;variable++){
			if(result<array[variable].countryPopulation){
				result=array[variable].countryPopulation;
				index=variable;
			}			
		}
		return array[index];
	}
	public Country findLargestPopulationDensity(Country array[]){
		int variable=0;
		double result=0.0;
		int index=0;
		for(variable=0;variable<array.length;variable++){
			
			if(result<(array[variable].countryPopulation/array[variable].countryArea)){
				result=(array[variable].countryPopulation/array[variable].countryArea);
				index=variable;
			}		
		}
		return array[index];
	}
}