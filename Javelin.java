/**
* Represents a javelin player that can do damage
*
* @author cproenza3
* @version 1.0
*/
public class Javelin extends Athlete {
    private double javelinDamage;

    /**
    * Public constructor for the javelin player
    * @param name is the name of the athlete.
    * @param javelinDamage is the damage that a javelin does.
    * @param isACheater if this athlete is a cheater or not.
    */
    public Javelin(String name, double javelinDamage, boolean isACheater) {
        super(name, "Javelin", isACheater);
        this.javelinDamage = javelinDamage;
    }

    /**
     * @return the damage this athlete's javelin inflicts.
     */
    public double getJavelinDamage() {
        return this.javelinDamage;
    }

    /**
     * Has the athlete throw their javelin.
     */
    public void throwJavelin() {
        System.out.println(String.format("%s throws the javelin and inflicts"
            + " %f damage!", getName(), this.javelinDamage));
    }

    @Override
    public void play() {
        throwJavelin();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Javelin)) {
            return false;
        }
        Javelin j = (Javelin) other;
        return j.getName().equals(this.getName());
    }
}