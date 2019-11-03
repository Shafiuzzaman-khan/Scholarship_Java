package CGPA;

public class cGpa {
	
	public int calculateFess(int credit) {
		
		return credit*5000;
	}
	
	public int offerScholarship(float cGpa) {
		if(cGpa>=3.8) {
			System.out.println("Presedentail scholarship");
			return 50;
		}
		if(cGpa>=3.5 && cGpa<=3.79) {
			System.out.println("Vc scholarship");
			return 30;
		}
		
		if(cGpa>=3.3 && cGpa<=3.49) {
			System.out.println("Deans scholarship");
			return 10;
		}
		
		return 0;
	}

	public float calculateFeeWithMerits(int totalFees, int weiver) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}