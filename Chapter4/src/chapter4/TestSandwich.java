package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class TestSandwich {
     public static void testFillings() {
        SandwichFilling [] cond = {new SandwichFilling("Tomate",50),new SandwichFilling("Lettuce",10),new SandwichFilling("Egg Salada",20)};
        Bread [] pan = {new Bread("Horn",100),new Bread("Sauce",200),new Bread("Air",20)};
        Sandwich [] sandwichera = {new Sandwich(pan[0],cond[0]),new Sandwich(pan[1],cond[1]),new Sandwich(pan[2],cond[2])};
         System.out.println("SANDWICHES:");
        for(Sandwich sand:sandwichera)
            System.out.println(sand.toString());
    }
}
