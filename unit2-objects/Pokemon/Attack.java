import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Actor
{
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private String name;
    private int power;
    public Attack (String name) {
        this.name=name;
    }
    
    public Attack(String name, int power) {
        this.name=name;
        this.power=power;
    }
    
    public int getPower() {
        return this.power;
    }
    
    public void act()
    {
        
    }
}
