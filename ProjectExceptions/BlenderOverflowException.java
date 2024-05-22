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
public class BlenderOverflowException extends Exception {

    @Override
    public String getMessage() {
        return ("Can not add the last Ingredient because total volume exceeds blender capacity \n The remained capacity in the blender = "); 
    }

}
