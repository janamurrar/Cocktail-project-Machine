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
public class Fruits extends Ingredients {

    private int volume;
    private DColor color;

    public Fruits(String name, int calories, int price, int volume , DColor color ) {
        super(name, calories, price);
        this.volume = volume;
        this.color = color;
    }

    public Fruits() {
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public DColor getColor() {
        return this.color;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getInfo() {

        return("Name : " + getName() + "\n Calories = " + getCalories() + "\n Price = " + getPrice() + "\n Volume = " + getVolume() + "\n Color  :" + getColor());
    }

}
