package SegundoParcialPOO_Campos_Reyes_00148023;

public class SquareBuilder extends PaymentProviderBuilder {
    @Override
    public void buildStepA() {
        paymentProvider.setUsername("square_user");
    }

    @Override
    public void buildStepB() {
        paymentProvider.setToken(paymentProvider.getUsername() + ":square");
    }

    @Override
    public void buildStepZ() {
    }
}