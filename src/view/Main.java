package view;

import entities.Conta;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Conta contaTeste = new Conta();
        Conta contaTeste1 = new Conta();
        contaTeste.depositar(2222);
        contaTeste1.depositar(100000);
        contaTeste.sacar(1000);

        System.out.println(contaTeste.toString());


        contaTeste.trasferir(contaTeste1,16.50);

        System.out.println(contaTeste.toString());
        System.out.println(contaTeste1.toString());

    }
}
