package agendaInterfaceGrafica;

import javax.swing.JOptionPane;
import agendacrud.AgendaDAO;
import agendacrud.Contato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    AgendaDAO bd;

    public Principal() {
        initComponents();
        bd = new AgendaDAO();
        LoadContato();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_contato = new javax.swing.JTable();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_num = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_grupo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bt_delete = new javax.swing.JButton();
        bt_add = new javax.swing.JButton();
        bt_save = new javax.swing.JButton();
        bt_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Agenda de contatos");

        table_contato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Numero", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_contato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_contatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_contato);
        if (table_contato.getColumnModel().getColumnCount() > 0) {
            table_contato.getColumnModel().getColumn(0).setMinWidth(0);
            table_contato.getColumnModel().getColumn(0).setPreferredWidth(0);
            table_contato.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        txt_nome.setName("txt_nome"); // NOI18N

        jLabel2.setText("Nome");

        txt_num.setName("txt_numero"); // NOI18N

        jLabel3.setText("Numero");

        txt_grupo.setName("txt_grupo"); // NOI18N
        txt_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grupoActionPerformed(evt);
            }
        });

        jLabel4.setText("Grupo");

        bt_delete.setText("Deletar");
        bt_delete.setName("bt_delete"); // NOI18N
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        bt_add.setText("Adicionar");
        bt_add.setName("bt_add"); // NOI18N
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_save.setText("Salvar");
        bt_save.setName("bt_save"); // NOI18N
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        bt_clear.setText("Limpar campos");
        bt_clear.setName("bt_delete"); // NOI18N
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nome)
                    .addComponent(jLabel2)
                    .addComponent(txt_num, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_grupo)
                    .addComponent(bt_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(bt_add)
                        .addGap(18, 18, 18)
                        .addComponent(bt_save)
                        .addGap(18, 18, 18)
                        .addComponent(bt_delete)
                        .addGap(18, 18, 18)
                        .addComponent(bt_clear)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_grupoActionPerformed

    private void LoadContato()
    {
        List<Contato> contatos = new ArrayList<>();
        contatos = bd.listar();
        DefaultTableModel modelo = (DefaultTableModel) table_contato.getModel();
        modelo.setRowCount(0);
        
        for(Contato ct : contatos )
        {
            modelo.addRow(new Object[]{ct.getId(),ct.getNome(), ct.getNumero(), ct.getGrupo()});
        }
    }
    
    private boolean VerificaCampos()
    {
        return !txt_nome.getText().isEmpty() && !txt_num.getText().isEmpty() && !txt_grupo.getText().isEmpty();
    }
    
    // botao de adicionar
    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        if(!VerificaCampos())
        {
            JOptionPane.showMessageDialog(null, "Por favor insira todos os dados", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else
        {
            String nome = txt_nome.getText();
            String numero = txt_num.getText();
            String grupo = txt_grupo.getText();
            
            Contato c = new Contato(numero,nome,grupo);
            bd.inserir(c);
            LoadContato();
            LimpaCampos();
        }
    }//GEN-LAST:event_bt_addActionPerformed

    // botao de salvar
    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        int row = table_contato.getSelectedRow();
        if(!VerificaCampos())
        {
            JOptionPane.showMessageDialog(null, "Por favor insira todos os dados", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else
        {
            if (row != -1)
            {
                String nome = txt_nome.getText();
                String numero = txt_num.getText();
                String grupo = txt_grupo.getText();

                Contato c = new Contato(numero,nome,grupo);
                int id = (int) table_contato.getValueAt(row, 0);  
                c.setId(id);
                bd.atualizar(c);
                LoadContato();
                LimpaCampos();
            }
            
        }
    }//GEN-LAST:event_bt_saveActionPerformed

    // botao de excluir
    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        int row = table_contato.getSelectedRow();
        if (row != -1) { 
            int confirm = JOptionPane.showConfirmDialog(
                null, 
                "Você realmente deseja excluir este contato?", 
                "Confirmar exclusão", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
            
            if (confirm == JOptionPane.YES_OPTION)
            {
                int id = (int) table_contato.getValueAt(row, 0);  

                AgendaDAO dao = new AgendaDAO();
                if (dao.deletar(id) != -1) {
                    JOptionPane.showMessageDialog(null, "Contato deletado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    LoadContato();
                    LimpaCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar deletar contato", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione um contato para excluir", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void table_contatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_contatoMouseClicked
        if (evt.getClickCount() == 2) {
            int row = table_contato.rowAtPoint(evt.getPoint());
            if (row != -1) {  
                txt_nome.setText(table_contato.getValueAt(row, 1).toString());
                txt_num.setText(table_contato.getValueAt(row, 2).toString());
                txt_grupo.setText(table_contato.getValueAt(row,3).toString());
            }
        }
    }//GEN-LAST:event_table_contatoMouseClicked

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        LimpaCampos();
        
    }//GEN-LAST:event_bt_clearActionPerformed

    private void LimpaCampos()
    {
        txt_nome.setText("");
        txt_num.setText("");
        txt_grupo.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_contato;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_num;
    // End of variables declaration//GEN-END:variables
}