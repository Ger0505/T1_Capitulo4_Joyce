package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class TestBirdSighting {

    public TestBirdSighting(String name,Integer seen,Integer days) {
        BirdSighting2 bird = new BirdSighting2(name,seen,days);
        System.out.println(bird.toString());
    }
    
}
