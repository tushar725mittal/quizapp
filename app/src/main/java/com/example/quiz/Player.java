package com.example.quiz;

public class Player {
    private int sno;
    private String playerName;
    private int score;

    public Player(){};

    public Player(int sno, String playerName, int score) {
        this.sno = sno;
        this.playerName = playerName;
        this.score = score;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
