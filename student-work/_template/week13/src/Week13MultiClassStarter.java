public class Week13MultiClassStarter {

    static class ScoreBoard {
        private int score;

        public void addPoint() {
            score += 1;
        }

        public int getScore() {
            return score;
        }
    }

    static class GameClient {
        public void playTurn(ScoreBoard board) {
            board.addPoint();
        }
    }

    public static void main(String[] args) {
        ScoreBoard board = new ScoreBoard();
        GameClient client = new GameClient();
        client.playTurn(board);
        System.out.println("Score: " + board.getScore());
    }
}
