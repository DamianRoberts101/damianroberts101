public class Week06LoopsStarter {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total += i;
            System.out.println("Running total: " + total);
        }

        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
