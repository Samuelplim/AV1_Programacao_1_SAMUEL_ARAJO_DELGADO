package view;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        /*
        Não é possivel executar pois a Classe "Conta" é abstrada, e classes abstradas não podem ser instanciadas
        Conta contaTeste = new Conta();
        Conta contaTeste1 = new Conta();
        */
        ContaPoupanca contaTeste = new ContaPoupanca("Samuel Delgado", "Banco do Brasil", 878,
                3.6,28);
        
        ContaCorrente contaTeste1 = new ContaCorrente("Spotify-598775-99","Santander",5789,
                15,50000);

        contaTeste.depositar(2222);
        contaTeste1.depositar(100000);
        contaTeste.sacar(1000);

        System.out.println(contaTeste.toString());


        contaTeste.trasferir(contaTeste1,16.50);

        System.out.println(contaTeste.toString());
        System.out.println(contaTeste1.toString());

    }
}
