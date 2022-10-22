package za.ac.cput.domain;
/*
* StudentNo:217068324
* Name: Cobain Liam Cupido
* Class Function: 
*/
public class Learner {
    
    private String studendNo;
    private String firstName;
    private String secondName;
    private String classNo;
    private boolean borrowedBook;  

    public Learner() {
    }

    public Learner(String studendNo, String firstName, String secondName, String classNo, boolean borrowedBook) {
        this.studendNo = studendNo;
        this.firstName = firstName;
        this.secondName = secondName;
        this.classNo = classNo;
        this.borrowedBook = borrowedBook;
    }

    public String getStudendNo() {
        return studendNo;
    }

    public void setStudendNo(String studendNo) {
        this.studendNo = studendNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public boolean isBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(boolean borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return "Learner{" + "studendNo=" + studendNo + ", firstName=" + firstName + ", secondName=" + secondName + ", classNo=" + classNo + ", borrowedBook=" + borrowedBook + '}';
    }
    
    
}

