/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailproject;

import java.util.ArrayList;

/**
 *
 * @author ajymu
 */
public class Cocktail {

    Blender blender = new Blender();
    ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();
    private Logger logger ; 

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Cocktail() {
    }

    public Blender getBlender() {
        return blender;
    }

    public void setBlender(Blender blender) {
        this.blender = blender;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

}
