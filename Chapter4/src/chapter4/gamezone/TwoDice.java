package chapter4.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class TwoDice {
    
    public static void throwsDice(){
        Die dado1 = new Die();
        Die dado2 = new Die();
        System.out.println("Resultados de los datos: "+dado1.getValue()+" y "+dado2.getValue());
    }
}
