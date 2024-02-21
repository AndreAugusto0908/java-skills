package paymentCompany;

public class PayPalPayment implements IpaymentService {

    @Override
    public Double paymentInMonth(int numberOfMonths, Double valuation, int month) {
        return simpleInterested(numberOfMonths, valuation, month)
                + (simpleInterested(numberOfMonths, valuation, month) * 0.02);
    }

    /**
     * Calculates the simple interest-based payment amount for a specific month in a
     * contract.
     *
     * @param numberOfMonths The total number of months in the contract
     * @param valuation      The valuation of the contract
     * @param month          The month for which the payment amount is calculated
     * @return The payment amount for the specified month based on simple interest
     */
    private double simpleInterested(int numberOfMonths, Double valuation, int month) {
        return (valuation / numberOfMonths) + (((valuation / numberOfMonths) * 0.01) * month);
    }

}
