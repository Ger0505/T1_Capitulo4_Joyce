package chapter4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Gerardo A A
 */
public class CertificateOfDeposit {
    private Integer num;
    private String last_name;
    private Double balance;
    private Calendar issue;
    private Calendar maturity;

    public CertificateOfDeposit(Integer num, String last_name, Double balance, Calendar issue) {
        this.num = num;
        this.last_name = last_name;
        this.balance = balance;
        this.issue = issue;
        this.maturity = new GregorianCalendar(issue.get(Calendar.YEAR)+1,issue.get(Calendar.MONDAY),issue.get(Calendar.DAY_OF_MONTH));
    }
    
    

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Calendar getIssue() {
        return issue;
    }

    public void setIssue(Calendar issue) {
        this.issue = issue;
    }

    public Calendar getMaturity() {
        return maturity;
    }

    public void setMaturity(Calendar maturity) {
        this.maturity = maturity;
    }

    @Override
    public String toString() {
        DateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        return "CertificateOfDeposit\n" + "num=" + num + ",\n"
                + "last_name=" + last_name + ",\n"
                + "balance=" + balance + ",\n"
                + "issue=" + d.format(issue.getTime()) + ",\n "
                + "maturity=" + d.format(maturity.getTime());
    }
    
    
    
}
