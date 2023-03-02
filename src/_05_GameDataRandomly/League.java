package _05_GameDataRandomly;

public class League {
    public static void main(String[] args) {


        Team[] teams = createTeams();
        Game[] game1 = createGames(teams);

        System.out.println(game1[0].toString());
    }

    public static Team[] createTeams(){

        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");

        Player[] playersArr1={player1,player2,player3};

        Player player4 = new Player("Robert Service");
        Player player5 = new Player("Robbie Burns");
        Player player6 = new Player("Rafael Sabatini");

        Player[] playersArr2 = {player4,player5,player6};

        Team homeTeam = new Team("The Greens",playersArr1);
        Team awayTeam = new Team("The Reds",playersArr2);

        return new Team[]{homeTeam,awayTeam};
    }

    public static Game[] createGames(Team[] teams){
        Game game1 = new Game(teams[0], teams[1]);
        Goal goal1 = new Goal(teams[0], teams[0].getPlayers()[2], 55);
        game1.setGoals(new Goal[]{goal1});

        return new Game[]{game1};
    }

}
