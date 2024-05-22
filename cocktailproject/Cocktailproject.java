/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailproject;

import ProjectExceptions.BlenderOverflowException;
import ProjectExceptions.BlenderIsEmptyException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *
 * @author ajymu
 */
public class Cocktailproject {

    /**
     * @param args the command line arguments
     * @throws cocktailproject.BlenderOverflowException
     * @throws cocktailproject.BlenderIsEmptyException
     */
    public static void main(String[] args) throws BlenderOverflowException, BlenderIsEmptyException {
        Scanner input = new Scanner(System.in);
        Cocktail drink = new Cocktail();
        Logger logger = new LoggerDataBase();
        drink.setLogger(logger);

        String menu = " Please , choose your Cocktail Ingredients : \n Firstly , choose the Fruits : \n \n 1.Apple (one >> 182g , 95 cal) \n 2.Banana (one >> 100g , 90 cal) "
                + "  \n 3.Kiwi (one >>80g , 61 cal) \n 4.Mango (one >>220g , 143 cal) \n 5.Strawberry (one >>21g , 7 cal) "
                + " \n 6.pineapple (one >>165g , 79 cal)  \n 7.grapes (one >>7g , 24 cal) \n 8.blueberry (one >> 2g , 4 cal) \n 9.peach (one >>150g , 59 cal)"
                + " \n \n Secondly : Your Milk type : \n 10.cow's milk ( 250 ml >> 155 cal ) \n 11. Almond milk (250 ml >> 45 cal) \n 12.Coconut milk (250 ml >> 440 cal ) \n 13.Lactose-free milk ( 250 ml >> 124 cal) "
                + "\n \n Here is the additions section for the cocktail if you want : \n 14.Nuts (20g , 121 cal) \n 15.Chocolate syrup (25g , 70 cal) \n 16.Sugar (16 cal) \n 17.Mix the ingredients I have chosen \n ";
        int choice;
        System.out.println(menu);
        do {
            do {
                try {
                    choice = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter one of these number 1 ... 16 to determine your choice");
                }
                input.nextLine();
            } while (true);
            if (choice > 17 || choice < 1) {
                System.out.println("Please enter one of the ubove choices : ");
                choice = input.nextInt();
                continue;
            }
            try {

                switch (choice) {
                    case 1:
                        Ingredients apple = new Fruits("Apple", 95, 1, 182, new DColor(255, 0, 0));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(apple);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println(" Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 2:
                        Ingredients banana = new Fruits("Banana", 89, 1, 100, new DColor(255, 223, 43));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(banana);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >>  that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;
                    case 3:
                        Ingredients kiwi = new Fruits("kiwi", 61, 1, 80, new DColor(162, 165, 104));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(kiwi);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;
                    case 4:
                        Ingredients mango = new Fruits("Mango", 143, 3, 220, new DColor(255, 87, 51));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(mango);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 5:
                        Ingredients strawberry = new Fruits("Strawberry", 7, 1, 21, new DColor(252, 90, 141));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(strawberry);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 6:
                        Ingredients pineapple = new Fruits("pineapple", 79, 4, 165, new DColor(254, 234, 99));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(pineapple);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 7:
                        Ingredients grapes = new Fruits("grapes", 24, 1, 7, new DColor(156, 39, 176));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(grapes);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 15 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 8:
                        Ingredients blueberry = new Fruits("Blueberry", 2, 1, 3, new DColor(79, 134, 247));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(blueberry);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 15 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 9:
                        Ingredients peach = new Fruits("peach", 59, 2, 150, new DColor(255, 229, 180));
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(peach);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 10:
                        Ingredients milk = new Milk();
                        milk = new Milk(" Cow's Milk", 130, milk.getVolume(), 2);
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(milk);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 11:
                        Ingredients almondmilk = new Milk();
                        almondmilk = new Milk("Almond Milk", 45, almondmilk.getVolume(), 4);
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(almondmilk);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }

                    case 12:
                        Ingredients coconutmilk = new Milk();
                        coconutmilk = new Milk("Coconut Milk", 440, coconutmilk.getVolume(), 4);
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(coconutmilk);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }

                        break;
                    case 13:
                        Ingredients lacmilk = new Milk();
                        lacmilk = new Milk("Lactose-free Milk", 124, lacmilk.getVolume(), 7);
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(lacmilk);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;
                    case 14:
                        Ingredients nut = new Nuts();
                        nut = new Nuts("Nuts ", 121, nut.getPrice(), nut.getVolume(), nut.getColor());
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(nut);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;
                    case 15:
                        Ingredients seryp = new ChocolateSerup();
                        seryp = new ChocolateSerup("Chocolate seryp", 70, seryp.getPrice(), seryp.getVolume(), seryp.getColor());
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(seryp);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 16:
                        Sugar sugar = new Sugar();
                        sugar = new Sugar("Sugar", 16, sugar.getPrice(), sugar.getVolume(), sugar.getColor());
                        drink.blender.setList(drink.ingredients);
                        try {
                            drink.blender.add(sugar);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + drink.blender.getRemainedcapacity());
                            System.out.println("Enter another ingredients << one or more >> that suits the remain capacity OR click 17 to mix the ingredients have been chosen");
                            continue;
                        }
                        break;

                    case 17:
                        try {
                            drink.blender.blend(drink.ingredients);
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + " , Enter the ingredients : ");
                            choice = input.nextInt();
                            continue;
                        }
                        System.out.println("Enter the size of the cup : \n 1. Small (200 ml ) \n 2.Medum (400 ml ) \n 3.Large (600 ml )");
                        int cupsize;
                        do {
                            do {
                                try {
                                    cupsize = input.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Please enter the valid cup size ");
                                }
                                input.nextLine();
                            } while (true);
                            if (1 > cupsize || 3 < cupsize) {
                                System.out.println("Enter the true choice to determine the cup size :");
                            }
                            switch (cupsize) {
                                case 1:
                                    Cup small = new Cup();
                                    small = new Cup(200, (int) (drink.blender.getCalPerMl() * 200));
                                    try {
                                        drink.blender.pour(small);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
//                                        continue;
                                    }
                                    break;
                                case 2:
                                    Cup med = new Cup();
                                    med = new Cup(400, (int) (drink.blender.getCalPerMl() * 400));
                                    try {
                                        drink.blender.pour(med);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
//                                        continue;

                                    }
                                    break;
                                case 3:
                                    Cup large = new Cup();
                                    large = new Cup(600, (int) (drink.blender.getCalPerMl() * 600));
                                    try {
                                        drink.blender.pour(large);
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
//                                        continue;
                                    }
                            }
                        } while (true);
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (choice != 17);
    }
}
