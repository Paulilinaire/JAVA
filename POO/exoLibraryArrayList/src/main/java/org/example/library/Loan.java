package org.example.library;

public class Loan {
    private Person person;
    private String loanDate;
    private String dueDate;

    public Loan() {
    }

    public Loan(Person person, String loanDate, String dueDate) {
        this.person = person;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Emprunt : " +
                "person =" + person +
                ", loanDate ='" + loanDate + '\'' +
                ", dueDate ='" + dueDate + '\'' +
                '}';
    }
}
