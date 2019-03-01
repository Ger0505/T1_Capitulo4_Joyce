package chapter4.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class Die {
    
    public static final Integer HIGHEST_DIE_VALUE=6;
    public static final Integer LOWEST_DIE_VALUE=1;
    
    private Integer value;

    public Die() {
        this.value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
        LOWEST_DIE_VALUE);
    }

    public Integer getValue() {
        return value;
    }
    
    
    
}
