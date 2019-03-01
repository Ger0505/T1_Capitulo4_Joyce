package chapter4.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class FiveDice {
    public static void throwsDice(){
        int i = 0;
        Die [] tiros = new Die[10];
        System.out.println("Mis tiros:");
        for(Die t:tiros){
            t = new Die();
            System.out.println(t.getValue());
            if(i==4) System.out.println("The Computer:");
            i++;
        }
    }
}
