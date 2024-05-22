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
public class Milk extends Ingredients {

    private int volume = 250;

    public Milk(String name, int calories, int volume, int price) {
        super(name, calories, price );
        this.volume = 250;
        this.price = price;
    }

    public Milk() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public DColor getColor() {
        return new DColor(255, 255, 255);
    }

    @Override
    public String getInfo() {

        return("Name : " + getName() + "\n Calories = " + getCalories() + "\n Price = " + getPrice() + "\n Volume = " + getVolume() + "\n Color  :" + getColor());
    }

}
