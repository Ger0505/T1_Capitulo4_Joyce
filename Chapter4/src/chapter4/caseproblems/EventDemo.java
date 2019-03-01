package chapter4.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class EventDemo {
    public static void testEvent(){
        Event event = new Event();
        Event event1 = new Event("G003",100);
        
        System.out.println(event.toString());
        System.out.println(event1.toString());
    }
}
