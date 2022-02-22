/**
* Represents a soccer player that can attempt to score a goal
*
* @author cproenza3
* @version 1.0
*/
public class Soccer extends Athlete {
    private boolean canScoreGoal;

    /**
    * Public constructor for the soccer player
    * @param name is the name of the athlete.
    * @param canScoreGoal whether or not this athlete can score a soccer goal.
    * @param isACheater if this athlete is a cheater or not.
    */
    public Soccer(String name, boolean canScoreGoal, boolean isACheater) {
        super(name, "Soccer", isACheater);
        this.canScoreGoal = canScoreGoal;
    }

    /**
    * Determines if the player can score a goal
    * @return whether or not this athlete is good at soccer.
    */
    public boolean getCanScoreGoal() {
        return this.canScoreGoal;
    }


    /**
    * Has the athlete shoot for a goal.
    */
    public void shootForGoal() {
        System.out.println(String.format("%s shoots and %s!",
            getName(), canScoreGoal ? "scores" : "misses"));
    }

    @Override
    public void play() {
        shootForGoal();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Soccer)) {
            return false;
        }
        Soccer s = (Soccer) other;
        return s.getName().equals(this.getName()) && s.canScoreGoal
        == this.canScoreGoal && s.getIsACheater() == this.getIsACheater();
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash += 31 * hash + getName().hashCode();
        hash += 31 * hash + (canScoreGoal ? 1 : 0);
        hash += 31 * hash + (getIsACheater() ? 1 : 0);
        return hash;
    }
}