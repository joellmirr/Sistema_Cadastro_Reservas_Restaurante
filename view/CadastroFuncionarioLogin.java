/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.FuncionarioDao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.FuncionarioM;

/**
 *
 * @author joelmir
 */
public class CadastroFuncionarioLogin extends javax.swing.JInternalFrame {
    FuncionarioDao Fdao = new FuncionarioDao() {};
    public CadastroFuncionarioLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nome = new javax.swing.JLabel();
        jLabel2_cpf = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_endereco = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jTextField_cpf = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_endereco = new javax.swing.JTextArea();
        jLabel_telefone = new javax.swing.JLabel();
        jTextField_telefone = new javax.swing.JTextField();
        label_senha = new javax.swing.JLabel();
        jTextField_senha = new javax.swing.JTextField();
        jButton_sair_ = new javax.swing.JButton();
        jButton_limpar_ = new javax.swing.JButton();
        jButton_salvar_ = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastro Funcionario");
        setToolTipText("");

        jPanel1.setToolTipText("Cadsatro Cliente");

        jLabel_titulo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel_titulo.setText("Cadastro Funcionario:");

        jLabel_nome.setText("Nome Completo:");

        jLabel2_cpf.setText("CPF(Login):");

        jLabel_email.setText("Email:");

        jLabel_endereco.setText("Endereco:");

        jTextArea_endereco.setColumns(20);
        jTextArea_endereco.setRows(5);
        jScrollPane1.setViewportView(jTextArea_endereco);

        jLabel_telefone.setText("Telefone:");

        label_senha.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_cpf)
                    .addComponent(jLabel_titulo)
                    .addComponent(jLabel_email)
                    .addComponent(jLabel_telefone)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_endereco))
                    .addComponent(jLabel_nome)
                    .addComponent(label_senha))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_email)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(jTextField_telefone)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(jTextField_senha)
                    .addComponent(jTextField_cpf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_cpf)
                    .addComponent(jTextField_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nome))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_email))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_telefone))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_endereco))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jButton_sair_.setText("Sair");
        jButton_sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sair_ActionPerformed(evt);
            }
        });

        jButton_limpar_.setText("Limpar");
        jButton_limpar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpar_ActionPerformed(evt);
            }
        });

        jButton_salvar_.setText("Salvar");
        jButton_salvar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvar_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jButton_salvar_, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jButton_limpar_)
                .addGap(108, 108, 108)
                .addComponent(jButton_sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_limpar_))
                    .addComponent(jButton_salvar_, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sair_ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_sair_ActionPerformed

    private void jButton_limpar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpar_ActionPerformed
        Limpar();
    }//GEN-LAST:event_jButton_limpar_ActionPerformed

    private void jButton_salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvar_ActionPerformed
        FuncionarioM u = this.CriarUsuario();
        Fdao.inserir(u);
        // JOptionPane.showMessageDialog(null,"\n"+u.getCpf()+"\n"+u.getSenha()+"\n"+u.getNome()+""
         // + "\n"+u.getEmail()+"\n"+u.getTelefone()+"\n"+u.getEndereco());
        Limpar();
    }//GEN-LAST:event_jButton_salvar_ActionPerformed
   public void Limpar(){
        jTextField_cpf.setText("");
        jTextField_senha.setText("");
        jTextField_nome.setText("");
        jTextField_email.setText("");
        jTextField_telefone.setText("");
        jTextArea_endereco.setText("");
   }
   
    public FuncionarioM CriarUsuario(){
        FuncionarioM f = new FuncionarioM();
            f.setCpf(jTextField_cpf.getText());
            f.setSenha(jTextField_senha.getText());
            f.setNome(jTextField_nome.getText());
            f.setEmail(jTextField_email.getText());
            f.setTelefone(jTextField_telefone.getText());
            f.setEndereco(jTextArea_endereco.getText());
            return f;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_limpar_;
    private javax.swing.JButton jButton_sair_;
    private javax.swing.JButton jButton_salvar_;
    private javax.swing.JLabel jLabel2_cpf;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_endereco;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_telefone;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_endereco;
    private javax.swing.JTextField jTextField_cpf;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_senha;
    private javax.swing.JTextField jTextField_telefone;
    private javax.swing.JLabel label_senha;
    // End of variables declaration//GEN-END:variables

}
