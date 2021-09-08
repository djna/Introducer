package org.djna;

public class FestiveLoan extends Loan{
    public FestiveLoan( int initAmount, int initDuration) {
        super(initAmount, initDuration);
    }

    @Override
    public int getPayment(int month){
        if ( month < 1 || month > durationMonths){
            return 0;
        } else if (month == 6 ) {
            return 0 ;
        } else {
            return ( amountBorrowed / ( durationMonths -1) );
        }
    }

}
