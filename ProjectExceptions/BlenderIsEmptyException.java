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
public class BlenderIsEmptyException extends Exception {

    @Override
    public String getMessage() {
        return ("There is No Ingredients , Blender is Empty !");

    }

}
