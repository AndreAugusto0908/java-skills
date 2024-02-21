package paymentCompany;

/**
 * The IpaymentService interface represents a service for calculating payments
 * in a contract based on the number of months, valuation, and the month for
 * which
 * the payment amount is to be calculated.
 */
public interface IpaymentService {

    /**
     * Calculates the payment amount for a specific month in a contract.
     *
     * @param numberOfMonths The total number of months in the contract
     * @param valuation      The valuation of the contract
     * @param month          The month for which the payment amount is calculated
     * @return The payment amount for the specified month
     */
    public Double paymentInMonth(int numberOfMonths, Double valuation, int month);

}
