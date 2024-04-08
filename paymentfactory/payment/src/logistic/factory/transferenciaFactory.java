package logistic.factory;

public class transferenciaFactory implements paymentFactory {
    
    @Override
    public void pagamento(){
        System.out.println("Pagando com Transferencia");
    }
    
}
