package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class Patient {
    private Integer ID;
    private Integer age;
    private BloodData blood;
    
    public Patient(){
        this.ID=0;
        this.age=0;
        this.blood = new BloodData();
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BloodData getBlood() {
        return blood;
    }

    public void setBlood(BloodData blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Patient{" + "ID=" + ID + ", age=" + age + ", blood=" + blood + '}';
    }
    
    
}
