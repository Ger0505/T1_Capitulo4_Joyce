package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class BirdSighting {
    private String specie;
    private Integer seen;
    private Integer day_of_year;
    
    public BirdSighting(){
        this.specie = "Robin";
        this.seen = 0;
        this.day_of_year = 1;
    }
    
    public BirdSighting(String specie,Integer seen,Integer number_day){
        this.specie = specie;
        this.seen = seen;
        this.day_of_year = number_day;
    }
    
    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public Integer getSeen() {
        return seen;
    }

    public void setSeen(Integer seen) {
        this.seen = seen;
    }

    public Integer getDay_of_year() {
        return day_of_year;
    }

    public void setDay_of_year(Integer day_of_year) {
        this.day_of_year = day_of_year;
    }

    @Override
    public String toString() {
        return "BirdSighting{" + "specie=" + specie + ", seen=" + seen + ", day_of_year=" + day_of_year + '}';
    }
    
    
    
}
