/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logikaifejtoro;

import javax.swing.JOptionPane;

public class LogikaiFejtoroGUI extends javax.swing.JFrame {

    public LogikaiFejtoroGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bronzPNL = new javax.swing.JPanel();
        bronzfeliratLBL = new javax.swing.JLabel();
        bronzLadaLBL = new javax.swing.JLabel();
        bronzBTTN = new javax.swing.JButton();
        ezustPNL = new javax.swing.JPanel();
        ezustfeliratLBL = new javax.swing.JLabel();
        ezustLadaLBL = new javax.swing.JLabel();
        ezustBTTN = new javax.swing.JButton();
        aranyPNL = new javax.swing.JPanel();
        aranyfeliratLBL = new javax.swing.JLabel();
        aranyLadaLBL = new javax.swing.JLabel();
        aranyBTTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bronzPNL.setBackground(new java.awt.Color(255, 204, 102));
        bronzPNL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0)));
        bronzPNL.setToolTipText("");

        bronzfeliratLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bronzfeliratLBL.setText("Az aranyláda hazudik");

        bronzLadaLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bronzLadaLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bronzLadaLBL.setText("Bronzláda");

        bronzBTTN.setText("Kinyit");
        bronzBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rosszBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bronzPNLLayout = new javax.swing.GroupLayout(bronzPNL);
        bronzPNL.setLayout(bronzPNLLayout);
        bronzPNLLayout.setHorizontalGroup(
            bronzPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bronzPNLLayout.createSequentialGroup()
                .addGroup(bronzPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bronzPNLLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bronzfeliratLBL))
                    .addGroup(bronzPNLLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(bronzLadaLBL))
                    .addGroup(bronzPNLLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(bronzBTTN)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        bronzPNLLayout.setVerticalGroup(
            bronzPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bronzPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bronzLadaLBL)
                .addGap(18, 18, 18)
                .addComponent(bronzfeliratLBL)
                .addGap(18, 18, 18)
                .addComponent(bronzBTTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ezustPNL.setBackground(new java.awt.Color(204, 204, 204));
        ezustPNL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        ezustPNL.setToolTipText("");
        ezustPNL.setPreferredSize(new java.awt.Dimension(180, 105));

        ezustfeliratLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ezustfeliratLBL.setText("Nem én rejtem a kincset");

        ezustLadaLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ezustLadaLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ezustLadaLBL.setText("Ezüstláda");

        ezustBTTN.setText("Kinyit");
        ezustBTTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ezustBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ezustPNLLayout = new javax.swing.GroupLayout(ezustPNL);
        ezustPNL.setLayout(ezustPNLLayout);
        ezustPNLLayout.setHorizontalGroup(
            ezustPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ezustPNLLayout.createSequentialGroup()
                .addGroup(ezustPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ezustPNLLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(ezustLadaLBL))
                    .addGroup(ezustPNLLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ezustfeliratLBL))
                    .addGroup(ezustPNLLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(ezustBTTN)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        ezustPNLLayout.setVerticalGroup(
            ezustPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ezustPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ezustLadaLBL)
                .addGap(18, 18, 18)
                .addComponent(ezustfeliratLBL)
                .addGap(18, 18, 18)
                .addComponent(ezustBTTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aranyPNL.setBackground(new java.awt.Color(255, 255, 153));
        aranyPNL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        aranyPNL.setToolTipText("");

        aranyfeliratLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aranyfeliratLBL.setText("Én rejtem a kincset");

        aranyLadaLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aranyLadaLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aranyLadaLBL.setText("Aranyláda");

        aranyBTTN.setText("Kinyit");
        aranyBTTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aranyBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rosszBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aranyPNLLayout = new javax.swing.GroupLayout(aranyPNL);
        aranyPNL.setLayout(aranyPNLLayout);
        aranyPNLLayout.setHorizontalGroup(
            aranyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aranyPNLLayout.createSequentialGroup()
                .addGroup(aranyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aranyPNLLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(aranyLadaLBL))
                    .addGroup(aranyPNLLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(aranyfeliratLBL))
                    .addGroup(aranyPNLLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(aranyBTTN)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        aranyPNLLayout.setVerticalGroup(
            aranyPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aranyPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aranyLadaLBL)
                .addGap(18, 18, 18)
                .addComponent(aranyfeliratLBL)
                .addGap(18, 18, 18)
                .addComponent(aranyBTTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Logikai fejtörő");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(aranyPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(ezustPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(bronzPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aranyPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ezustPNL, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(bronzPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rosszBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rosszBTNActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Nem a kinccsel teli ládát nyitottad ki!", "Ez most nem sikerült!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_rosszBTNActionPerformed

    private void joBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joBTNActionPerformed
        //JOptionPane.showMessageDialog(rootPane, "Gratulákok, jó ládát nyitottál ki, a kincs a tiéd!", "Juhhu!", JOptionPane.INFORMATION_MESSAGE);
        String[] valasztasok = { "Kiveszem", "Bennehagyom"};
        int kincs = 1;
        boolean nalunkVanE = false;
        while(!nalunkVanE){
            if(ezustBTTN.isEnabled()){
                int valasz = JOptionPane.showOptionDialog(rootPane, "Gratulálok! megtaláltad a kincset, kiveszed vagy bennehagyod?", "Juhhu", 0, 2, null, valasztasok, EXIT_ON_CLOSE);
                if(valasz == 0){
                    //kincs--;
                    nalunkVanE = true;
                    JOptionPane.showMessageDialog(rootPane, "Kivetted a kincset");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Bennehagytad a kincset");
                }
            }
        }
       // if(nalunkVanE == true){
       //     JOptionPane.showMessageDialog(rootPane, "Már kivetted a kincset");
       // }
        
    }//GEN-LAST:event_joBTNActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogikaiFejtoroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogikaiFejtoroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogikaiFejtoroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogikaiFejtoroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogikaiFejtoroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aranyBTTN;
    private javax.swing.JLabel aranyLadaLBL;
    private javax.swing.JPanel aranyPNL;
    private javax.swing.JLabel aranyfeliratLBL;
    private javax.swing.JButton bronzBTTN;
    private javax.swing.JLabel bronzLadaLBL;
    private javax.swing.JPanel bronzPNL;
    private javax.swing.JLabel bronzfeliratLBL;
    private javax.swing.JButton ezustBTTN;
    private javax.swing.JLabel ezustLadaLBL;
    private javax.swing.JPanel ezustPNL;
    private javax.swing.JLabel ezustfeliratLBL;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
