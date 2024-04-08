package logistic.factory;

public class cartaoFactory implements paymentFactory {
    
    @Override
    public void pagamento(){
        System.out.println("Pagando com cartao");
    }
}
