/**
 * @author baudon
 * 
 *         Class Exchange version 1
 * 
 *         This class is an example of bad code !!!
 */

public class Exchange {
	private static final String[] arrayCurrencies = { "Franc", "Mark",
			"Dollar", "Euro" };

	private static final double[] arrayRates = { 6.55957, 1.95583, 1.3153, 1. };

	public static double convert(double amount, String currency) {
		int i;
		for (i = 0; i < arrayCurrencies.length; i++)
			if (arrayCurrencies[i].equals(currency))
				return amount / arrayRates[i];
		return -1;
	}

	public static void main(String[] args) {
		double amount = Double.valueOf(args[0]).doubleValue();
		String currency = args[1];
		System.out.println(convert(amount, currency) + " Euros");
	}
}