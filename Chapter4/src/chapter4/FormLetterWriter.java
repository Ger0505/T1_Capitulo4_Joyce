package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class FormLetterWriter {
    
    public static void displaySalutation(String last_name){
        System.out.println("Dear Mr. or Ms. "+last_name);
    }
    
    public static void displaySalutation(String first_name,String last_name){
        System.out.println("Dear "+first_name+" "+last_name);
    }
}
