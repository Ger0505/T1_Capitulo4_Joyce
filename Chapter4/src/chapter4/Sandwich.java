package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class Sandwich {
    private Bread pan;
    private SandwichFilling ingre;
    private Integer Total_calories=0;

    public Sandwich(Bread pan, SandwichFilling ingre) {
        this.pan = pan;
        this.ingre = ingre;
        
        Total_calories+=(pan.getCalories()+pan.getCalories());
    }

    @Override
    public String toString() {
        return "Sandwich{" + "pan=" + pan.getType() + ", ingre=" + ingre.getFilling_type() +", calories="+this.Total_calories+'}';
    }
    
    
}
