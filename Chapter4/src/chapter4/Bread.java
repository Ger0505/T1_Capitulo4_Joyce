/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class Bread {
    
    public final static String MOTTO = "The staff of life";
    
    private String type;
    private Integer calories;

    public Bread(String type, Integer calories) {
        this.type = type;
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public Integer getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Bread{" + "type=" + type + ", calories=" + calories + '}';
    }
    
    
}
