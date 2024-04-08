package logistic.entity;

import logistic.factory.paymentFactory;

public class cartao extends payment {
    
    public paymentFactory creatPayment() {
        return (paymentFactory) new cartao();
    }

    @Override
    public paymentFactory createPayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPayment'");
    }

}
