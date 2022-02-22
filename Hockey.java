/**
* Represents a hockey player that can fight other players
*
* @author cproenza3
* @version 1.0
*/
public class Hockey extends Athlete {
    private boolean canFight;

    /**
    * Public constructor for the hockey player
    * @param name is the name of the athlete.
    * @param canFight is whether or not the player will fight another player.
    * @param isACheater if this athlete is a cheater or not.
    */
    public Hockey(String name, boolean canFight, boolean isACheater) {
        super(name, "Hockey", isACheater);
        this.canFight = canFight;
    }

    /**
    * Determines if canFight is true or not
    * @return whether or not this player will fight another player
    */
    public boolean getCanFight() {
        return this.canFight;
    }

    /**
    * Has the athlete get angry and decides whether they fight or not
    */
    public void fight() {
        System.out.println(String.format("%s is becoming angry %s",
            getName(), canFight ? "and is ready to fight!"
            : "but will not fight!"));
    }

    @Override
    public void play() {
        fight();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Hockey)) {
            return false;
        }
        Hockey h = (Hockey) other;
        return h.getName().equals(this.getName());
    }
}