/**
 * Represents an Athlete that can play sports at the Olympics!
 * This file was violating the open/closed principle because, in order to add
 * an athlete, you had to modify Athlete.java. Now the athlete constructor and
 * play method have been altered to only include things that are common to all
 * athletes and you create an athlete by creating a new class. It also
 * partially violates single responsibility since it originally had getters that
 * only pertained to specific athletes and not all athletes.
 * @author cproenza3
 * @version 1.0
 */
public class Athlete {
    private int hunger;
    private String name;
    private String sport;
    private boolean isACheater;

    /**
     * Public constructor.
     *
     * @param name the name of the athlete.
     * @param sport the sport the athlete plays.
     * @param isACheater if this athlete is a cheater or not.
     */
    public Athlete(String name, String sport, boolean isACheater) {
        this.hunger = 0;
        this.name = name;
        this.sport = sport;
        this.isACheater = isACheater;
    }

    /**
     * @return the hunger of this athlete.
     */
    public int getHunger() {
        return this.hunger;
    }

    /**
     * @return the name of this athlete.
     */
    public String getName() {
        return this.name;
    }


    /**
     * @return whether or not this athlete is a cheater.
     */
    public boolean getIsACheater() {
        return this.isACheater;
    }

    /**
     * Has the athlete exercise. Will make the athlete hungry by increasing
     * their hunger by the number of pushups.
     * This stays in the athlete class instead of moving since every athlete
     * needs to exercise.
     * @param numberOfPushups the number of pushups the athlete should do.
     */
    public void exercise(int numberOfPushups) {
        System.out.println(String.format("%s does %d pushups and works up"
            + " quite an appetite!", getName(), numberOfPushups));
        this.hunger += numberOfPushups;
    }

    /**
     * Has the athlete eat some food to decrease their hunger by foodAmount.
     * This stays in the athlete class instead of moving because all of the
     * athletes need to eat.
     * @param foodAmount how much to decrease hunger by.
     * @param foodType the type of food the athlete eats.
     */
    public void eat(int foodAmount, String foodType) {
        System.out.println(String.format("%s eats %d of the %s!",
            getName(), foodAmount, foodType));
        this.hunger = Math.max(this.hunger - foodAmount, 0);
    }

    /**
     * Has the athlete play something for their particular sport. This method
     * doesn't move because all athletes play the game and it is simply
     * overriden when a specific athlete is called in Olympics.
     */
    public void play() {
        System.out.println(String.format("%s can't play a sport!",
                    getName()));
    }
}
