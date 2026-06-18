// YOUR NAME: Katelyn Ho
// COLLABORATORS:  
// DATE: 6/18/2026

public class Main
{
	public static void main(String[] args)
	{
		// DECLARATION SECTION
		char state1 = 'c';
		char state2 = 'a';
		String stateMostDaca;
		int numberOfDacaRecipients = 700000;
		long amountInTaxes = 60000000000L;
		double averageContribution = (double) amountInTaxes / numberOfDacaRecipients;
		int averageContributionRounded = (int) averageContribution;

		// INITIALIZATION SECTION

		// INPUT SECTION
		// N/A (no input for this lab)
		
		// CALCULATION & PROCESSING SECTION
		state1 = (char) (state1 - 32);
		state2 = (char) (state2 - 32);
		stateMostDaca = state1 + "" + state2;
		
		// OUTPUT SECTION
		System.out.println("Average DACA-recipient Tax Contribution:" + " " + "$" + averageContribution);
		System.out.println("Rounded down to the nearest whole dollar:" + " " + "$" + averageContributionRounded);
		System.out.println("State with most DACA recipients:" + " " + stateMostDaca);

	}
}