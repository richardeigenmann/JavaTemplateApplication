package org.me;

/**
 * A Sample Class
 * @author Richard Eigenmann
 */
public class Animal {
    public Animal( String name, int legs, int speed ) {
        this.name = name;
        this.legs = legs;
        this.speed = speed;
    }
    
    private String name;
    public String getName() {
        return name;
    }
    
    private int legs;
    public int getLegs() {
        return legs;
    }

    public int getSpeed() {
        return speed;
    }
    private int speed;
    
}
