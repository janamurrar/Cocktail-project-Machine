
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailproject;

import ProjectExceptions.TheIngredientsNotEnough;
import ProjectExceptions.BlenderOverflowException;
import ProjectExceptions.BlenderIsEmptyException;
import java.util.ArrayList;

/**
 *
 * @author ajymu
 */
public class Blender {

    private ArrayList<Ingredients> list = new ArrayList();
    private int capacity = 1500;
    private int calories;
    private DColor color;
    private double calPerMl;
    private int totalvolume;
    private Cup cup;
    private int remainedcapacity;
    private int totalPrice;
    private int price, cupsnum;

    public Blender(int capacity) {
        this.capacity = 1500;
        this.list = new ArrayList();
    }

    public Blender() {
    }

    public void add(Ingredients ingredient) throws BlenderOverflowException {
        if ((this.totalvolume + ingredient.getVolume()) > this.capacity) {
            throw new BlenderOverflowException();

        } else {
            this.list.add(ingredient);
            this.totalvolume += ingredient.getVolume();
            remainedcapacity = (this.capacity - this.totalvolume);
            this.totalPrice += ingredient.getPrice();
        }
    }

    public void blend(ArrayList<Ingredients> ingredients) throws BlenderIsEmptyException {

        if (this.list.isEmpty()) {
            throw new BlenderIsEmptyException();
        } else {
            int totalR = 0;
            int totalG = 0;
            int totalB = 0;

            for (Ingredients ing : this.list) {
                totalR += ing.getColor().getR();
                totalG += ing.getColor().getG();
                totalB += ing.getColor().getB();
                this.calories += ing.getCalories();
            }
            int ingredientsnum = ingredients.size();
            System.out.println("Cocktail color in RGB color system : ( " + (totalR / ingredientsnum) + " , " + (totalG / ingredientsnum) + " , " + (totalB / ingredientsnum) + " ) ");
            this.calPerMl = (double) (this.calories) / (double) (this.totalvolume);
            this.list.clear();

        }
    }

    public void pour(Cup cup) throws BlenderIsEmptyException, TheIngredientsNotEnough {

        cupsnum = (this.totalvolume / cup.getCapacity());
        if (cupsnum > 0) {
            try {
                price = (this.totalPrice) / cupsnum;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (this.totalvolume >= cup.getCapacity()) {
            System.out.println("The amount has " + (this.totalvolume * this.calPerMl) + " cal \n");
            System.out.println("This quantity can pour " + cupsnum + " cups of size " + cup.getCapacity() + "ml \n ");
            System.out.println("The calories in each Cup = " + cup.getCalories() + " Cal \n");
            System.out.println("Each cup price = " + price + " NIS \n ");
            for (int i = 1; i <= cupsnum; i++) {
                cup.setCalories((int) (cup.getCapacity() * this.calPerMl));
                this.totalvolume -= cup.getCapacity();
                System.out.println("Cup # " + i + " DONE !");
                if (totalvolume == 0) {
                    throw new BlenderIsEmptyException();
                }
            }
            System.out.println(" \n The Volume of the Remaining Drink is not enough to pour another Cup of Size " + cup.getCapacity() + " ml");
            System.out.println("The Remain Quantity = " + this.totalvolume + "ml");
            cup.setCalories((int) (this.totalvolume * this.calPerMl));
            System.out.println("The Calories in this quantity = " + cup.getCalories() + "cal");
//            this.totalvolume -= cup.getCapacity();
            System.out.println("\nDrink was poured into the cup successfully !");
        } else {
            throw new TheIngredientsNotEnough();
//            System.out.println(" The size of the drink, depending on the ingredients you chose, is not enough for the size of the cup you chose");
//            System.out.println("The quantity = " + this.totalvolume + "ml");
//            cup.setCalories((int) (this.totalvolume * this.calPerMl));
//            System.out.println("The calories in this quantity = " + cup.getCalories() + "cal");
//            this.totalvolume -= cup.getCapacity();
////            System.out.println("\nDrink was poured into the cup successfully !");

        }

    }

    public ArrayList<Ingredients> getList() {
        return list;
    }

    public void setList(ArrayList<Ingredients> list) {
        this.list = list;
    }

    public int getRemainedcapacity() {
        return remainedcapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVolume() {
        return totalvolume;
    }

    public int getCalories() {
        return calories;
    }

    public DColor getColor() {
        return color;
    }

    public double getCalPerMl() {
        return calPerMl;

    }

    public int getTotalvolume() {
        return totalvolume;
    }

    public int getCupsnum() {
        return cupsnum;
    }

    public int getPrice() {
        return price;
    }

    public String getInfo() {
        return ("Blender capacity = " + getCapacity() + " \n Calories = " + getCalories() + "\n Calories Per Ml = " + getCalPerMl() + " \n Color : " + getColor()
                + "\n Ingredients Volume = " + getVolume() + "\n Remained Capacity = " + getRemainedcapacity());
    }

}
