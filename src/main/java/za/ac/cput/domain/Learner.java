/*
* StudentNo:217068324
* Name: Cobain Liam Cupido
* Class Function: 
*/
package za.ac.cput.domain;

public class Learner {
    private String studentNumber;
    private String name;
    private String surname;
    private boolean canBorrow;
    private String major;

    public Learner() {
    }

    public Learner(String studentNumber, String name, String surname, boolean canBorrow, String major) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.canBorrow = canBorrow;
        this.major = major;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isCanBorrow() {
        return canBorrow;
    }

    public void setCanBorrow(boolean canBorrow) {
        this.canBorrow = canBorrow;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Learner{" + "studentNumber=" + studentNumber + ", name=" + name + ", surname=" + surname + ", canBorrow=" + canBorrow + ", major=" + major + '}';
    }
}
