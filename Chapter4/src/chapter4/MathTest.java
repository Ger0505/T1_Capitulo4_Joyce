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
public class MathTest {

    public static void mathTest() {
        System.out.println("Raíz Cuadrada de 37 = "+Math.sqrt(37));
        System.out.println("Seno de 300 = "+Math.sin(300));
        System.out.println("Coseno de 300 = "+Math.cos(300));
        System.out.println("Floor,Ceil,Round de 22.8 = "+Math.floor(22.8)+" "+Math.ceil(22.8)+" "+Math.round(22.8));
        System.out.println("El Max y el Min de D y 71 = "+Math.max('D',71)+" "+Math.min('D',71));
        System.out.println((int)(Math.random()*20)+1);
    }
    
}
