package logistic.entity;

import logistic.factory.paymentFactory;

public class boleto extends payment {
    
    
    public paymentFactory creatPayment() {
        return (paymentFactory) new boleto();
    }

    @Override
    public paymentFactory createPayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPayment'");
    }

}
