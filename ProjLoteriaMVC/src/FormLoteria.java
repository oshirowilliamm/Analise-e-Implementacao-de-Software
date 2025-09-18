public class FormLoteria extends javax.swing.JFrame {

    ControleLoteria control = new ControleLoteria();
    
    public FormLoteria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNum1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNum2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNum3 = new javax.swing.JTextField();
        buttonSort1 = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonSort2 = new javax.swing.JButton();
        buttonSort3 = new javax.swing.JButton();
        textSort1 = new javax.swing.JTextField();
        textSort2 = new javax.swing.JTextField();
        textSort3 = new javax.swing.JTextField();
        buttonResult = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textAcertos = new javax.swing.JTextField();
        textPremio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Número 1:");

        textNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Número 2:");

        textNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Número 3:");

        textNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum3ActionPerformed(evt);
            }
        });

        buttonSort1.setText("Sortear 1");
        buttonSort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSort1ActionPerformed(evt);
            }
        });

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonSort2.setText("Sortear 2");
        buttonSort2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSort2ActionPerformed(evt);
            }
        });

        buttonSort3.setText("Sortear 3");
        buttonSort3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSort3ActionPerformed(evt);
            }
        });

        buttonResult.setText("Resultado");
        buttonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResultActionPerformed(evt);
            }
        });

        jLabel5.setText("Acertos:");

        jLabel7.setText("Prêmio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonSort2)
                                    .addComponent(buttonSort1)
                                    .addComponent(buttonSort3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textSort1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSort2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSort3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonCadastrar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(textNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textPremio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(textAcertos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(buttonResult)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(textNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(buttonCadastrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonSort1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonSort2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonSort3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)))
                                .addComponent(jLabel5))
                            .addGap(23, 23, 23)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textSort1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textSort2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textSort3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(buttonResult)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNum1ActionPerformed

    private void textNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNum2ActionPerformed

    private void textNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNum3ActionPerformed

    private void buttonSort1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSort1ActionPerformed
        int s1 = control.Sortear1();
        textSort1.setText(Integer.toString(s1));
    }//GEN-LAST:event_buttonSort1ActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        //Colocando os num nas variáveis
        control.CadastrarNumeros(Integer.parseInt(textNum1.getText()),
                Integer.parseInt(textNum2.getText()),Integer.parseInt(textNum3.getText()));
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonSort2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSort2ActionPerformed
        int textS1 = Integer.parseInt(textSort1.getText());
        int s2 = control.Sortear2(textS1);
        textSort2.setText(Integer.toString(s2));
    }//GEN-LAST:event_buttonSort2ActionPerformed

    private void buttonSort3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSort3ActionPerformed
        int textS1 = Integer.parseInt(textSort1.getText());
        int textS2 = Integer.parseInt(textSort2.getText());
        int s3 = control.Sortear3(textS1, textS2);
        textSort3.setText(Integer.toString(s3));
    }//GEN-LAST:event_buttonSort3ActionPerformed

    private void buttonResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResultActionPerformed
        //Mostrar acertos
        int textS1 = Integer.parseInt(textSort1.getText());
        int textS2 = Integer.parseInt(textSort2.getText());
        int textS3 = Integer.parseInt(textSort3.getText());
        int numAcertos = control.Resultado(textS1, textS2, textS3);
        textAcertos.setText(Integer.toString(numAcertos));
        
        //Mostrar premiação
        double premio = control.Premiar(numAcertos);
        textPremio.setText(Double.toString(premio));
    }//GEN-LAST:event_buttonResultActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLoteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonResult;
    private javax.swing.JButton buttonSort1;
    private javax.swing.JButton buttonSort2;
    private javax.swing.JButton buttonSort3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textAcertos;
    private javax.swing.JTextField textNum1;
    private javax.swing.JTextField textNum2;
    private javax.swing.JTextField textNum3;
    private javax.swing.JTextField textPremio;
    private javax.swing.JTextField textSort1;
    private javax.swing.JTextField textSort2;
    private javax.swing.JTextField textSort3;
    // End of variables declaration//GEN-END:variables
}
