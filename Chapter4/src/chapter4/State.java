package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class State {
    
    private class City{
        private String name;
        private Integer population;

        public City(String name, Integer population) {
            this.name = name;
            this.population = population;
        }

        public String getName() {
            return name;
        }

        public Integer getPopulation() {
            return population;
        }

        @Override
        public String toString() {
            return "City{" + "name=" + name + ", population=" + population + '}';
        }
        
        
    }
   private String state;
   private Integer population;
   private City capital;
   private City most_city;

    public State(String state, Integer population,String capital_name,Integer pop_capital,String most_name,Integer pop_most) {
        this.state = state;
        this.population = population;
        this.capital = new City(capital_name,pop_capital);
        this.most_city = new City(most_name,pop_most);
    }

    public String getState() {
        return state;
    }

    public Integer getPopulation() {
        return population;
    }

    public City getCapital() {
        return capital;
    }

    public City getMost_city() {
        return most_city;
    }

    @Override
    public String toString() {
        return "State{" + "state=" + state + ",\n"
                + "population=" + population + ",\n"
                + "Capital=" + capital + ",\n"
                + "Ciudad más poblada=" + most_city + '}';
    }
    
    
   
   
}
