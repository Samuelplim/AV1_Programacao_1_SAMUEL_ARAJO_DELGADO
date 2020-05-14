package entities;

import java.util.Date;

public class ContaPoupanca extends Conta{
    private double porcentagemRendimento;
    private int diaRendimento;



    public ContaPoupanca(String nomeDoTitular, String agencia, int numeroDaConta, double porcentagemRendimento, int diaRendimento) {
        this.setNomeDoTitular(nomeDoTitular);
        this.setAgencia(agencia);
        this.setNumeroDaConta(numeroDaConta);
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaRendimento = diaRendimento;
        Date data = new Date(System.currentTimeMillis());
        this.setDataDeAbertura(data.toString());
    }

    public double getPorcentagemRendimento() {
        return porcentagemRendimento;
    }

    public void setPorcentagemRendimento(double porcentagemRendimento) {
        this.porcentagemRendimento = porcentagemRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
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
                "\nDia do Rendimento: "+this.diaRendimento+
                "\nPorcentagem de Rendimento: "+this.porcentagemRendimento;
    }
}
