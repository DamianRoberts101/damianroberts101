public class ReceiptTotalFixed {
	public static void main(String[] args) {
		int quantity = 2;
		int unitPriceCents = 5999;

		int totalCents = quantity * unitPriceCents;
		double totalDollars = totalCents / 100.0;

		System.out.print("Total cost (dollars): ");
		System.out.println(totalDollars);

		double y1 = 1 / 3;
		System.out.print("y1 (int division then converted): ");
		System.out.println(y1);

		double y2 = 1.0 / 3.0;
		System.out.print("y2 (floating-point division): ");
		System.out.println(y2);

		// y1 uses integer division, so it becomes 0. y2 uses decimals, so it keeps the fraction.
	}
}