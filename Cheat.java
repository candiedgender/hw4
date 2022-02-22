/**
 * Runs an inspection to discover if the atheltes have been cheating.
 *
 * @author cproenza3
 * @version 1.0
 */
public class Cheat {
    /**
     * Inspects all of the passed in athletes.
     *
     * @param athletes the athletes to inspect.
     * @return if an athlete is a cheater.
     */
    public boolean inspectAthletes(Athlete... athletes) {
        boolean foundCheater = false;
        for (Athlete athlete : athletes) {
            foundCheater = interrogateAthlete(athlete) || foundCheater;
        }
        return foundCheater;
    }

    /**
     * Interrogates one athlete.
     * @param athlete the athlete to interrogate.
     * @return if the athlete is a cheater.
     */
    private boolean interrogateAthlete(Athlete athlete) {
        System.out.println(athlete.getName()
            + ", have you been cheating?!");
        System.out.println("No, sir!");
        if (athlete.getIsACheater()) {
            System.out.println("I don't believe you!");
            return true;
        } else {
            System.out.println("K");
            return false;
        }
    }
}