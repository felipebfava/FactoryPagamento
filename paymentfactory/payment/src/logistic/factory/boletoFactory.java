package logistic.factory;


public class boletoFactory implements paymentFactory {
    
    @Override
    public void pagamento() {
        System.out.println("Pagando com Boleto");
    }
    
}
