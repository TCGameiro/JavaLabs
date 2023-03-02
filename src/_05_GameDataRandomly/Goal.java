package _05_GameDataRandomly;

public class Goal {

    private Team team;
    private Player player;
    private double matchTime;

    public Goal(Team team, Player player, double matchTime) {
        this.team = team;
        this.player = player;
        this.matchTime = matchTime;
    }

    public Team getTeam() {
        return team;
    }

    public Player getPlayer() {
        return player;
    }

    public double getMatchTime() {
        return matchTime;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setMatchTime(double matchTime) {
        this.matchTime = matchTime;
    }

    @Override
    public String toString() {
        return "Goal scored after " + matchTime +
                " mins by" + player +
                " of " + team;
    }
}
