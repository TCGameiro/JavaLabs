package _01_SoccerLeague;

public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private String[] goals;

    public Game(Team homeTeam, Team awayTeam, String[] goals) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = goals;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public String[] getGoals() {
        return goals;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setGoals(String[] goals) {
        this.goals = goals;
    }
}
