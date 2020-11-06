/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author rmendes
 */
public class Bebidas extends javax.swing.JFrame {
        Produto cola = new Produto(1, "Coca-Cola", 1.35f);
        Produto ice = new Produto(8, "Ice Tea", 1.65f);
        Produto sprite = new Produto(2, "Sprite", 1.45f);
        Produto agua = new Produto(3, "Água", 2.00f);
        Produto nes=  new Produto(4, "Nestea", 1.75f);
        Produto swe = new Produto(5, "Schweepes", 1.15f);
        Produto pepsi = new Produto(6, "Pepsi", 1.05f);
        Produto azeite = new Produto(7, "Azeite", 1.15f);
    /**
     * Creates new form Chocolates
     */
    public Bebidas() {
        initComponents();
        
        //String s = Float.toString(cola.Preco);
        //PrecoBox.setText(s + "€");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nomeBox = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BuyBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Troco = new javax.swing.JTextField();
        MoneyInput = new javax.swing.JTextField();
        PrecoBox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nesBTN = new javax.swing.JButton();
        sweBTN = new javax.swing.JButton();
        azeiteBTN = new javax.swing.JButton();
        colaBTN = new javax.swing.JButton();
        iceBTN = new javax.swing.JButton();
        spriteBTN = new javax.swing.JButton();
        aguaBTN = new javax.swing.JButton();
        pepsiBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm.jpg"))); // NOI18N

        nomeBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeBox.setText("M&M's");

        jLabel3.setText("Preço:");

        jLabel4.setText("Inserir Dinheiro");

        BuyBTN.setText("Comprar");

        jLabel5.setText("Troco:");

        PrecoBox.setEditable(false);
        PrecoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecoBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeBox, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Troco)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PrecoBox, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addComponent(jLabel4)
                        .addComponent(BuyBTN)
                        .addComponent(jLabel5)
                        .addComponent(MoneyInput)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PrecoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(BuyBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Troco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nesBTN.setText("Nestea");
        nesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nesBTNActionPerformed(evt);
            }
        });

        sweBTN.setText("Schweppes");
        sweBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweBTNActionPerformed(evt);
            }
        });

        azeiteBTN.setText("Azeite");
        azeiteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azeiteBTNActionPerformed(evt);
            }
        });

        colaBTN.setText("Cola");
        colaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaBTNActionPerformed(evt);
            }
        });

        iceBTN.setText("Ice Tea");
        iceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceBTNActionPerformed(evt);
            }
        });

        spriteBTN.setText("Sprite");
        spriteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteBTNActionPerformed(evt);
            }
        });

        aguaBTN.setText("Água");
        aguaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguaBTNActionPerformed(evt);
            }
        });

        pepsiBTN.setText("Pepsi");
        pepsiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pepsiBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colaBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iceBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nesBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spriteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sweBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aguaBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(azeiteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colaBTN)
                    .addComponent(iceBTN)
                    .addComponent(spriteBTN)
                    .addComponent(aguaBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepsiBTN)
                    .addComponent(nesBTN)
                    .addComponent(sweBTN)
                    .addComponent(azeiteBTN)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrecoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecoBoxActionPerformed

    private void pepsiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepsi.jpg")));
    String s = Float.toString(pepsi.Preco);
    nomeBox.setText(pepsi.Nome);
    PrecoBox.setText(s + "€");
    }//GEN-LAST:event_pepsiBTNActionPerformed

    private void spriteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprite.jpg")));
    String s = Float.toString(sprite.Preco);
    nomeBox.setText(sprite.Nome);
    PrecoBox.setText(s + "€");
    }//GEN-LAST:event_spriteBTNActionPerformed

    private void colaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cola.jpg")));
    String s = Float.toString(cola.Preco);
    nomeBox.setText(cola.Nome);
    PrecoBox.setText(s + "€");
    }//GEN-LAST:event_colaBTNActionPerformed

    private void iceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ice.jpg")));
    String s = Float.toString(ice.Preco);
    nomeBox.setText(ice.Nome);
    PrecoBox.setText(s + "€");
    }//GEN-LAST:event_iceBTNActionPerformed

    private void nesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nesBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nes.jpg")));
    String s = Float.toString(nes.Preco);
    nomeBox.setText(nes.Nome);
    PrecoBox.setText(s + "€");
    }//GEN-LAST:event_nesBTNActionPerformed

    private void sweBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe.jpg")));
    String s = Float.toString(swe.Preco);
    nomeBox.setText(swe.Nome);
    PrecoBox.setText(s + "€");
    }//GEN-LAST:event_sweBTNActionPerformed

    private void aguaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguaBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agua.jpg")));
    String s = Float.toString(agua.Preco);
    nomeBox.setText(agua.Nome);
    PrecoBox.setText(s + "€");
    }//GEN-LAST:event_aguaBTNActionPerformed

    private void azeiteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azeiteBTNActionPerformed
    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/azeite.jpg")));
    String s = Float.toString(azeite.Preco);
    nomeBox.setText(azeite.Nome);
    PrecoBox.setText(s + "€");
    
    }//GEN-LAST:event_azeiteBTNActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chocolates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            //</editor-fold>
            //</editor-fold>
            
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Chocolates().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyBTN;
    private javax.swing.JTextField MoneyInput;
    private javax.swing.JTextField PrecoBox;
    private javax.swing.JTextField Troco;
    private javax.swing.JButton aguaBTN;
    private javax.swing.JButton azeiteBTN;
    private javax.swing.JButton colaBTN;
    private javax.swing.JButton iceBTN;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nesBTN;
    private javax.swing.JLabel nomeBox;
    private javax.swing.JButton pepsiBTN;
    private javax.swing.JButton spriteBTN;
    private javax.swing.JButton sweBTN;
    // End of variables declaration//GEN-END:variables
}
