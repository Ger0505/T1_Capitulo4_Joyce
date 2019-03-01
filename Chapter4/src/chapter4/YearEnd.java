/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Gerardo A A
 */
public class YearEnd {
    public static void lastDay(){
        Calendar c = new GregorianCalendar();
        System.out.println("Faltan "+(c.getActualMaximum(Calendar.DAY_OF_YEAR)-c.get(Calendar.DAY_OF_YEAR))+" dias para fin de año");
    }
}
