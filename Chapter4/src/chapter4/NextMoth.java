package chapter4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Gerardo A A
 */
public class NextMoth {
    public static void nextMoth(){
        Calendar c1 = new GregorianCalendar();
        System.out.println("Faltan "+(c1.getActualMaximum(Calendar.DAY_OF_MONTH)-c1.get(Calendar.DAY_OF_MONTH)+1)+" dias para el próximo mes");
    }
}
