
package za.ac.cput.domain;

/**
 *
 * @author Senzo 219345406
 */
public class Loan { 
    private boolean borrowed;
    private String returned;
    private boolean overdue;
    private String daysOver;
    
        
    public Loan() {       
}
    public Loan(boolean borrow, String returned, boolean overdue, String daysOver) {
        this.borrowed = borrowed;
        this.returned = returned;
        this.overdue = overdue;
        this.daysOver = daysOver;
    }

    public boolean borrowed() {
        return borrowed;
    }

    public void setborrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getreturned() {
        return returned;
    }

    public void setreturned(String returned) {
        this.returned = returned;
    }

    public String getdaysOver() {
        return daysOver;
    }

    public void setdaysOver(String daysOver) {
        this.daysOver = daysOver;
    }

    public boolean overdue() {
        return overdue;
    }

    public void setoverdue(boolean overdue) {
        this.overdue = overdue;
    }

    @Override
    public String toString() {
        return "Loan{" + "borrowed=" + borrowed + ", returned=" + returned + ", daysOver=" + daysOver + ", overdue=" + overdue +'}';
    }
   
}