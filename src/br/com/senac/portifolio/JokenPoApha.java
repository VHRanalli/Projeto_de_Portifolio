/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.portifolio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class JokenPoApha extends javax.swing.JFrame {
    
    public int placarcomputador;
    public int placarjogador;
    public int empates;
    
   /* public void limpar(){
        lblvencedor.setText(null);
        lbljogador.setIcon(null);
        lblcomputador.setIcon(null);
    }*/
    
    public void papel(){
        
        
        int pedrapapeloutesoura1 = (int) (Math.random() * 3 + 1);
        
        
        if (pedrapapeloutesoura1 == 1) {
            lblVencedor.setText(" Empate ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/papel.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/papel.png")));
            empates++;
            lblEmpate.setText("Empates: " + empates);
            
        } else if (pedrapapeloutesoura1 == 2) {
            lblVencedor.setText(" <- Vencedor ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/papel.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/pedra.png")));
            placarjogador++;
            lblPlacarj.setText("jogador vitorias: " + placarjogador);
            
            
        } else if (pedrapapeloutesoura1 == 3){
            lblVencedor.setText(" Vencedor -> ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/papel.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/tesoura.png")));
            placarcomputador++;
            lblPlacarc.setText("computador vitorias: " + placarcomputador);
            
        }
        
    }
    
    public void pedra(){
        String pedra;
        
        pedra = "pedra";
        
        int pedrapapeltesoura3 = (int) (Math.random() * 3 + 1);
        
        if (pedrapapeltesoura3 == 1) {
            lblVencedor.setText(" Empate ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/pedra.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/pedra.png")));
            empates++;
            lblEmpate.setText("Empates: " + empates);
        } else if (pedrapapeltesoura3 == 2) {
            lblVencedor.setText(" <- Vencedor ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/pedra.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/tesoura.png")));
            placarjogador++;
            lblPlacarj.setText("jogador vitorias: " + placarjogador);
            
            
        } else if (pedrapapeltesoura3 == 3){
            lblVencedor.setText(" Vencedor -> ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/pedra.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/papel.png")));
            placarcomputador++;
            lblPlacarc.setText("computador vitorias: " + placarcomputador);
            
        }
    }
    
    public void chances (){
         int sair = JOptionPane.showConfirmDialog(null, "deseja continuar?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
           if (sair == JOptionPane.YES_OPTION){
        lblVencedor.setText(null);
        lblJogador.setIcon(null);
        lblComputador.setIcon(null);
           } else {
               dispose();
           }
        
    }
    
    public void tesoura(){
        String tesoura;
        
        tesoura = "tesoura";
        
        int pedrapapeltesoura2 = (int) (Math.random() * 3 + 1);
        
        if (pedrapapeltesoura2 == 1) {
            lblVencedor.setText(" Empate ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/tesoura.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/tesoura.png")));
            empates++;
            lblEmpate.setText("Empates: " + empates);
        } else if (pedrapapeltesoura2 == 2) {
            lblVencedor.setText(" <- Vencedor ");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/tesoura.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/papel.png")));
            placarjogador++;
            lblPlacarj.setText("jogador vitorias: " + placarjogador);
            
        } else if (pedrapapeltesoura2 == 3){
            lblVencedor.setText(" Vencedor ->");
            lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/tesoura.png")));
            lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/pedra.png")));
            placarcomputador++;
            lblPlacarc.setText("computador vitorias: " + placarcomputador);
        }
        
    }

    /**
     * Creates new form JokenPo
     */
    public JokenPoApha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPapel = new javax.swing.JButton();
        btnPedra = new javax.swing.JButton();
        btnTesoura = new javax.swing.JButton();
        lblJogador = new javax.swing.JLabel();
        lblComputador = new javax.swing.JLabel();
        lblVencedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPlacarj = new javax.swing.JLabel();
        lblPlacarc = new javax.swing.JLabel();
        lblEmpate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/if_paper_226568.png"))); // NOI18N
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btnPedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/pedra.png"))); // NOI18N
        btnPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedraActionPerformed(evt);
            }
        });

        btnTesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/if_Cut_1493291.png"))); // NOI18N
        btnTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesouraActionPerformed(evt);
            }
        });

        lblJogador.setText("Jogador");

        lblComputador.setText("computador");

        lblVencedor.setText("Quem vencera?");

        jLabel1.setText("Placar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVencedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(258, 258, 258)
                .addComponent(lblComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(829, 829, 829))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(932, 932, 932)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnPedra, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnTesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(393, 393, 393)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPlacarj, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(lblPlacarc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(410, 410, 410)
                                .addComponent(lblEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblPlacarj, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTesoura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPedra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblPlacarc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(lblVencedor)
                        .addGap(297, 297, 297))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblComputador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        setBounds(0, 0, 1180, 814);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        //limpar();
        papel();
        chances();
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesouraActionPerformed
        //limpar();
        tesoura();
        chances();
    }//GEN-LAST:event_btnTesouraActionPerformed

    private void btnPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedraActionPerformed
        //limpar();
        pedra();
        chances();
    }//GEN-LAST:event_btnPedraActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JokenPoApha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JokenPoApha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JokenPoApha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JokenPoApha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JokenPoApha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPedra;
    private javax.swing.JButton btnTesoura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblComputador;
    private javax.swing.JLabel lblEmpate;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblPlacarc;
    private javax.swing.JLabel lblPlacarj;
    private javax.swing.JLabel lblVencedor;
    // End of variables declaration//GEN-END:variables
}
