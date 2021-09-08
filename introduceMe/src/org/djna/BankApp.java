package org.djna;

public class BankApp {
    public static void main(String[] args) {

        Loan theLoan = new FestiveLoan(1200, 12);

        PaymentSchedule schedule = new PaymentSchedule(theLoan);

        System.out.println(schedule.getSchedule());

    }
}
