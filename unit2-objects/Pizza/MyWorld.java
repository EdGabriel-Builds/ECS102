import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Topping topping = new Topping("Pepperoni");
        addObject(topping,142,195);
        Topping topping2 = new Topping("Pepperoni");
        addObject(topping2,292,284);
        Topping topping3 = new Topping("Pepperoni");
        addObject(topping3,495,217);
        topping3.turn(3);
        Pizza pizza = new Pizza();
        addObject(pizza,297,179);
        pizza.getX();
        pizza.getY();
        pizza.setLocation(293,217);
        pizza.setLocation(299,244);
        topping2.setLocation(172,335);
        pizza.setLocation(292,274);
        pizza.getY();
        pizza.setLocation(296,292);
        pizza.getY();
        Topping topping4 = new Topping("Pepperoni");
        addObject(topping4,34,25);
        topping4.setLocation(47,50);
        topping4.getX();
        Topping topping5 = new Topping("Pepperoni");
        addObject(topping5,597,392);
        topping4.setLocation(39,32);
        topping4.setLocation(18,17);
        topping4.getX();
        Topping topping6 = new Topping("Pepperoni");
        addObject(topping6,230,49);
        Topping topping7 = new Topping("Pepperoni");
        addObject(topping7,371,159);
    }
}
