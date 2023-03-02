package _01_SoccerLeague;

public class League {
    public static void main(String[] args) {

        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");

        Player[] playersArr1={player1,player2,player3};

        Team team1 = new Team("The Greens", playersArr1);

        //player1.setPlayerName("RobertService");

        for(int i = 0; i < playersArr1.length; i++){
            System.out.println(playersArr1[i]);
        }

        Player player4 = new Player("Robert Service");
        Player player5 = new Player("Robbie Burns");
        Player player6 = new Player("Rafael Sabatini");

        Player playersArr2[] = {player4,player5,player6};

        Team team2 = new Team("The Reds",playersArr2);

        for(int i = 0; i < playersArr2.length; i++){
            System.out.println(playersArr2[i]);
        }


    }
}
