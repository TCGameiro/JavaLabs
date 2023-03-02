package _04_UsingMethods;

public class Team {

    private String teamName;
    private Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return teamName;
    }
}
