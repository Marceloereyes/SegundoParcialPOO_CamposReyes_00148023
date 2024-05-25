package SegundoParcialPOO_Campos_Reyes_00148023;

public class Director {
    private PaymentProviderBuilder builder;

    public void setBuilder(PaymentProviderBuilder builder) {
        this.builder = builder;
    }

    public PaymentProvider constructProvider() {
        builder.reset();
        builder.buildStepA();
        builder.buildStepB();
        builder.buildStepZ(); 
        return builder.getResult();
    }
}
