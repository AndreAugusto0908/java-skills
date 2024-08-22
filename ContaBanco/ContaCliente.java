public class ContaCliente {

    private int numero;
    private String agencia;
    private String nomeTitular;
    private double saldo;


    public ContaCliente(int numero, String agencia, String nomeTitular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        String toString = "Olá " + this.nomeTitular +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.";

        return toString;
    }

}
