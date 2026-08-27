public class Week07ArraysStarter {

    public static void main(String[] args) {
        int[] scores = {78, 85, 92, 67, 88};
        int total = 0;
        int max = scores[0];

        for (int score : scores) {
            total += score;
            if (score > max) {
                max = score;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
    }
}
