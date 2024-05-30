public class ContaTerminal {

    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaTerminal(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;

    }

    public String getTitular (){
        return titular;
    }

    public String getNumeroConta (){
        return numeroConta;
    }

    public double getSaldo (){
        return saldo;
    }

    public void depositar (double quantia){
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito de R$" + quantia + "Realizado com sucesso.");
        }else {
            System.out.println("Quantia de Depósito deve ser positiva.");
        
        }
    }

    public void sacar (double quantia){
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$" + quantia + "realizado com sucesso");
        
        }else if (quantia > saldo){
            
            System.out.println("Saldo insuficiente para o Saque.");
        
        }else {
            System.out.println("Quantia de saque deve ser positiva.");
        }
        
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" +saldo);
    }


}
