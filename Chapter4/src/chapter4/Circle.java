package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class Circle {
    private Double radius;
    private Double diameter;
    private Double area;

    public Circle() {
        this.radius = 1.0;
        this.diameter=this.radius*2;
        this.area = Math.PI*Math.pow(radius,2);         
    }

    public void setRadius(Double radius) {
        this.radius = radius;
        this.diameter=radius*2;
        this.area = Math.PI*Math.pow(radius,2);
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + ", area=" + area + '}';
    }
    
    
    
    
}
