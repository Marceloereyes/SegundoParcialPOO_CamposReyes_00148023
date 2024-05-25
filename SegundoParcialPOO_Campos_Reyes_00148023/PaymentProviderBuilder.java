package SegundoParcialPOO_Campos_Reyes_00148023;

public abstract class PaymentProviderBuilder implements Builder {
    protected PaymentProvider paymentProvider;

    public PaymentProvider getResult() {
        return paymentProvider;
    }

    @Override
    public void reset() {
        paymentProvider = new PaymentProvider();
    }
}
