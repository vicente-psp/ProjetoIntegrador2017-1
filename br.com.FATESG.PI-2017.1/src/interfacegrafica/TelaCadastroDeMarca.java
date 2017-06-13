/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import classesdedados.Marca;
import classesdedados.Mensagens;
import javax.swing.JOptionPane;
import persistencia.MarcaDAO;

/**
 *
 * @author renatowsilva
 */
public class TelaCadastroDeMarca extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroDeMarca
     */
    public TelaCadastroDeMarca() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMarcaDescricao = new javax.swing.JTextField();
        jButtonMarcaLimpar = new javax.swing.JButton();
        jButtonMarcaSalvar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMinimumSize(new java.awt.Dimension(541, 464));

        jLabel2.setText("Descrição:");

        jTextFieldMarcaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaDescricaoActionPerformed(evt);
            }
        });

        jButtonMarcaLimpar.setText("Limpar");
        jButtonMarcaLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcaLimparActionPerformed(evt);
            }
        });

        jButtonMarcaSalvar.setText("Salvar");
        jButtonMarcaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcaSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMarcaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMarcaLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMarcaSalvar)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarcaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMarcaLimpar)
                    .addComponent(jButtonMarcaSalvar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMarcaLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcaLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMarcaLimparActionPerformed

    private void jTextFieldMarcaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaDescricaoActionPerformed

    private void jButtonMarcaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcaSalvarActionPerformed
        Marca cadastromarca = new Marca();
        MarcaDAO cadmarca = new MarcaDAO();
        
        try {
            
            cadastromarca.setDescricao(jTextFieldMarcaDescricao.getText().toUpperCase());
            cadmarca.incluir(cadastromarca);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, new Mensagens().mensagem("MSG14"));
        }
        
    }//GEN-LAST:event_jButtonMarcaSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMarcaLimpar;
    private javax.swing.JButton jButtonMarcaSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldMarcaDescricao;
    // End of variables declaration//GEN-END:variables
}
