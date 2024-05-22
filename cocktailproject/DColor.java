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
public class DColor {
      public DColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    private int r;
    private int g;
    private int b;

    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
    
    public void getInfo(){
    
        System.out.println("Red = " + getR() + " Green = " + getG() +  "Blue =" + getB());
    }
    
}


