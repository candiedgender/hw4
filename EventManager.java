/**
 * Represents a very overworked event manager. This class super violated the
 * single responsibility principle as it was trying to manage many unrelated
 * tasks that had nothing to do with event managing like feeding the athletes
 * or having them train. These methods have since been moved to other classes
 * and event manager has nothing in it. The only spot I saw where it violated
 * open/close was for feeding the athletes. You would have to modify event
 * manager if you wanted to add another food for the athletes to eat.
 * @author cproenza3
 * @version 1.0
 */
public class EventManager {
}