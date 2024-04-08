package logistic.entity;

import logistic.factory.paymentFactory;

public class transferencia extends payment {
    
    public paymentFactory creatPayment() {
        return  (paymentFactory) new transferencia();
    }

    @Override
    public paymentFactory createPayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPayment'");
    }

}
