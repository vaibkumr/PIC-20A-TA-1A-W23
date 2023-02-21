public class InterfaceVsAbstractClass {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPalPaymentGateway("pic20a@ucla.edu", "password");
        PaymentGateway stripe = new StripePaymentGateway("asjkda9s8daiosdbnaiosbd");
        paypal.processPayment(100.0);
        stripe.processPayment(200.0);

    }
}
