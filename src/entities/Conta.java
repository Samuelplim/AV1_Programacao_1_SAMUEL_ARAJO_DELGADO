package entities;

public class Conta {
    private String nomeDoTitular;
    private String agencia;
    private int numeroDaConta;
    private String dataDeAbertura;
    private double saldo;

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(int quant){
        if(quant<this.saldo){
            this.saldo-=quant;
          return true;
        }
    return false;
    }

    public boolean depositar(int quant){
        if(quant>0){
            this.saldo+=quant;
            return true;
        }
    return false;
    }
    public void trasferir(Conta contaBeneficada, int quant){
        if( quant>0){
            contaBeneficada.depositar(quant);
        }
    }
}
