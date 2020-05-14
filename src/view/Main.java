package view;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca contaTeste = new ContaPoupanca("Samuel Delgado", "Banco do Brasil", 878,
                3.6,28);

        ContaCorrente contaTeste1 = new ContaCorrente("Spotify-598775-99","Santander",5789,
                15,50000);
        try {
            contaTeste.depositar(2222);
            contaTeste1.depositar(100000);
            contaTeste.sacar(1000);

            System.out.println(contaTeste.toString());

            contaTeste.trasferir(contaTeste1, 16.50);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(contaTeste.toString());
        System.out.println(contaTeste1.toString()+"\nImposto a ser pago: "+contaTeste1.getValorImposto());

    }
}
