import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor
{
    /**
     * Act - do whatever the Pokemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    
    public Pokemon(int hp, int ap, String name, String attack, String type) {
        this.hp=hp;
        this.ap=ap;
        this.name = name;
        this.attack = new Attack(attack);
        this.img = new GreenfootImage(name+".png");
        this.outStatus=false;
        this.type=type;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void attack(String name, User enemy) {
        
    }
    
    public void takeDamage(int amount) {
        this.hp=this.hp-amount;
    }
    
    
    public void act()
    {
        // Add your action code here.
    }
}
