package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class TestSandwichFilling {
     public static void testFillings() {
        SandwichFilling [] panaderia = {new SandwichFilling("Tomate",50),new SandwichFilling("Lettuce",10),new SandwichFilling("Egg Salada",20)};
         System.out.println("INGREDIENTES:");
        for(SandwichFilling pan:panaderia)
            System.out.println(pan.toString());
    }

}
