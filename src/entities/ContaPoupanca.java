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
    public boolean sacar(double value) throws Exception{
        if(value>this.getSaldo()){
            throw new Exception("Valor de saque maior que o disponivel");

        }else {
            this.setSaldo(this.getSaldo()-value);
            return true;
        }
    }

    @Override
    public boolean depositar(double value) throws Exception{
        if(value<=0){
            throw new Exception("Valor não pode ser igual ou menor que 0");
        }else {
            this.setSaldo(this.getSaldo() + value);
            return true;
        }
    }

    @Override
    public boolean trasferir(Conta contaBeneficada, double value) throws Exception{
        if(value<=0){
            throw new Exception("Valor não pode ser igual ou menor que 0");
        }else if(value>this.getSaldo()){
            throw new Exception("Valor de transferencia maior que o disponivel");
        }else {
            this.sacar(value);
            contaBeneficada.depositar(value);
            return true;
        }
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
