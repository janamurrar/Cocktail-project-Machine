/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectExceptions;

/**
 *
 * @author ajymu
 */
public class TheIngredientsNotEnough extends Exception {
     @Override
    public String getMessage() {
        return ("The size of the drink, depending on the ingredients you chose, is not enough for the size of the cup you chose ");

    }
    
}
