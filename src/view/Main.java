package view;


import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        JFrame jFrame = new JFrame("Conta bancaria");
        jFrame.setSize(1000, 800);
        jFrame.setDefaultCloseOperation(3);
        jFrame.add(menuPrincipal);
        jFrame.show();
    }
}
