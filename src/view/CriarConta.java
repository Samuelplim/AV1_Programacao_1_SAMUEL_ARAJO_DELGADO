package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriarConta extends JPanel implements ActionListener{
    JLabel textMenu = new JLabel("Seja bem vindo");
    JLabel textAgencia = new JLabel("Agencia");
    JLabel textNConta = new JLabel("nº da conta");
    JTextField textFieldagencia = new JTextField(10);
    JTextField txtFieldnConta = new JTextField(10);
    JButton buttonEntrar = new JButton("ENTRAR");
    JButton buttonCriar = new JButton("Criar conta");

    CriarConta(){
        this.setBackground( new Color(2388889));
        this.setSize(589, 87);
        this.setVisible(true);

        setButton(buttonEntrar);
        setButton(buttonCriar);
        setLabel(textMenu);
        setLabel(textAgencia);
        setLabel(textNConta);
        setTextField(textFieldagencia);
        setTextField(txtFieldnConta);

        buttonEntrar.addActionListener( this );
        buttonCriar.addActionListener( this );

        this.add(textMenu);
        this.add(textAgencia);
        this.add(textFieldagencia);
        this.add(textNConta);
        this.add(txtFieldnConta);
        this.add(buttonEntrar);
        this.add(buttonCriar);
    }
    CriarConta(JPanel jPanel){
        jPanel.removeAll();
    }
    public JLabel getTextMenu() {
        return textMenu;
    }

    public void setTextMenu(JLabel textMenu) {
        this.textMenu = textMenu;
    }

    public JLabel getTextAgencia() {
        return textAgencia;
    }

    public void setTextAgencia(JLabel textAgencia) {
        this.textAgencia = textAgencia;
    }

    public JLabel getTextNConta() {
        return textNConta;
    }

    public void setTextNConta(JLabel textNConta) {
        this.textNConta = textNConta;
    }

    public JTextField getTextFieldagencia() {
        return textFieldagencia;
    }

    public void setTextFieldagencia(JTextField textFieldagencia) {
        this.textFieldagencia = textFieldagencia;
    }

    public JTextField getTxtFieldnConta() {
        return txtFieldnConta;
    }

    public void setTxtFieldnConta(JTextField txtFieldnConta) {
        this.txtFieldnConta = txtFieldnConta;
    }

    public JButton getButtonEntrar() {
        return buttonEntrar;
    }

    public void setButtonEntrar(JButton buttonEntrar) {
        this.buttonEntrar = buttonEntrar;
    }

    public JButton getButtonCriar() {
        return buttonCriar;
    }

    public void setButtonCriar(JButton buttonCriar) {
        this.buttonCriar = buttonCriar;
    }

    protected void setButton(JButton jButton){
        jButton.setSize(40,20);
        jButton.setVisible(true);
    }

    protected void setLabel(JLabel jLabel){
        jLabel.setFont( new Font("Arial", 1,12));
        jLabel.setVisible(true);
    }

    protected void setTextField(JTextField jTextField){
        jTextField.setSize(80,20);
        jTextField.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonCriar){
            System.out.println("oi");
        }
        if(e.getSource() == buttonEntrar){
            System.out.println("ai");
        }
    }

}
