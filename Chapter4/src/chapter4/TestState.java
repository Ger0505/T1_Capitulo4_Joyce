package chapter4;

/**
 *
 * @author Gerardo A A
 */
public class TestState {
    public static void testState(){
        State Oaxaca = new State("Oaxaca",1000000,"Oaxaca City",500000,"Tlaxiaco",20000);
        State Chiapas = new State("Chiapas",2000000,"Tuxtla Guitiérrez",500000,"Cañon",20000);
        System.out.println(Oaxaca.toString());
        System.out.println("-------------");
        System.out.println(Chiapas.toString());
    }
}
