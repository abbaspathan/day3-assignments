import java.util.*;

public class Date_Client{

	public static void main(String args[]){
		
		boolean var=false;
		int array[];
		int date=0;
		int month=0;
		int year=0;

		Scanner objectSc=new Scanner(System.in);

		System.out.println("Enter the date (It should in between 1 to 31) :");
		date=objectSc.nextInt();

		System.out.println("Enter the month (It should in between 1 to 12 ) :");
		month=objectSc.nextInt();

		System.out.println("Enter the year :");
		year=objectSc.nextInt();		

		Date object1=new Date(date,month,year);

		System.out.println("Enter the date (It should in between 1 to 31) :");
		date=objectSc.nextInt();

		System.out.println("Enter the month (It should in between 1 to 12 ) :");
		month=objectSc.nextInt();

		System.out.println("Enter the year :");
		year=objectSc.nextInt();

		Date object2=new Date(date,month,year);

		System.out.println("Date is :"+object1.toString());
		System.out.println("Date is :"+object2.toString());
		
		var=object1.isSmaller(object2);
		
		if(var==true){
			System.out.println("Date 2 is small");
		}
		else{
			System.out.println("Date 2 is not small");
		}

		array=object1.diffrence(object2);
		
		System.out.println();
		System.out.println("Diffrence in day :"+array[0]);
		System.out.println("Diffrence in month :"+array[1]);
		System.out.println("Diffrence in year :"+array[2]);
	}
}