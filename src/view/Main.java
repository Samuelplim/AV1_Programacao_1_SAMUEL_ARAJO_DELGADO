package view;

import entities.Conta;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Conta contaTeste = new Conta("Samuel Delgado","Santander",5578888);
        contaTeste.depositar(2222);
        contaTeste.sacar(1000);

        System.out.println(contaTeste.toString());

        Conta contaTeste1 = new Conta("Spotify-ID:0123555","Itau",135578);
        contaTeste.trasferir(contaTeste1,16.50);

        System.out.println(contaTeste.toString());
        System.out.println(contaTeste1.toString());
    }
}
