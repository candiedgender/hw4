import java.util.Random;
/**
 * Allows the athletes to exercise.
 *
 * @author cproenza3
 * @version 1.0
 */
public class WorkOut {

    /**
     * Makes a group of athletes exercise.
     *
     * @param athletes the athletes to exercise.
     */
    public void trainAthletes(Athlete... athletes) {
        for (Athlete athlete : athletes) {
            athlete.exercise(pickNumberOfPushups());
        }
    }

     /**
     * @return a random number in the range [10, 30] for number of pushups.
     */
    private int pickNumberOfPushups() {
        Random rand = new Random();
        int numberOfPushups = rand.nextInt(20) + 11;
        System.out.println("Drop and give me " + numberOfPushups + "!");
        return numberOfPushups;
    }
}