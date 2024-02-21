package paymentCompany;

public class PayPalPayment implements IpaymentService {

    @Override
    public Double paymentInMonth(int numberOfMonths, Double valuation, int month) {
        return simpleInterested(numberOfMonths, valuation, month) + (simpleInterested(numberOfMonths, valuation, month) * 0.02);
    }

    private double simpleInterested(int numberOfMonths, Double valuation, int month){
        return (valuation/numberOfMonths) + (((valuation/numberOfMonths) * 0.01) * month);
    }
    
}
