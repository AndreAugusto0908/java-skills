package paymentCompany;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
    LocalDate date = LocalDate.of(2018, 6, 25);
    Contract c = new Contract(8028, date, 3, 600, new PayPalPayment());
    System.out.println(c.report());
    }
}
