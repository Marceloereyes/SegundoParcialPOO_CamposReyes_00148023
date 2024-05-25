package SegundoParcialPOO_Campos_Reyes_00148023;

public class StripeBuilder extends PaymentProviderBuilder {
    @Override
    public void buildStepA() {
        paymentProvider.setUsername("stripe_user");
    }

    @Override
    public void buildStepB() {
        paymentProvider.setToken(paymentProvider.getUsername() + ":stripe");
    }

    @Override
    public void buildStepZ() {
    }
}