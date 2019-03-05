public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less then 5000 but greater then 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less then 1000");
        } else {
            System.out.println("Got here");
        }

        boolean gameOver2 = true;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (score2 < 10000 && score > 1000) {
            System.out.println("Your score was less then 10000 but greater then 2000");
        } else if (score2 < 2000) {
            System.out.println("Your score was less then 2000");
        } else {
            System.out.println("Got here 2");
        }


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        if (gameOver2 == true) {
            int finalScore2 = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your second final score was " + finalScore2);
        }


    }
}
