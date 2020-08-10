package system;

import clerk.Clerk;
import utils.Time;

import java.util.Vector;

/**
 * @author memoryrabbit
 * @version 1.0
 */
public class RegisterSystem {

    private Vector<Clerk> staff;

    public String add(String firstName, String lastName, Time birthday, Clerk.Post post) {
        staff.add(new Clerk(firstName, lastName, birthday, post));
        return String.format("Added new employee with identifier %d",staff.lastElement().getID());
    }
}
