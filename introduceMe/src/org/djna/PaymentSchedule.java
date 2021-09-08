package org.djna;

public class PaymentSchedule {
    private Loan loan;
    public PaymentSchedule(Loan initLoan){
        loan = initLoan;
    }

    String getSchedule(){
        StringBuffer buffer = new StringBuffer("Schedule : ");
        String separator = "";
        for (int i = 1; i <= loan.getDurationMonths() ; i++){
            buffer.append(separator);
            buffer.append(loan.getPayment(i));
            separator = ", ";
        }
        return buffer.toString();
    }
}
