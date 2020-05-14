package entities;

import java.util.Date;

public class Conta {
    private String nomeDoTitular;
    private String agencia;
    private int numeroDaConta;
    private String dataDeAbertura;
    private double saldo;

    public Conta(String nomeDoTitular, String agencia, int numeroDaConta) {
        this.nomeDoTitular = nomeDoTitular;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        Date data = new Date(System.currentTimeMillis());
        this.dataDeAbertura = data.toString();
    }

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

    public boolean sacar(double quant){
        if(quant<this.saldo){
            this.saldo-=quant;
          return true;
        }
    return false;
    }

    public boolean depositar(double quant){
        if(quant>0){
            this.saldo+=quant;
            return true;
        }
    return false;
    }

    public void trasferir(Conta contaBeneficada, double quant){
        if(quant>0&&quant<this.saldo){
            this.sacar(quant);
            contaBeneficada.depositar(quant);
        }
    }

    @Override
    public String toString() {
        return "\n\nCONTA BANCARIA" +
                "\nNome do Titular: "+ this.nomeDoTitular+
                "\nAgencia: "+this.agencia+
                "\nN° da Conta: "+this.numeroDaConta+
                "\nSaldo: "+this.saldo+
                "\nData de Abertura: "+this.dataDeAbertura;
    }
}
