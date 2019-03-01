/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo A A
 */
public class TestCertificateOfDeposit {
    public static void testCertificated(){
        CertificateOfDeposit [] c = new CertificateOfDeposit[2];
        for(CertificateOfDeposit cert:c){
            try{
                Integer number = Integer.parseInt(JOptionPane.showInputDialog("No. de Certificado:"));
                String last = JOptionPane.showInputDialog("Apellido:");
                Double balance = Double.parseDouble(JOptionPane.showInputDialog("Impuesto:"));
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia Actual:"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes Actual:"));
                int anio = Integer.parseInt(JOptionPane.showInputDialog("Año Actual:"));
                GregorianCalendar gc = new GregorianCalendar(anio,mes,dia);
                cert = new CertificateOfDeposit(number,last,balance,gc);
                JOptionPane.showMessageDialog(null,cert.toString());
            }catch(Exception e){
                System.exit(0);
            }
        }
    }
}
