public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePostion = calculateHighScorePosition(1500);
        displayHighScorePositon("Tim", highScorePostion);
        highScorePostion = calculateHighScorePosition(999);
        displayHighScorePositon("Bob", highScorePostion);
        highScorePostion = calculateHighScorePosition(500);
        displayHighScorePositon("Percy", highScorePostion);
        highScorePostion = calculateHighScorePosition(10);
        displayHighScorePositon("Gilbert", highScorePostion);
    }

    public static void displayHighScorePositon(String playerName, int positonHighscoreList) {
        System.out.println(
                playerName
                        + " managed to get into position "
                        + positonHighscoreList +
                        " on the highscore list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int postion = 4;

        if (playerScore >= 1000) {
            postion = 1;
        } else if (playerScore >= 500) {
            postion = 2;
        } else if (playerScore >= 100) {
            postion = 3;
        }

        return postion;
    }
}
