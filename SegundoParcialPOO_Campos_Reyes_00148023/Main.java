package SegundoParcialPOO_Campos_Reyes_00148023;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        PaymentProviderBuilder stripeBuilder = new StripeBuilder();
        director.setBuilder(stripeBuilder);
        PaymentProvider stripeProvider = director.constructProvider();
        System.out.println("Stripe Provider: " + stripeProvider);

        PaymentProviderBuilder squareBuilder = new SquareBuilder();
        director.setBuilder(squareBuilder);
        PaymentProvider squareProvider = director.constructProvider();
        System.out.println("Square Provider: " + squareProvider);
    }
}
