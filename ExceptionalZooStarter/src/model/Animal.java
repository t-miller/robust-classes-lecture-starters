package model;

import exceptions.AllergyException;
import exceptions.NotHungry;

public class Animal {

    private boolean isHungry = true;
    private boolean isAllergic = false;
    private int eaten = 0;

    public Animal (boolean hungry, boolean allergic){
        isHungry = hungry;
        isAllergic = allergic;
    }

    // getters
    public boolean isHungry() { return isHungry; }

    public int eat() throws NotHungry, AllergyException {
        if (!isHungry){
            System.out.println("Animal not hungry!");
            throw new NotHungry();
        }
        if (isAllergic){
            System.out.println("Animal is allergic!");
            throw new AllergyException();
        }
        isHungry = false;
        eaten++;
        return eaten;
    }


}