package exercise;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static exercise.TennisGame.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TennisGameTest {

    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][] {
                { 0, 0, SCORE_IS_0 + MATCH_TO_CONNECT + EQUAL },
                { 1, 1, SCORE_IS_1 + MATCH_TO_CONNECT + EQUAL },
                { 2, 2, SCORE_IS_2 + MATCH_TO_CONNECT + EQUAL },
                { 3, 3, SCORE_IS_3 + MATCH_TO_CONNECT + EQUAL },
                { 4, 4, SCORE_IS_4_4 },

                { 1, 0, SCORE_IS_1 + MATCH_TO_CONNECT +SCORE_IS_0},
                { 0, 1, SCORE_IS_0 + MATCH_TO_CONNECT +SCORE_IS_1},
                { 2, 0, SCORE_IS_2 + MATCH_TO_CONNECT +SCORE_IS_0},
                { 0, 2, SCORE_IS_0 + MATCH_TO_CONNECT +SCORE_IS_2},
                { 3, 0, SCORE_IS_3 + MATCH_TO_CONNECT +SCORE_IS_0},
                { 0, 3, SCORE_IS_0 + MATCH_TO_CONNECT +SCORE_IS_3},
                { 4, 0, WINNING_ANNOUNCEMENT + PLAYER_1},
                { 0, 4, WINNING_ANNOUNCEMENT + PLAYER_2},

                { 2, 1, SCORE_IS_2 + MATCH_TO_CONNECT + SCORE_IS_1},
                { 1, 2, SCORE_IS_1 + MATCH_TO_CONNECT + SCORE_IS_2},
                { 3, 1, SCORE_IS_3 + MATCH_TO_CONNECT + SCORE_IS_1},
                { 1, 3, SCORE_IS_1 + MATCH_TO_CONNECT + SCORE_IS_3},
                { 4, 1, WINNING_ANNOUNCEMENT + PLAYER_1},
                { 1, 4, WINNING_ANNOUNCEMENT + PLAYER_2},

                { 3, 2, SCORE_IS_3 + MATCH_TO_CONNECT + SCORE_IS_2},
                { 2, 3, SCORE_IS_2 + MATCH_TO_CONNECT + SCORE_IS_3},
                { 4, 2, WINNING_ANNOUNCEMENT + PLAYER_1},
                { 2, 4, WINNING_ANNOUNCEMENT + PLAYER_2},

                { 4, 3, NOTICE_OF_ADVANTAGE + PLAYER_1},
                { 3, 4, NOTICE_OF_ADVANTAGE + PLAYER_2},
                { 5, 4, NOTICE_OF_ADVANTAGE + PLAYER_1},
                { 4, 5, NOTICE_OF_ADVANTAGE + PLAYER_2},
                { 15, 14, NOTICE_OF_ADVANTAGE + PLAYER_1},
                { 14, 15, NOTICE_OF_ADVANTAGE + PLAYER_2},

                { 6, 4,  WINNING_ANNOUNCEMENT + PLAYER_1},
                { 4, 6,  WINNING_ANNOUNCEMENT + PLAYER_2},
                { 16, 14,  WINNING_ANNOUNCEMENT + PLAYER_1},
                { 14, 16,  WINNING_ANNOUNCEMENT + PLAYER_2},
        });
    }

    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        int player_1_score = 0;
        int player_2_score = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                player_1_score += 1;
            if (i < this.player2Score)
                player_2_score += 1;
        }
        assertEquals(this.expectedScore, TennisGame.getScoreAnnouncement("John", "Bill", player_1_score, player_2_score));
    }
}
