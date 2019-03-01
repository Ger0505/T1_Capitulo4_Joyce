package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class SandwichFilling {
    private String filling_type;
    private Integer calories;

    public SandwichFilling(String filling_type, Integer calories) {
        this.filling_type = filling_type;
        this.calories = calories;
    }

    public String getFilling_type() {
        return filling_type;
    }

    public Integer getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SandwichFilling{" + "filling_type=" + filling_type + ", calories=" + calories + '}';
    }
    
    
    
}
