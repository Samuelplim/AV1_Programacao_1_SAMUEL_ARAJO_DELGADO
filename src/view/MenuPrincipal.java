package view;

import entities.Conta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal extends JPanel implements ActionListener{
    JLabel textMenu = new JLabel("Seja bem vindo");
    JLabel textAgencia = new JLabel("Agencia");
    JLabel textNConta = new JLabel("nº da conta");
    JTextField textFieldagencia = new JTextField(10);
    JTextField txtFieldnConta = new JTextField(10);

    JComboBox jComboBox = new JComboBox();

    JButton buttonEntrar = new JButton("ENTRAR");
    JButton buttonCriar = new JButton("Criar conta");
    JButton buttonCriarConta = new JButton("ENVIAR");
    JButton buttonVoltar = new JButton("VOLTAR");

    JLabel jLabelTaxaDeAdministracao = new JLabel("Taxa de Administração");
    JTextField textTaxaDeAdministracao = new JTextField(10);
    JLabel jLabelLimite = new JLabel("Limite");
    JTextField textFieldLimite = new JTextField(10);

    JLabel jLabelPorcentagemRendimento = new JLabel("Porcentagem de Rendimento");
    JTextField textFieldPorcentagemRendimento = new JTextField(10);
    JLabel jLabelDiaRendimento = new JLabel("Dia do rendimento");
    JTextField textFieldDiaRendimento = new JTextField(10);

    List <Conta> contas = new ArrayList<>();

    MenuPrincipal(){
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
    protected void setJComboBox(JComboBox jComboBox){
        jComboBox.setSize(80,20);
        jComboBox.setVisible(true);
    }

    protected void setInvisibleMenu(){
       textMenu.setVisible(false);
       textAgencia.setVisible(false);
       textNConta.setVisible(false);
       textFieldagencia.setVisible(false);
       txtFieldnConta.setVisible(false);
       buttonEntrar.setVisible(false);
       buttonCriar.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonCriar){
            this.setInvisibleMenu();
            InitCriarConta();
        }
        if(e.getSource() == buttonEntrar){
            System.out.println("ai");
        }
        if(e.getSource() == buttonCriarConta){

        }
        if(e.getSource()==jComboBox && jComboBox.getSelectedIndex()==0){
            //Conta Poupanca Ativa

            jLabelTaxaDeAdministracao.setVisible(false);
            jLabelLimite.setVisible(false);
            textTaxaDeAdministracao.setVisible(false);
            textFieldLimite.setVisible(false);

            jLabelPorcentagemRendimento.setVisible(true);
            textFieldPorcentagemRendimento.setVisible(true);
            jLabelDiaRendimento.setVisible(true);
            textFieldDiaRendimento.setVisible(true);

        }
        if(e.getSource()==jComboBox && jComboBox.getSelectedIndex()==1){
            //Conta Corrente Ativa
            jLabelPorcentagemRendimento.setVisible(false);
            textFieldPorcentagemRendimento.setVisible(false);
            jLabelDiaRendimento.setVisible(false);
            textFieldDiaRendimento.setVisible(false);

           jLabelTaxaDeAdministracao.setVisible(true);
            jLabelLimite.setVisible(true);
            textTaxaDeAdministracao.setVisible(true);
            textFieldLimite.setVisible(true);
            this.updateUI();


        }

    }
    public void InitCriarConta(){
        JLabel jLabelTitulo = new JLabel("Formulario para abrir conta");
        JLabel jLabelName = new JLabel("Nome do Titular");
        JLabel jLabelAgencia = new JLabel("Nome do Titular");
        JLabel jLabelNConta = new JLabel("nº da conta");
        JLabel jLabelPrimeiroDeposito = new JLabel("Primeiro Deposito");

        JTextField jTextFieldName = new JTextField(10);
        JTextField jTextFieldAgencia = new JTextField(10);
        JTextField jTextFieldNConta = new JTextField(10);
        JTextField jTextFieldPrimeiroDeposito = new JTextField(10);


        jComboBox.addItem("Poupança");
        jComboBox.addItem("Corrente");

        //Conta Corrente

        setLabel(jLabelTaxaDeAdministracao);
        setLabel(jLabelLimite);
        setTextField(textTaxaDeAdministracao);
        setTextField(textFieldLimite);

        //Conta Poupança

        setLabel(jLabelPorcentagemRendimento);
        setLabel(jLabelDiaRendimento);
        setTextField(textFieldPorcentagemRendimento);
        setTextField(textFieldDiaRendimento);

        buttonCriarConta.addActionListener( this );
        buttonVoltar.addActionListener( this );
        jComboBox.addActionListener(this);

        setLabel(jLabelTitulo);
        setLabel(jLabelName);
        setLabel(jLabelAgencia);
        setLabel(jLabelNConta);
        setLabel(jLabelPrimeiroDeposito);

        setTextField(jTextFieldName);
        setTextField(jTextFieldAgencia);
        setTextField(jTextFieldNConta);
        setTextField(jTextFieldPrimeiroDeposito);

        setJComboBox(jComboBox);

        setButton(buttonCriarConta);
        setButton(buttonVoltar);

        this.add(jLabelTitulo);
        this.add(jLabelName);
        this.add(jTextFieldName);
        this.add(jLabelAgencia);
        this.add(jTextFieldAgencia);
        this.add(jLabelNConta);
        this.add(jTextFieldNConta);
        this.add(jLabelPrimeiroDeposito);
        this.add(jTextFieldPrimeiroDeposito);

        //Conta poupanca
        this.add(jLabelPorcentagemRendimento);
        this.add(textFieldPorcentagemRendimento);
        this.add(jLabelDiaRendimento);
        this.add(textFieldDiaRendimento);

        //COnta Corrente
        jLabelTaxaDeAdministracao.setVisible(false);
        jLabelLimite.setVisible(false);
        textTaxaDeAdministracao.setVisible(false);
        textFieldLimite.setVisible(false);

        this.add(jLabelTaxaDeAdministracao);
        this.add(textTaxaDeAdministracao);
        this.add(jLabelLimite);
        this.add(textFieldLimite);
        this.add(jComboBox);

        this.add(buttonCriarConta);
        this.add(buttonVoltar);

    }

}
