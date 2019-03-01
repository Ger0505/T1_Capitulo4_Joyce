package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class TestCircle{
    
    public static void testCircles(Circle ... c){
        for(Circle cir:c)
            System.out.println(cir.toString());
    }
    
}
