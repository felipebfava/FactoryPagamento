package logistic.entity;

import logistic.factory.paymentFactory;

public abstract class payment {

    public void doPayment() {
        paymentFactory pgt = createPayment();
        pgt.pagamento();
    }

    public abstract paymentFactory createPayment();
    
}
