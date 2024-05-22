/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailproject;

/**
 *
 * @author ajymu
 */
public abstract class Ingredients {

    protected String name;
    protected int calories;
    protected int price;
    protected DColor color ;

    public Ingredients(String name, int calories, int price ) {
        this.name = name;
        this.calories = calories;
        this.price = price;

    }

    public Ingredients() {
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    public abstract int getVolume();

    public abstract DColor getColor();
    
    public abstract int getPrice();
    public abstract String getInfo();
}
