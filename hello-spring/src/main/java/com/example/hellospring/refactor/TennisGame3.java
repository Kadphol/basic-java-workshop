package com.example.hellospring.refactor;

public class TennisGame3 {

    private int player2Score;
    private int player1Score;
    private final String player1Name;
    private final String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String result;
        if (isNotDeuce()) {
            String[] scoreSet = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            result = scoreSet[player1Score];
            if(isDraw()) {
                return result + "-All";
            }
            return result + "-" + scoreSet[player2Score];
        } else {
            if (isDraw()) {
                return "Deuce";
            }
            result = getWiningPlayer();
            if(isAdvantage()) {
                return "Advantage " + result;
            }
            return "Win for " + result;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player1Score += 1;
        else
            this.player2Score += 1;

    }

    private boolean isNotDeuce() {
        return player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6);
    }

    private boolean isDraw() {
        return player1Score == player2Score;
    }

    private boolean isAdvantage() {
        return (player1Score - player2Score)*(player1Score - player2Score) == 1;
    }

    private String getWiningPlayer() {
        return player1Score > player2Score ? player1Name : player2Name;
    }

}
