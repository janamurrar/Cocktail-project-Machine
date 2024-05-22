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
public class Sugar extends Ingredients {

    private int volume;
    private DColor color;

    public Sugar(String name, int calories, int price, int volume, DColor color) {
        super(name, calories, price);
        this.volume = 0;
        this.color = new DColor(245, 245, 242);
        this.price = 1;
    }

    public Sugar() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public DColor getColor() {
        return new DColor(245, 245, 242);
    }

    @Override
    public String getInfo() {

        return("Name : " + getName() + "\n Calories = " + getCalories() + "\n Price = " + getPrice() + "\n Volume = " + getVolume() + "\n Color  :" + getColor());

    }
}
