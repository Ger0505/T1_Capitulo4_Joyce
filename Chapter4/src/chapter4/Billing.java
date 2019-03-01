package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class Billing {
    
    public static final Double TAX = 0.08;
    
    public static Double computeBill(Double price){
        return price+price*TAX;
    }
    
    public static Double computeBill(Double price,Integer quantity){
        Double total = price*quantity;
        return total+total*TAX;
    }
    
    public static Double computeBill(Double price,Integer quantity,Double coupon){
         Double total = price*quantity-coupon;
         return total+total*TAX;
    }
    
}
