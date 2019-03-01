package chapter4;

import chapter4.caseproblems.EventDemo;
import chapter4.caseproblems.RentalDemo;
import chapter4.gamezone.FiveDice;
import chapter4.gamezone.TwoDice;

/**
 *
 * @author Gerardo A A
 */
public class Main {
    
    public static void main(String[] args) {
        //A.
        FormLetterWriter.displaySalutation("Acevedo");
        FormLetterWriter.displaySalutation("Gerardo","Rodriguez");
        
        //B.
        System.out.println("$"+Billing.computeBill(200.0));
        System.out.println("$"+Billing.computeBill(200.0,10));
        System.out.println("$"+Billing.computeBill(200.0,10,100.0));
        
        //C.
        BirdSighting carpin = new BirdSighting();
        BirdSighting pitico = new BirdSighting("Colibrí",3,91);
        System.out.println(carpin.toString());
        System.out.println(pitico.toString());
        TestBirdSighting vito = new TestBirdSighting("Colibrí",3,91);
        
        //D.
        BloodData bloodData = new BloodData();
        BloodData bloodData1 = new BloodData(BloodData.AB,BloodData.NEGATIVO);
        System.out.println(bloodData.toString());
        System.out.println(bloodData1.toString());
        Patient Pedro = new Patient();
        System.out.println(Pedro.toString());
        
        //E.
        Bread concha = new Bread("Concha",100);
        System.out.println(concha.toString());
        TestBread.testBread();
        SandwichFilling condimento = new SandwichFilling("Potato",30);
        System.out.println(condimento.toString());
        TestSandwichFilling.testFillings();
        TestSandwich.testFillings();
        
        //F.
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        c2.setRadius(100.0);
        c3.setRadius(1.0);
        TestCircle.testCircles(c1,c2,c3);
        
        //G.
        MathTest.mathTest();
        
        //H.
        NextMoth.nextMoth();
        
        //I.
        YearEnd.lastDay();
        
        //J.
        TestCertificateOfDeposit.testCertificated();
        
        //K.
        TestState.testState();
        
        //GAME ZONE
        //L.
        TwoDice.throwsDice();
        
        //M.
        FiveDice.throwsDice();
        
        //CASE PROBLEMS
        //N.
        EventDemo.testEvent();
        
        //O.
        RentalDemo.testRental();
    }
    
}