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
public class Nuts extends Ingredients {

    private int volume;
    private DColor color;

    public Nuts() {
    }

    public Nuts(String name, int calories, int price, int volume, DColor color) {
        super(name, calories, price);
        this.volume = 20;
        this.color = new DColor(204, 122, 53);
        this.price = 10;
    }

    @Override
    public int getVolume() {
        return 20;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public DColor getColor() {
        return new DColor(204, 122, 53);
    }

    @Override
    public String getName() {
        return name;
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
