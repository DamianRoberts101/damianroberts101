public class Week09UtilitiesStarter {

    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    public static void main(String[] args) {
        int score = 75;
        if (isValidScore(score)) {
            System.out.println("Accepted score: " + score);
        } else {
            System.out.println("Invalid score.");
        }
    }
}
