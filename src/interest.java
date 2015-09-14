import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class interest {

	public static void main(String[] args){
		
		
		// we need r n p f t y
		double r;
		double n;
		double p;
		double f;
		boolean t;
		double y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many years do you plan to work?");
		double workYears = input.nextDouble();
		
		System.out.println("What is your expected average return on investment?");
		double avgReturn = input.nextDouble();
		
		
		System.out.println("How many years will you be drawing for?");
		double retirementYears = input.nextDouble();
		
		System.out.println("What is your required monthly income?");
		double requiredIncome = input.nextDouble();
		
		System.out.println("Expected SSI income?");
		double expectedSSI = input.nextDouble();
		
		
		r = (0.02/12);
		n = (retirementYears*12);
		y = (requiredIncome-expectedSSI);
		f = 0;
		t = false;
		
		double PV = FinanceLib.pv(r, n, y, f, t);
		//System.out.println(-PV);
		
		r = avgReturn/12;
		n = workYears*12;
		p = 0;
		f = PV;
		double PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println("Amount you will have to save each month: $" + PMT);
			
				
		
	}
	
}
