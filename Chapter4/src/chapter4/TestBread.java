package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class TestBread {

    public static void testBread() {
        Bread [] panaderia = {new Bread("Horn",100),new Bread("Sauce",200),new Bread("Air",20)};
        System.out.println("PAN:");
        for(Bread pan:panaderia)
            System.out.println(pan.toString());
    }
    
}
