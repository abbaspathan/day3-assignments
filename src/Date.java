class Date{ 

	private int date;
	private int month;
	private int year;

	public Date(int date,int month, int year){
	
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public String toString(){
		String myString;
		myString=String.format("%d/%d/%d", date, month, year);
		return myString;
	}
	public boolean isSmaller(Date dateObject) 
	{	
		boolean result=false;
		if(this.year>dateObject.year){
			result=true;
		}
		else if(this.year<dateObject.year){
			result=false;
		}
		else{
			if(this.month>dateObject.month){
				result=true;
			}
			else if(this.month<dateObject.month){
				result=false;
			}
			else{
				if(this.date>dateObject.date){
					result=true;
				}
				else if(this.date<=dateObject.date){
					result=false;
				}
			}
		}
		return result;
	}
	public int[] diffrence(Date dateObject)
	{
		int array[]=new int[3];
		
		array[0]=this.date-dateObject.date;
		if(array[0]<0){
			array[0]=-array[0];
		}
		
		array[1]=this.month-dateObject.month;
		if(array[1]<0){
			array[1]=-array[1];
		}
		array[2]=this.year-dateObject.year;
		if(array[2]<0){
			array[2]=-array[2];
		}

		return array;
	}
}