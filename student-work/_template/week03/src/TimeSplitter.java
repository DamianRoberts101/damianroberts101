import java.util.Scanner;

public class TimeSplitter {
	public static void main(String[] args) {
		final int SEC_PER_HOUR = 3600;
		final int SEC_PER_MIN = 60;

		int totalSeconds;
		int hours;
		int minutes;
		int seconds;

		Scanner in = new Scanner(System.in);

		System.out.print("Total seconds? ");
		totalSeconds = in.nextInt();

		hours = totalSeconds / SEC_PER_HOUR;

		int left = totalSeconds % SEC_PER_HOUR;

		minutes = left / SEC_PER_MIN;
		seconds = left % SEC_PER_MIN;

		System.out.printf("%d seconds = %d h, %d min, %d s\n", totalSeconds, hours, minutes, seconds);
	}
}