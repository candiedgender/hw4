/**
 * Allows the athletes to eat food assuming that groceries have been bought.
 *
 * @author cproenza3
 * @version 1.0
 */
public class Food {
    private boolean hasGroceries;
    private String[] food = {"Stew", "Chili", "Sandwich", "Protein Shake",
        "Veggies"};
    private int nextFood;

    /**
     * Makes a group of athletes eat.
     * @param athletes the athletes to feed.
     */
    public void feedAthletes(Athlete... athletes) {
        if (hasGroceries) {
            for (Athlete athlete : athletes) {
                athlete.eat(10, chooseFood());
            }
            hasGroceries = false;
        } else {
            System.out.println("Can't feed them without groceries!");
            driveToGroceryStore();
            feedAthletes(athletes);
        }
    }

    /**
     * Gets the groceries to cook for the athletes.
     */
    private void driveToGroceryStore() {
        System.out.println("Time to get some groceries!");
        this.hasGroceries = true;
    }

    /**
     * @return the next food item to feed the athletes.
     */
    private String chooseFood() {
        return food[(nextFood++) % food.length];
    }
}