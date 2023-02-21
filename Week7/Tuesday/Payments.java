public class Payments {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPalPaymentGateway("pic20a@ucla.edu", "password");
        PaymentGateway stripe = new StripePaymentGateway("asjkda9s8daiosdbnaiosbd");
        paypal.processPayment(100.0);
        stripe.processPayment(200.0);

    }
}


public interface PaymentGateway {
    public void processPayment(double amount);
}

public class PayPalPaymentGateway implements PaymentGateway {
    private String email;
    private String password;
    
    public PayPalPaymentGateway(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of amount $" + amount + " made using PayPal for email: " + this.email);
    }
}

public class StripePaymentGateway implements PaymentGateway {
    private String apiKey;
    
    public StripePaymentGateway(String apiKey) {
        this.apiKey = apiKey;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of amount $" + amount + " made using Stripe with apiKey: " + this.apiKey);
    }
}

