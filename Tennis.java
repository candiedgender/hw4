/**
* Represents a tennis player that can serve the ball
*
* @author cproenza3
* @version 1.0
*/
public class Tennis extends Athlete {
    private int serveSpeed;


    /**
    * Public constructor for the tennis player
    * @param name is the name of the athlete.
    * @param serveSpeed is how fast the player serves the ball.
    * @param isACheater if this athlete is a cheater or not.
    */
    public Tennis(String name, int serveSpeed, boolean isACheater) {
        super(name, "Tennis", isACheater);
        this.serveSpeed = serveSpeed;
    }

    /**
    * This gives the speed of the tennis serve
    * @return the tennis serve speed of this athlete.
    */
    public int getServeSpeed() {
        return this.serveSpeed;
    }


    /**
     * Has the athlete serve a tennis ball.
     */
    public void serve() {
        System.out.println(String.format("%s serves the ball at %dmph!",
            getName(), this.serveSpeed));
    }

    @Override
    public void play() {
        serve();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Tennis)) {
            return false;
        }
        Tennis t = (Tennis) other;
        return t.getName().equals(this.getName())
        && t.serveSpeed == this.serveSpeed
        && t.getIsACheater() == this.getIsACheater();
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash += 31 * hash + getName().hashCode();
        hash += 31 * hash + serveSpeed;
        hash += 31 * hash + (getIsACheater() ? 1 : 0);
        return hash;
    }

}