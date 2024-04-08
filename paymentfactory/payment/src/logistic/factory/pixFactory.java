package logistic.factory;

public class pixFactory implements paymentFactory {
    
    @Override
    public void pagamento(){
        System.out.println("Pagando com Pix");
    }
    
}
