package org.djna;

public class Loan {
    protected int amountBorrowed;
    protected int durationMonths;

    public Loan( int initAmount, int initDuration) {
        amountBorrowed = initAmount;
        durationMonths = initDuration;
    }

    public int getPayment(int month){
        if ( month < 1 || month > durationMonths){
            return 0;
        } else {
            return amountBorrowed/durationMonths;
        }
    }

    public int getAmountBorrowed() {
        return amountBorrowed;
    }
    public int getDurationMonths() {
        return durationMonths;
    }

}
