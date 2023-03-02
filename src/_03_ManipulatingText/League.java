package _03_ManipulatingText;

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

        for(int idx = 0; idx< playersArr2.length; idx++){
            if(playersArr2[idx].toString().contains("Sab")){
                System.out.println("Found " + playersArr2[idx].getPlayerName());
                int index = playersArr2[idx].getPlayerName().indexOf(' ');
                System.out.println("Last name is" + playersArr2[idx].getPlayerName().substring(index));
            }
        }

        for(int indx = 0; indx < playersArr1.length; indx++){
            int index = playersArr1[indx].getPlayerName().indexOf(' ');
            System.out.println(playersArr1[indx].getPlayerName().substring(index) + ", " + playersArr1[indx].getPlayerName().substring(0,index));
        }




    }
}
