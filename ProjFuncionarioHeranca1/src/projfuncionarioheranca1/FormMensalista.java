package projfuncionarioheranca1;


import javax.swing.JOptionPane;

public class FormMensalista extends javax.swing.JFrame {

    Mensalista mens=new Mensalista();

    public FormMensalista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textnumreg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textsalbruto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textdescontos = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoExibir = new javax.swing.JButton();
        BotaoCalcularSalario = new javax.swing.JButton();
        textsalario = new javax.swing.JTextField();
        BotaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mensalista");

        jLabel2.setText("Numero de Registro");

        textnumreg.setToolTipText("");

        jLabel3.setText("Nome");

        jLabel4.setText("Salario Bruto");

        jLabel5.setText("Descontos");

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoExibir.setText("Exibir");
        BotaoExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExibirActionPerformed(evt);
            }
        });

        BotaoCalcularSalario.setText("Calcular Salario");
        BotaoCalcularSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCalcularSalarioActionPerformed(evt);
            }
        });

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(BotaoCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textsalbruto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(textnome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textnumreg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textdescontos)))
                            .addComponent(BotaoCalcularSalario)
                            .addComponent(textsalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textnumreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textsalbruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textdescontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrar)
                    .addComponent(BotaoExibir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCalcularSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(BotaoVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
       // colocando as informações dos campos de texto
       // nos atributos da classe
        mens.registro=Integer.parseInt(this.textnumreg.getText());
        mens.nome=this.textnome.getText();
        mens.salbruto=Double.parseDouble(this.textsalbruto.getText());
        mens.desconto=Double.parseDouble(this.textdescontos.getText());
       // Informar ao usuário que os dados foram cadastrados
       JOptionPane.showMessageDialog(null,"Dados cadastrados !!!");
       // limpando os campos de texto
       this.textnumreg.setText("");
       this.textnome.setText("");
       this.textsalbruto.setText("");
       this.textdescontos.setText("");
       
       
       
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExibirActionPerformed
        this.textnumreg.setText("" + mens.registro);
       this.textnome.setText(mens.nome);
       this.textsalbruto.setText("" + mens.salbruto);
       this.textdescontos.setText("" + mens.desconto);
    }//GEN-LAST:event_BotaoExibirActionPerformed

    private void BotaoCalcularSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCalcularSalarioActionPerformed
        this.textsalario.setText("" + mens.CalcularSalario());
    }//GEN-LAST:event_BotaoCalcularSalarioActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        new FormFuncionario().setVisible(true); //Abrir janela do funcionario
        dispose(); //Exclui a janela atual e deixa so a que abriu
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoCalcularSalario;
    private javax.swing.JButton BotaoExibir;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textdescontos;
    private javax.swing.JTextField textnome;
    private javax.swing.JTextField textnumreg;
    private javax.swing.JTextField textsalario;
    private javax.swing.JTextField textsalbruto;
    // End of variables declaration//GEN-END:variables
}
