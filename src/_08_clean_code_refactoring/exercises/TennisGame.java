package _08_clean_code_refactoring.exercises;

public class TennisGame {
    public static String getScore(String playerFirstName, String playerSecondName, int scorePlayerFirst, int scorePlayerSecond) {
        String notifyScore = "";
        int tempScore = 0;
        if (scorePlayerFirst == scorePlayerSecond) {
            notifyScore = getResultDraw(scorePlayerFirst);
        } else if (scorePlayerFirst >= 4 || scorePlayerSecond >= 4) {
            notifyScore = getResult(scorePlayerFirst, scorePlayerSecond);
        } else {
            notifyScore = getResultPlayer(scorePlayerFirst, scorePlayerSecond, notifyScore);
        }
        return notifyScore;
    }

    public static String getResultPlayer(int scorePlayerFirst, int scorePlayerSecond, String notifyScore) {
        int tempScore;
        StringBuilder notifyScoreBuilder = new StringBuilder(notifyScore);
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = scorePlayerFirst;
            } else {
                notifyScoreBuilder.append("-");
                tempScore = scorePlayerSecond;
            }
            switch (tempScore) {
                case 0:
                    notifyScoreBuilder.append("Love");
                    break;
                case 1:
                    notifyScoreBuilder.append("Fifteen");
                    break;
                case 2:
                    notifyScoreBuilder.append("Thirty");
                    break;
                case 3:
                    notifyScoreBuilder.append("Forty");
                    break;
            }
        }
        notifyScore = notifyScoreBuilder.toString();
        return notifyScore;
    }

    public static String getResultDraw(int scorePlayerFirst) {
        String notifyScore;
        switch (scorePlayerFirst) {
            case 0:
                notifyScore = "Love-All";
                break;
            case 1:
                notifyScore = "Fifteen-All";
                break;
            case 2:
                notifyScore = "Thirty-All";
                break;
            case 3:
                notifyScore = "Forty-All";
                break;
            default:
                notifyScore = "Deuce";
                break;

        }
        return notifyScore;
    }

    public static String getResult(int scorePlayerFirst, int scorePlayerSecond) {
        String result;
        int minusResult = scorePlayerFirst - scorePlayerSecond;
        if (minusResult == 1) {
            result = "Advantage player1";
        } else if (minusResult == -1) {
            result = "Advantage player2";
        } else if (minusResult >= 2) {
            result = "Win for player1";
        } else {
            result = "Win for player2";
        }
        return result;
    }
}
