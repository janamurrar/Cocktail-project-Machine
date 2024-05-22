
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
public class Cup {

    private int capacity;
    private int calories;

    public Cup(int capacity, int calories) {
        this.capacity = capacity;
        this.calories = calories;
    }

    public Cup() {
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void getInfo(){
    
        System.out.println("Cup capacity = " + getCapacity() + "Calories = " + getCalories());
    }

}
