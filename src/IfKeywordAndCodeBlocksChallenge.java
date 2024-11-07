public class IfKeywordAndCodeBlocksChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("The next highScore is " + calculateScore(gameOver,score,levelCompleted,bonus));


    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore+= 1000;
        }

        return finalScore;
    }
}