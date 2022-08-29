package ss8_clean_code.excercise;

public class TennisGame {
    public static String getScore(String playerName1, String player2Name,
                                  int messageScore1, int messageScore2) {
        String score = "";
        final int love = 0;
        int tempScore = love;
        final int fifteen = 1;
        final int thirty = 2;
        final int forty = 3;
        if (isDraw(messageScore1, messageScore2)) {
            switch (messageScore1) {
                case love:
                    score = "Love-All";
                    break;
                case fifteen:
                    score = "Fifteen-All";
                    break;
                case thirty:
                    score = "Thirty-All";
                    break;
                case forty:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (isAdvantage(messageScore1, 4) || isAdvantage(messageScore2, 4)) {
            int minusResult = messageScore1 - messageScore2;
            if (isDraw(minusResult, fifteen)) score = "Advantage player1";
            else if (isDraw(minusResult, -fifteen)) score = "Advantage player2";
            else if (isAdvantage(minusResult, thirty)) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = fifteen; i < forty; i++) {
                if (isDraw(i, fifteen)) tempScore = messageScore1;
                else {
                    score += "-";
                    tempScore = messageScore2;
                }
                switch (tempScore) {
                    case love:
                        score += "Love";
                        break;
                    case fifteen:
                        score += "Fifteen";
                        break;
                    case thirty:
                        score += "Thirty";
                        break;
                    case forty:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static boolean isAdvantage(int messageScore1, int i) {
        return messageScore1 >= i;
    }

    private static boolean isDraw(int messageScore1, int messageScore2) {
        return messageScore1 == messageScore2;
    }
}
