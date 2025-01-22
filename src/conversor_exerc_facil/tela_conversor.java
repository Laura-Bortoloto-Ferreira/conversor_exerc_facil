package conversor_exerc_facil;

public class tela_conversor extends javax.swing.JFrame {

    public tela_conversor() {
        initComponents();
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEscolha = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        rbKm = new javax.swing.JRadioButton();
        rbDam = new javax.swing.JRadioButton();
        rbHm = new javax.swing.JRadioButton();
        rbM = new javax.swing.JRadioButton();
        rbCm = new javax.swing.JRadioButton();
        rbDm = new javax.swing.JRadioButton();
        rbMm = new javax.swing.JRadioButton();
        lbSubtitulo = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lbValorInserido = new javax.swing.JLabel();
        lbResultadoObtidio = new javax.swing.JLabel();
        lbResultUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 153, 153));
        lbTitulo.setText("CONVERSOR DE DISTÂNCIA");
        lbTitulo.setAlignmentY(0.0F);

        bgEscolha.add(rbKm);
        rbKm.setText("Quilometro (km)");
        rbKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKmActionPerformed(evt);
            }
        });

        bgEscolha.add(rbDam);
        rbDam.setText("Decâmetro (dam)");
        rbDam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDamActionPerformed(evt);
            }
        });

        bgEscolha.add(rbHm);
        rbHm.setText("Hectômetro (hm)");
        rbHm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHmActionPerformed(evt);
            }
        });

        bgEscolha.add(rbM);
        rbM.setText("Metros (m)");
        rbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMActionPerformed(evt);
            }
        });

        bgEscolha.add(rbCm);
        rbCm.setText("Centímetro (cm)");
        rbCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCmActionPerformed(evt);
            }
        });

        bgEscolha.add(rbDm);
        rbDm.setText("Decímetro (dm)");
        rbDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDmActionPerformed(evt);
            }
        });

        bgEscolha.add(rbMm);
        rbMm.setText("Milímetro (mm)");
        rbMm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMmActionPerformed(evt);
            }
        });

        lbSubtitulo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(0, 153, 153));
        lbSubtitulo.setText("Escreva o valor desejado e selecione as opções para converter para diferentes distâncias!");

        lbValorInserido.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbValorInserido.setText("Valor inserido (em m)");

        lbResultadoObtidio.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbResultadoObtidio.setText("Resultado obtido");

        lbResultUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbResultUsuario.setForeground(new java.awt.Color(0, 0, 204));
        lbResultUsuario.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValorInserido)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbResultadoObtidio)
                                .addGap(87, 87, 87))
                            .addComponent(lbResultUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbSubtitulo)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbDam)
                    .addComponent(rbKm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMm)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rbHm)
                                .addGap(107, 107, 107)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCm)
                            .addComponent(rbDm))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorInserido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResultadoObtidio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfValor)
                    .addComponent(lbResultUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbKm)
                    .addComponent(rbDm)
                    .addComponent(rbM))
                .addGap(18, 18, 18)
                .addComponent(rbMm)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCm)
                    .addComponent(rbHm)
                    .addComponent(rbDam))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKmActionPerformed
        double dValorKm = Double.parseDouble(tfValor.getText());
        double dResultKm = dValorKm/1000;
        lbResultUsuario.setText(String.valueOf(dResultKm));
    }//GEN-LAST:event_rbKmActionPerformed

    private void rbMmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMmActionPerformed
        double dValorMm = Double.parseDouble(tfValor.getText());
        double dResultMm = dValorMm*1000;
        lbResultUsuario.setText(String.valueOf(dResultMm));
    }//GEN-LAST:event_rbMmActionPerformed

    private void rbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMActionPerformed
        double dValorM = Double.parseDouble(tfValor.getText());
        //Foi colocado com o mesmo valor pois um g é um ml (caso da água)
        double dResultM = dValorM;
        lbResultUsuario.setText(String.valueOf(dResultM));
    }//GEN-LAST:event_rbMActionPerformed

    private void rbDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDmActionPerformed
        double dValorDm = Double.parseDouble(tfValor.getText());
        double dResultDm = dValorDm*10;
        lbResultUsuario.setText(String.valueOf(dResultDm));
    }//GEN-LAST:event_rbDmActionPerformed

    private void rbCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCmActionPerformed
        double dValorCm = Double.parseDouble(tfValor.getText());
        double dResultCm = dValorCm*100;
        lbResultUsuario.setText(String.valueOf(dResultCm));
    }//GEN-LAST:event_rbCmActionPerformed

    private void rbDamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDamActionPerformed
        double dValorDam = Double.parseDouble(tfValor.getText());
        double dResultDam = dValorDam/10;
        lbResultUsuario.setText(String.valueOf(dResultDam));
    }//GEN-LAST:event_rbDamActionPerformed

    private void rbHmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHmActionPerformed
        double dValorHm = Double.parseDouble(tfValor.getText());
        double dResultHm = dValorHm/100;
        lbResultUsuario.setText(String.valueOf(dResultHm));
    }//GEN-LAST:event_rbHmActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEscolha;
    private javax.swing.JLabel lbResultUsuario;
    private javax.swing.JLabel lbResultadoObtidio;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValorInserido;
    private javax.swing.JRadioButton rbCm;
    private javax.swing.JRadioButton rbDam;
    private javax.swing.JRadioButton rbDm;
    private javax.swing.JRadioButton rbHm;
    private javax.swing.JRadioButton rbKm;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JRadioButton rbMm;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
