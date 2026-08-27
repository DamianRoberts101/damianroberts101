import java.util.Random;
import java.util.Scanner;

public class Week03InputStarter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter a whole number: ");
        int guess = in.nextInt();

        int secret = random.nextInt(10) + 1;
        System.out.println(name + ", you guessed " + guess + ".");
        System.out.println("Random number: " + secret);
    }
}
