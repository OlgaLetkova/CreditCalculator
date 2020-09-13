public class CreditPaymentService {
    public long calculate (double creditRate, long creditTerm, long creditAmount){
        double monthRate = creditRate/100/12;
        //creditRate в процентах, creditTerm в месяцах;
        double creditPaiment = creditAmount*(monthRate*Math.pow((1+monthRate),creditTerm))/(Math.pow((1+monthRate),creditTerm)-1);
        long creditPaimentInteger = (long)Math.round(creditPaiment);
        return creditPaimentInteger;
        }
    }
