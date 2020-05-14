package entities;

import java.util.Date;

public class ContaCorrente extends Conta implements Tributavel{
    private double taxaAdministracao;
    private double limite;



    public ContaCorrente(String nomeDoTitular, String agencia, int numeroDaConta, double taxaAdministracao, double limite) {
        this.setNomeDoTitular(nomeDoTitular);
        this.setAgencia(agencia);
        this.setNumeroDaConta(numeroDaConta);
        this.taxaAdministracao = taxaAdministracao;
        this.limite = limite;
        Date data = new Date(System.currentTimeMillis());
        this.setDataDeAbertura(data.toString());
    }


    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double value) {
        if(value<this.getSaldo()){
            this.setSaldo(this.getSaldo()-value);
            return true;
        }
        return false;
    }

    @Override
    public boolean depositar(double value) {
        if(value>0){
            this.setSaldo(this.getSaldo()+value);
            return true;
        }
        return false;
    }

    @Override
    public boolean trasferir(Conta contaBeneficada, double value) {
        if(value>0&&value<this.getSaldo()){
            this.sacar(value);
            contaBeneficada.depositar(value);
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n\nCONTA BANCARIA" +
                "\nNome do Titular: "+ this.getNomeDoTitular()+
                "\nAgencia: "+this.getAgencia()+
                "\nN° da Conta: "+this.getNumeroDaConta()+
                "\nSaldo: "+this.getSaldo()+
                "\nData de Abertura: "+this.getDataDeAbertura()+
                "\nTaxa de adiministração: "+this.taxaAdministracao+
                "\nLimite: "+this.limite;
    }

    @Override
    public double getValorImposto() {
        return 0.01*getSaldo();
    }
}
