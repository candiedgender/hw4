/**
* Runs the Olympics!
*
* @author cproenza3
* @version 1.0
*/
public class Olympics {

    /**
    * This is the maim method that runs the entire olympics.
    * @param args does nothing in this class
    */
    public static void main(String[] args) {
        Tennis t = new Tennis("Mx. Tennis", 59, true);
        Soccer s = new Soccer("Ms. Soccer", true, false);
        Javelin j = new Javelin("Mx. Javelin", 41.89, false);
        Hockey h = new Hockey("Mr. Hockey", true, true);

        Tennis fuckyou = new Tennis("Jorgan Fuckyounas", 20000000, true);

        Athlete[] game = {t, s, j, h, fuckyou};

        for (int i = 0; i < game.length; i++) {
            game[i].play();
        }

        System.out.println("");

        WorkOut w = new WorkOut();
        Compete co = new Compete();
        Food f = new Food();
        Cheat ch = new Cheat();

        for (int i = 0; i < game.length; i++) {
            w.trainAthletes(game[i]);
            co.organizeGames(game[i]);
            f.feedAthletes(game[i]);
            ch.inspectAthletes(game[i]);
            System.out.println("");
        }
    }
}