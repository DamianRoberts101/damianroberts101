public class ReceiptTotal {
	public static void main(String[] args) {
		int quantity = 2;
		int unitPriceCents = 5999;

		int totalCents = quantity * unitPriceCents;

		System.out.print("Total cost (cents): ");
		System.out.println(totalCents);

		// Integer division removes the remaining cents and only gives whole dollars.
		System.out.print("Total cost (whole dollars only): ");
		System.out.println(totalCents / 100);
	}
}