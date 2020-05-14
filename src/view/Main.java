package view;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        /*
        * Questão 7
        * Na Classe Conta, foram deixados os metodos getter's e setter's dos atribudos para acesso e manibulação
        * dos atribudos. Os metodos sacar(), depositar(), transferir() foram colocados com abstrados pois as classes
        * possuem nescessitades diferentes do mesmo metodo.*/
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
