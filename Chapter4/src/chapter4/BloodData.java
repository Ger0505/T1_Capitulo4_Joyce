package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class BloodData {
    public static final String A = "A";
    public static final String  B = "B";
    public static final String AB = "AB";
    public static final String  O = "O";
    public static final char POSITIVO = '+';
    public static final char NEGATIVO = '-';
    
    private String type;
    private char Rh;

    public BloodData(String type, char Rh) {
        this.type = type;
        this.Rh = Rh;
    }

    public BloodData() {
        this.type = O;
        this.Rh = POSITIVO;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getRh() {
        return Rh;
    }

    public void setRh(char Rh) {
        this.Rh = Rh;
    }

    @Override
    public String toString() {
        return "BloodData{" + "type=" + type + ", Rh=" + Rh + '}';
    }
    
    
}
