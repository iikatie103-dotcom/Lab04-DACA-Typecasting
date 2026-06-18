// YOUR NAME: Katelyn Ho
// COLLABORATORS:  
// DATE: 6/18/2026

public class Main
{
	public static void main(String[] args)
	{
		// DECLARATION SECTION
		char state1 = 'c' - 32;
		char state2 = 'a' - 32;
		int numberOfDacaRecipients = 700000;
		long amountInTaxes = 5700000000L;
		double averageContribution = amountInTaxes / numberOfDacaRecipients;
		int averageContributionRounded = (int) averageContribution;

		// INITIALIZATION SECTION
		
		// INPUT SECTION
		// N/A (no input for this lab)
		
		// CALCULATION & PROCESSING SECTION

		
		// OUTPUT SECTION
		System.out.println("Average DACA-recipient Tax Contribution:" + " " + "$" + averageContribution);
		System.out.println("Rounded down to the nearest whole dollar:" + " " + "$" + averageContributionRounded);
		System.out.println("State with most DACA recipients:" + " " + state1 + state2);

	}
}