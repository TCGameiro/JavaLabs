package _02_SoccerGame;

import java.sql.Array;

public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = new Goal[5];
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }


}
