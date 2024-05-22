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
public class ChocolateSerup extends Ingredients {

    private int volume;
    private DColor color;

    public ChocolateSerup() {
    }

    public ChocolateSerup(String name, int calories, int price, int volume , DColor color) {
        super(name, calories, price);
        this.volume = 25;
        this.color = new DColor(114, 59, 41);
        this.price = 5;
    }

    public ChocolateSerup(int volume, DColor color) {
        this.volume = volume;
        this.color = color;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getVolume() {
        return 25;
    }

    @Override
    public DColor getColor() {
        return new DColor(114, 59, 41);
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public String getInfo() {

        return("Name : " + getName() + "\n Calories = " + getCalories() + "\n Price = " + getPrice() + "\n Volume = " + getVolume() + "\n Color  :" + getColor());
    }
}
