package org.me;

import org.joda.time.LocalTime;

/**
 * The main class
 * @author Richard Eigenmann
 */
public class JavaApplicationMeOrg {

    /**
     * The main function
     * @param args the command line arguments
     */
    public static void main ( String[] args ) {
        System.out.println ("Hello World");

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Animal crocodile = new Animal ("Fred", 4, 20);
        System.out.println (String.format (
                "Animal %s has %d legs and a speed of %d", crocodile.getName (),
                crocodile.getLegs (), crocodile.getSpeed ()));
    }

}
