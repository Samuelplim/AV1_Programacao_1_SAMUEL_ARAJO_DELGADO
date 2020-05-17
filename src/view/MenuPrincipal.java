package view;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal extends JPanel implements ActionListener{

    //Tela Principal
    JLabel textMenu = new JLabel("Seja bem vindo");
    JLabel textAgencia = new JLabel("Agencia");
    JLabel textNConta = new JLabel("nº da conta");
    JTextField textFieldagencia = new JTextField(10);
    JTextField txtFieldnConta = new JTextField(10);

    JButton buttonEntrar = new JButton("ENTRAR");
    JButton buttonCriar = new JButton("Criar conta");

    JButton buttonListAccont = new JButton("Listar Contas");
    //END

    //Registro
    JComboBox jComboBox = new JComboBox();

    JButton buttonRegister = new JButton("ENVIAR");
    JButton buttonVoltar = new JButton("VOLTAR");

    JLabel jLabelTaxaDeAdministracao = new JLabel("Taxa de Administração");
    JTextField textTaxaDeAdministracao = new JTextField(10);
    JLabel jLabelLimite = new JLabel("Limite");
    JTextField textFieldLimite = new JTextField(10);

    JLabel jLabelPorcentagemRendimento = new JLabel("Porcentagem de Rendimento");
    JTextField textFieldPorcentagemRendimento = new JTextField(10);
    JLabel jLabelDiaRendimento = new JLabel("Dia do rendimento");
    JTextField textFieldDiaRendimento = new JTextField(10);

    JLabel jLabelTitulo = new JLabel("Formulario para abrir conta");
    JLabel jLabelName = new JLabel("Nome do Titular");
    JLabel jLabelAgencia = new JLabel("Nome Agencia");
    JLabel jLabelNConta = new JLabel("nº da conta");
    JLabel jLabelPrimeiroDeposito = new JLabel("Primeiro Deposito");

    JTextField jTextFieldName = new JTextField(10);
    JTextField jTextFieldAgencia = new JTextField(10);
    JTextField jTextFieldNConta = new JTextField(10);
    JTextField jTextFieldPrimeiroDeposito = new JTextField(10);
    //END

    //JOIN - Operações Saque, Depostido, e Transferencia
    int idAccount;
    JLabel jLabelUserInfo = new JLabel();
    JLabel jLabelOp = new JLabel("Clique no BOTÃO para realizar a operação");
    JLabel jLabelAccAgTransf = new JLabel("Trasferencia Nº da agencia: ");
    JTextField jTextFieldAccAgTransf = new JTextField();
    JLabel jLabelNumAccTransf = new JLabel("N° da conta");
    JTextField jTextFieldNumAccTransf = new JTextField();
    JButton jButtonWithdraw = new JButton("SAQUE");
    JButton jButtonDeposit = new JButton("DEPOSITO");
    JButton jButtonTransfer = new JButton("TRANSFERÊNCIA");
    JButton jButtonEnviarOP = new JButton("ENVIAR");
    JTextField jTextFieldValue = new JTextField(10);
    //END

    List <Conta> contas = new ArrayList<>();

    MenuPrincipal(){
        this.setBackground( new Color(2388889));
        this.setSize(589, 87);
        this.setVisible(true);

        setButton(buttonEntrar);
        setButton(buttonCriar);
        setButton(buttonVoltar);
        buttonVoltar.setVisible(false);
        setButton(buttonListAccont);
        setLabel(textMenu);
        setLabel(textAgencia);
        setLabel(textNConta);
        setTextField(textFieldagencia);
        setTextField(txtFieldnConta);

        buttonEntrar.addActionListener( this );
        buttonCriar.addActionListener( this );
        buttonVoltar.addActionListener( this );
        buttonListAccont.addActionListener(this);

        this.add(textMenu);
        this.add(textAgencia);
        this.add(textFieldagencia);
        this.add(textNConta);
        this.add(txtFieldnConta);
        this.add(buttonEntrar);
        this.add(buttonCriar);
        this.add(buttonListAccont);
        this.add(buttonVoltar);
    }

    private void setButton(JButton jButton){
        jButton.setSize(40,20);
        jButton.setVisible(true);
    }

    private void setLabel(JLabel jLabel){
        jLabel.setFont( new Font("Arial", 1,12));
        jLabel.setVisible(true);
    }

    private void setTextField(JTextField jTextField){
        jTextField.setSize(80,20);
        jTextField.setVisible(true);
    }

    private void setJComboBox(JComboBox jComboBox){
        jComboBox.setSize(80,20);
        jComboBox.setVisible(true);
    }

    private String infoAccont(Conta conta){
        return conta.getNomeDoTitular()+"     Conta: "+conta.getAgencia()+" "+conta.getNumeroDaConta()
                +"     Saldo: "+conta.getSaldo();
    }

    private void setvisibleMenu( boolean set){
       textMenu.setVisible(set);
       textAgencia.setVisible(set);
       textNConta.setVisible(set);
       textFieldagencia.setVisible(set);
       txtFieldnConta.setVisible(set);
       buttonEntrar.setVisible(set);
       buttonCriar.setVisible(set);
       buttonListAccont.setVisible(set);
    }

    private void setVisibleRegister(boolean bool){
         jComboBox.setVisible(bool);

         buttonRegister.setVisible(bool);
         buttonVoltar .setVisible(bool);
         jLabelTaxaDeAdministracao.setVisible(bool);
         textTaxaDeAdministracao.setVisible(bool);
         jLabelLimite.setVisible(bool);
         textFieldLimite.setVisible(bool);

         jLabelPorcentagemRendimento.setVisible(bool);
         textFieldPorcentagemRendimento.setVisible(bool);
         jLabelDiaRendimento.setVisible(bool);
         textFieldDiaRendimento.setVisible(bool);

         jLabelTitulo.setVisible(bool);
         jLabelName.setVisible(bool);
         jLabelAgencia.setVisible(bool);
         jLabelNConta.setVisible(bool);
         jLabelPrimeiroDeposito.setVisible(bool);
         jTextFieldName.setVisible(bool);
         jTextFieldAgencia.setVisible(bool);
         jTextFieldNConta.setVisible(bool);
         jTextFieldPrimeiroDeposito.setVisible(bool);

    }

    private void setVisibleJoin(boolean bool){
        jLabelUserInfo.setVisible(bool);
        jLabelOp.setVisible(bool);
        jButtonWithdraw.setVisible(bool);
        jButtonDeposit.setVisible(bool);
        jButtonTransfer.setVisible(bool);
        jTextFieldValue.setVisible(bool);
    }

    private Conta creadeConta(){
        if(jComboBox.getSelectedIndex()==0){
            ContaPoupanca contaPoupanca = new ContaPoupanca(jTextFieldName.getText(),jTextFieldAgencia.getText(),
                    Integer.parseInt(jTextFieldNConta.getText()),Double.parseDouble(jTextFieldPrimeiroDeposito.getText()),
                    Double.parseDouble(textFieldPorcentagemRendimento.getText()), Integer.parseInt(textFieldDiaRendimento.getText()));
            return contaPoupanca;
        }else if(jComboBox.getSelectedIndex()==1){
            ContaCorrente contaCorrente = new ContaCorrente(jTextFieldName.getText(),jTextFieldAgencia.getText(),
                    Integer.parseInt(jTextFieldNConta.getText()),Double.parseDouble(jTextFieldPrimeiroDeposito.getText()),Double.parseDouble(textTaxaDeAdministracao.getText()),
                    Double.parseDouble(textFieldLimite.getText()));
            return contaCorrente;
        }
        return null;
    }
    private int searshAccontId( String agencia, int numeroDaConta){
        int i = 0;

        for (Conta conta :contas){

            if(conta.validAccont(agencia,numeroDaConta)) {

                idAccount = i;
                InitJoin(conta);
                break;
            }
            i++;
        }
        return i;
    }

    public void actionPerformed(ActionEvent e) {
        //MENU
        if(e.getSource() == buttonCriar){
            this.setvisibleMenu(false);
            InitCriarConta();
        }

        if(e.getSource() == buttonEntrar){

            contas.add(new ContaPoupanca("Samuel Delgado","BB",123,
                    5999, 0.8, 2));
            idAccount = searshAccontId(textFieldagencia.getText(), Integer.parseInt(txtFieldnConta.getText()));
            InitJoin(contas.get(idAccount));

        }

        //LISTAR CONTAS
        if(e.getSource() == buttonListAccont){
            System.out.println(contas.toString());
        }

        if(e.getSource() == buttonVoltar){
            setVisibleRegister(false);
            setVisibleJoin(false);
            setvisibleMenu(true);
        }

        //END

        //Contições registro
        if(e.getSource() == buttonRegister){
            contas.add(creadeConta());
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
        }
        //END
        //Contições de Operações
        if(e.getSource() == jButtonDeposit){
            jButtonEnviarOP.setText("DEPOSITAR");
            jButtonTransfer.setEnabled(false);
            jButtonWithdraw.setEnabled(false);

            jTextFieldValue.setVisible(true);
            jButtonEnviarOP.setVisible(true);
        }
        if(e.getSource() == jButtonTransfer){
            jButtonEnviarOP.setText("TRANSFERIR");
            jButtonDeposit.setEnabled(false);
            jButtonWithdraw.setEnabled(false);

            jLabelAccAgTransf.setVisible(true);
            jLabelNumAccTransf.setVisible(true);
            jTextFieldAccAgTransf.setVisible(true);
            jTextFieldNumAccTransf.setVisible(true);

            jTextFieldValue.setVisible(true);
            jButtonEnviarOP.setVisible(true);
        }
        if(e.getSource() == jButtonWithdraw){
            jButtonEnviarOP.setText("SACAR");
            jButtonDeposit.setEnabled(false);
            jButtonTransfer.setEnabled(false);

            jTextFieldValue.setVisible(true);
            jButtonEnviarOP.setVisible(true);
        }
        if(e.getSource() == jButtonEnviarOP){
            try {
                if(jButtonEnviarOP.getText().equals("DEPOSITAR")){
                    contas.get(idAccount).depositar(Double.parseDouble(jTextFieldValue.getText()));

                }else if(jButtonEnviarOP.getText().equals("SACAR")){
                    contas.get(idAccount).sacar(Double.parseDouble(jTextFieldValue.getText()));

                }else if(jButtonEnviarOP.getText().equals("TRANSFERIR")){
                    contas.get(idAccount).trasferir(
                            contas.get(searshAccontId(
                                    jTextFieldAccAgTransf.getText(),
                                    Integer.parseInt(jTextFieldNumAccTransf.getText())
                            )),
                            Double.parseDouble(jTextFieldValue.getText()));
                    //trasfer
                    jLabelAccAgTransf.setVisible(false);
                    jLabelNumAccTransf.setVisible(false);
                    jTextFieldAccAgTransf.setVisible(false);
                    jTextFieldNumAccTransf.setVisible(false);
                }
                jButtonDeposit.setEnabled(true);
                jButtonTransfer.setEnabled(true);
                jButtonWithdraw.setEnabled(true);


                jTextFieldValue.setVisible(false);
                jButtonEnviarOP.setVisible(false);
            } catch (Exception exception) {

                JOptionPane.showMessageDialog(new Frame("ERROR"),exception.toString());
                System.out.println(exception);
            }
        }

        //END

    }

    private void InitCriarConta(){



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

        buttonRegister.addActionListener( this );
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

        setButton(buttonRegister);


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

        this.add(buttonRegister);
        buttonVoltar.setVisible(true);

    }
    private void InitJoin( Conta conta){
        jLabelUserInfo.setText(infoAccont(conta));

        setLabel(jLabelOp);
        setButton(jButtonWithdraw);
        setButton(jButtonDeposit);
        setButton(jButtonTransfer);

        //Variaveis que somem
        setButton(jButtonEnviarOP);
        setTextField(jTextFieldValue);
        setLabel(jLabelAccAgTransf);
        setLabel(jLabelNumAccTransf);
        setTextField(jTextFieldAccAgTransf);
        setTextField(jTextFieldNumAccTransf);

        jButtonEnviarOP.setVisible(false);
        jTextFieldValue.setVisible(false);
        jLabelAccAgTransf.setVisible(false);
        jLabelNumAccTransf.setVisible(false);
        jTextFieldAccAgTransf.setVisible(false);
        jTextFieldNumAccTransf.setVisible(false);
        //end


        jButtonDeposit.addActionListener(this);
        jButtonTransfer.addActionListener(this);
        jButtonWithdraw.addActionListener(this);
        jButtonEnviarOP.addActionListener(this);

        setvisibleMenu(false);
        buttonVoltar.setVisible(true);

        this.add(jLabelUserInfo);
        this.add(jLabelOp);
        this.add(jButtonWithdraw);
        this.add(jButtonDeposit);
        this.add(jButtonTransfer);
        this.add(jLabelAccAgTransf);
        this.add(jTextFieldAccAgTransf);
        this.add(jLabelNumAccTransf);
        this.add(jTextFieldNumAccTransf);
        this.add(jTextFieldValue);
        this.add(jButtonEnviarOP);

    }

}
