package CGPA;

import java.util.Scanner;

public class Main {
	
	public float calculateFeeWithMerits(int totalFees, int weiver) {
		 
		float fees = (totalFees*(weiver/100));
		
		return fees;
	}
	
	public static void main(String[] args) {
		
		int credit;
		float cGpa;
		
		Main obj2 = new Main();
		
		
		cGpa obj = new cGpa();
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter your credit:");
		credit = getInput.nextInt();
		int totalFees = obj.calculateFess(credit) ;
		System.out.println("Total fees without weiver is:");
		
		System.out.println("Toatl fees"+totalFees+" " );
		cGpa = getInput.nextFloat();
		int weiver = obj.offerScholarship(cGpa);
		System.out.println("My weiver:"+ weiver);
		System.out.println(weiver);
		System.out.println(totalFees);

		
		float feesAfterWeiver = obj2.calculateFeeWithMerits(totalFees, weiver);
		System.out.println("SO your fees after weiver: "+feesAfterWeiver);

	}
	
	

}
