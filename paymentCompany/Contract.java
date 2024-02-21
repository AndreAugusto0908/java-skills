package paymentCompany;

import java.time.LocalDate;

/**
 * The Contract class represents a contractual agreement between parties.
 * It contains information about the contract number, start date, duration in
 * months,
 * valuation, and payment service used for calculating payments.
 */
public class Contract {

    private int number;
    private LocalDate date;
    private int numberOfMonths;
    private Double valuation;
    private IpaymentService paymentService;

    /**
     * Constructs a new Contract object with the given parameters.
     *
     * @param number         The contract number
     * @param date           The start date of the contract
     * @param numberOfMonths The duration of the contract in months
     * @param valuation      The valuation of the contract
     * @param paymentService The payment service used for calculating payments
     */
    public Contract(int number, LocalDate date, int numberOfMonths, double valuation, IpaymentService paymentService) {
        this.number = number;
        this.date = date;
        this.numberOfMonths = numberOfMonths;
        this.valuation = valuation;
        this.paymentService = paymentService;
    }

    /**
     * Calculates the payment amount for the specified month using the payment
     * service.
     *
     * @param month The month for which the payment amount is calculated
     * @return The payment amount for the specified month
     */
    private double amountToPaid(int month) {
        return paymentService.paymentInMonth(numberOfMonths, valuation, month);
    }

    /**
     * Generates a report of the contract, including information about the contract
     * number
     * and details of each installment, such as installment number, payment amount,
     * and due date.
     *
     * @return A string representation of the contract report
     */
    public String report() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("Numero do contrato: " + number + " Parcelas:\n");

        for (int i = 1; i <= numberOfMonths; i++) {
            double amount = amountToPaid(i);
            LocalDate parcelDate = date.plusMonths(i).minusDays(1);
            reportBuilder.append("#").append(i).append(" = ").append(amount).append(" na Data: ")
                    .append(parcelDate.toString()).append("\n");
        }

        return reportBuilder.toString();
    }
}
