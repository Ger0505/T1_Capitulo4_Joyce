package chapter4.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class RentalDemo {
    
    public static void testRental(){
        Rental r1 = new Rental();
        Rental r2 = new Rental("G003",200);
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
