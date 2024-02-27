/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.ClienteM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public abstract class ClienteDao implements Dao{
    
    //JOptionPane.showMessageDialog(null,"ate aqui"); 
    
    
    public conn con = new conn();
    public void inserir(Object o) {
       ClienteM c = (ClienteM) o;
       String sql = "INSERT INTO Cliente (nome,cpf,email,telefone,endereco) VALUES(?,?,?,?,?)";
       try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,c.getNome());
           ps.setString(2,c.getCpf());
           ps.setString(3,c.getEmail());
           ps.setString(4, c.getTelefone());
           ps.setString(5, c.getEndereco());
           ps.execute();
           ps.close();
           JOptionPane.showMessageDialog(null,"Cadastro Realizado!");
          // con.FecharConexao();
       }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       }
       
    }

    @Override
    public void atualizar(Object o) {
        ClienteM c = (ClienteM) o;
         String sql = "UPDATE Cliente SET nome=?,cpf=?,email=?,telefone=?,endereco=? WHERE idcliente=?";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,c.getNome());
           ps.setString(2,c.getCpf());
           ps.setString(3,c.getEmail());
           ps.setString(4, c.getTelefone());
           ps.setString(5, c.getEndereco());
           ps.setString(6, c.getIdcliente());
           ps.execute();
           ps.close(); 
           JOptionPane.showMessageDialog(null,"Cadastro Atualizado!");

         } catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       } 
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Cliente WHERE idcliente=" + o;
        try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Cadastro Excluido!");
        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       } 
    }
}
