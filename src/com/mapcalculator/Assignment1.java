package com.mapcalculator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

		
		double avg = 0;
		double min = 0;
		double max = 0;
		int count = 0;
		double total = 0;

		String answer = "";
		do {
			//create a scanner class object
			Scanner scanner = new Scanner(System.in);
			
			//take id from user 
			System.out.println("Please enter patient id");
			int id = scanner.nextInt();
			//take input firstname from user
			System.out.println("Enter first name");
			String firstName = scanner.next();
			
			//take input lastname from user
			System.out.println("Enter last name");
			String lastName = scanner.next();

			//take input sbp value from user
			System.out.println("Please enter SBP value");
			double sbpValue = scanner.nextDouble();
			///take input dbp value fromuser
			System.out.println("Please enter DBP value");
			double dbpValue = scanner.nextDouble();
			
			//create a MAP class object
			MAPCalculator calculator = new MAPCalculator();
			//calcualate map value
			double mapValue = calculator.value(sbpValue, dbpValue);
			
			if(mapValue !=0) {
			//change map value formate to print only one digit after decimal
			String mapString = new DecimalFormat("##.#").format(mapValue);
			
			//convert map string into double
			double map = Double.parseDouble(mapString);
			String mapCategory = calculator.category(map);
			Person person = new Person(id, firstName, lastName,map,mapCategory);
			
			
			System.out.println("Patient ID  \t| First Name \t| Last Name \t| MAP Value \t| MAP Category\t|");
			System.out.println("==========================================================================");
			System.out.println(person.getId()+"\t\t|"+person.getFirstName()+"\t|"+person.getLastName()+"\t|"+person.getMapValue()+"\t|"+person.getMapCategory());
			
			System.out.println("===========================================================================");
			System.out.println();
			System.out.println("Do you want to test more patient (yes/no)?");
			answer = scanner.next();
				max = getMaximum(max,person.getMapValue());
				min = getMinimum(min,person.getMapValue());
				total +=person.getMapValue();
				count++;
			}

		} while (answer.equalsIgnoreCase("yes"));
		
		avg = total / count;
		
		
		String avgString = new DecimalFormat("##.#").format(avg);
		avg  = Double.parseDouble(avgString);
		System.out.println("Minimum  \t| Maximum \t| Average \t| ");
		System.out.println("======================================");
		System.out.println(min+"\t\t|"+max+"\t|"+avg+"\t|");
		
		System.out.println("======================================");
		System.out.println();
	}


	private static double getMinimum(double min, double mapValue) {
		
		if(min ==0) {
			min = mapValue;
		}
		if(min > mapValue) {
			return mapValue;
		}
		return min;
	}

	private static double getMaximum(double max, double mapValue) {
		if(max < mapValue) {
			return mapValue;
		}
		return max;
	}
}
