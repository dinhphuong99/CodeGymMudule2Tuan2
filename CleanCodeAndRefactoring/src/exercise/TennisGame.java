package exercise;

public class TennisGame {
    public final static String SCORE_IS_0 = "Love";
    public final static String SCORE_IS_1 = "Fifteen";
    public final static String SCORE_IS_2 = "Thirty";
    public final static String SCORE_IS_3 = "Forty";
    public final static String MATCH_TO_CONNECT = "-";
    public final static String EQUAL = "All";
    public final static String SCORE_IS_4_4 = "Deuce";
    public final static String WINNING_ANNOUNCEMENT = "Win for player";
    public final static String PLAYER_1 = "1";
    public final static String PLAYER_2 = "2";
    public final static String NOTICE_OF_ADVANTAGE = "Advantage player";

    public static String getScoreAnnouncement(String player1Name, String player2Name, int player_1_score, int player_2_score) {
        String score_annountcement = "";
        boolean equal = player_1_score==player_2_score;
        boolean player_score_is_greater_than_4 = player_1_score>=4 || player_2_score>=4;

        int tempScore=0;
        if (equal)
        {
            switch (player_1_score)
            {
                case 0:
                    score_annountcement = SCORE_IS_0 + MATCH_TO_CONNECT + EQUAL;
                    break;
                case 1:
                    score_annountcement = SCORE_IS_1 + MATCH_TO_CONNECT + EQUAL;
                    break;
                case 2:
                    score_annountcement = SCORE_IS_2 + MATCH_TO_CONNECT + EQUAL;
                    break;
                case 3:
                    score_annountcement = SCORE_IS_3 + MATCH_TO_CONNECT + EQUAL;
                    break;
                default:
                    score_annountcement = SCORE_IS_4_4;
                    break;

            }
        }
        else if (player_score_is_greater_than_4)
        {
            int score_difference = player_1_score - player_2_score;
            if (score_difference==1)
                score_annountcement = NOTICE_OF_ADVANTAGE + PLAYER_1;
            else if (score_difference ==-1)
                score_annountcement = NOTICE_OF_ADVANTAGE + PLAYER_2;
            else if (score_difference>=2)
                score_annountcement = WINNING_ANNOUNCEMENT + PLAYER_1;
            else
                score_annountcement = WINNING_ANNOUNCEMENT + PLAYER_2;
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1)
                    tempScore = player_1_score;
                else {
                    score_annountcement += MATCH_TO_CONNECT;
                    tempScore = player_2_score;
                }
                switch(tempScore)
                {
                    case 0:
                        score_annountcement+= SCORE_IS_0;
                        break;
                    case 1:
                        score_annountcement+= SCORE_IS_1;
                        break;
                    case 2:
                        score_annountcement+= SCORE_IS_2;
                        break;
                    case 3:
                        score_annountcement+= SCORE_IS_3;
                        break;
                }
            }
        }
        return score_annountcement;
    }
}
