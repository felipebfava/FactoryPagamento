package logistic.entity;

import logistic.factory.paymentFactory;

public class pix extends payment {
    
    public paymentFactory creatPayment() {
        return (paymentFactory) new pix();
    }

    @Override
    public paymentFactory createPayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPayment'");
    }
}
