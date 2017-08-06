
package br.com.senac.portifolio;


import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class Cartaz extends javax.swing.JFrame {
    
    public void limpar_sair(){
        lblCarta.setIcon(null);
        
        int sair = JOptionPane.showConfirmDialog(null, "Dados limpados deseja sair do programa", "Limpeza concluida", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "entao vamos continuar beleza :D", "Continue com o programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cartas(){
        int nipe = (int) (Math.random() * 4 + 1);
        int face = (int) (Math.random() * 13 + 1);
        //String[] faces={"AZ", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        
        if (nipe == 1 && face == 1) {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/azdeouros.png")));
        } else if(nipe == 2 && face == 1) {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/azdecopas.png")));
        } else if(nipe == 3 && face == 1){
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/azdeespadas.png")));
        }else if (nipe == 4 && face == 1){
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/azdepaus.png")));
        }else if(nipe == 1 && face == 2){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2deouros.png")));            
        }else if(nipe == 2 && face == 2){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2decopas.png")));            
        }else if(nipe == 3 && face == 2){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2deespadas.png")));           
        }else if(nipe == 4 && face == 2){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2depaus.png")));
        }else if(nipe == 1 && face == 3){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3decopas.png")));
        }else if(nipe == 2 && face == 3){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3deouros.png"))); 
        }else if(nipe == 3 && face == 3){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3deespadas.png")));
        }else if(nipe == 4 && face == 3){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3depaus.png"))); 
        }else if(nipe == 1 && face == 4){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4deouros.png")));
        }else if (nipe == 2 && face == 4){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4decopas.png"))); 
        }else if (nipe == 3 && face == 4){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4deespadas.png")));
        }else if(nipe == 4 && face == 4){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4depaus.png"))); 
        }else if (nipe == 1 && face == 5) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5deouros.png"))); 
        }else if(nipe == 2 && face == 5){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5decopas.png"))); 
        }else if(nipe == 3 && face == 5){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5deespadas.png"))); 
        }else if(nipe == 4 && face == 5){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5depaus.png"))); 
        }else if(nipe == 1 && face == 6){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6deouros.png"))); 
        }else if(nipe == 2 && face == 6){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6decopas.png"))); 
        }else if(nipe == 3 && face == 6){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6deespadas.png"))); 
        }else if(nipe == 4 && face == 6){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6depaus.png"))); 
        }else if(nipe == 1 && face == 7){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7deouros.png"))); 
        }else if(nipe == 2 && face == 7){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7decopas.png")));
        }else if(nipe == 3 && face == 7) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7deespadas.png"))); 
        }else if(nipe == 4 && face == 7){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7depaus.png"))); 
        }else if(nipe == 1 && face == 8){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8deouros.png"))); 
        }else if(nipe == 2 && face == 8){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8decopas.png")));
        }else if(nipe == 3 && face == 8) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8deespadas.png"))); 
        }else if(nipe == 4 && face == 8){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8depaus.png"))); 
        }else if(nipe == 1 && face == 9){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9deouros.png"))); 
        }else if(nipe == 2 && face == 9){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9decopas.png")));
        }else if(nipe == 3 && face == 9) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9deespadas.png"))); 
        }else if(nipe == 4 && face == 9){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9depaus.png"))); 
        }else if(nipe == 1 && face == 10){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10deouros.png"))); 
        }else if(nipe == 2 && face == 10){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10decopas.png")));
        }else if(nipe == 3 && face == 10) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10deespadas.png"))); 
        }else if(nipe == 4 && face == 10){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10depaus.png"))); 
        }else if(nipe == 1 && face == 11){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/valetedeouros.png"))); 
        }else if(nipe == 2 && face == 11){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/valetedecopas.png")));
        }else if(nipe == 3 && face == 11) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/valetedeespadas.png"))); 
        }else if(nipe == 4 && face == 11){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/valetedepaus.png"))); 
        }else if(nipe == 1 && face == 12){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/damadeouros.png"))); 
        }else if(nipe == 2 && face == 12){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/damadecopas.png")));
        }else if(nipe == 3 && face == 12) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/damadeespadas.png"))); 
        }else if(nipe == 4 && face == 12){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/damadepaus.png"))); 
        }else if(nipe == 1 && face == 13){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/reideouros.png"))); 
        }else if(nipe == 2 && face == 13){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/reidecopas.png")));
        }else if(nipe == 3 && face == 13) {
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/reideespadas.png"))); 
        }else if(nipe == 4 && face == 13){
           lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/reidepaus.png"))); 
        }
        
    }
    
    /**
     * Creates new form Cartaz
     */
    public Cartaz() {
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

        btnsortear = new javax.swing.JButton();
        lblCarta = new javax.swing.JLabel();
        btnLimpar_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnsortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/joker-card.jpg"))); // NOI18N
        btnsortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortearActionPerformed(evt);
            }
        });

        btnLimpar_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/borracha.png"))); // NOI18N
        btnLimpar_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsortear, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsortear, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnLimpar_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setBounds(0, 0, 853, 565);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpar_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_sairActionPerformed
        // TODO add your handling code here:
        limpar_sair();
    }//GEN-LAST:event_btnLimpar_sairActionPerformed

    private void btnsortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortearActionPerformed
        // TODO add your handling code here:
        cartas();
    }//GEN-LAST:event_btnsortearActionPerformed

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
            java.util.logging.Logger.getLogger(Cartaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar_sair;
    private javax.swing.JButton btnsortear;
    private javax.swing.JLabel lblCarta;
    // End of variables declaration//GEN-END:variables
}
