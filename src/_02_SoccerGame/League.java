package _02_SoccerGame;

public class League {
    public static void main(String[] args) {

        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");

        Player[] playersArr1={player1,player2,player3};

        Team homeTeam = new Team("The Greens", playersArr1);

        //player1.setPlayerName("RobertService");

        Player player4 = new Player("Robert Service");
        Player player5 = new Player("Robbie Burns");
        Player player6 = new Player("Rafael Sabatini");

        Player[] playersArr2 = {player4,player5,player6};

        Team awayTeam = new Team("The Reds",playersArr2);

        Game game1 = new Game(homeTeam, awayTeam);
        Goal goal1 = new Goal(homeTeam, player3, 55);

        game1.setGoals(new Goal[]{goal1});

        System.out.println(goal1);





    }
}
