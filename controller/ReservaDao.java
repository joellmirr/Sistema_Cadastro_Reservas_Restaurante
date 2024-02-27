/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Reserva;
import view.PrimeiraTela_Reserva;

/**
 *
 * @author joelmir
 */
public abstract class ReservaDao implements Dao{
    public conn con = new conn();
    public void inserir(Object o) {
        Reserva r = (Reserva) o;
       String sql = "INSERT INTO Reservas (mesa,datareserva,periodo,qtdpessoas,cliente) VALUES(?,?,?,?,?)";
       try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setInt(1,r.getMesa());
           ps.setString(2,r.getDatareserva());
           ps.setString(3,r.getPeriodo());
           ps.setInt(4, r.getQtdpessoas());
           ps.setInt(5, r.getCliente());
           ps.execute();
           ps.close();
           JOptionPane.showMessageDialog(null,"Cadastro Realizado!");
          // con.FecharConexao();
       }catch(SQLException ex){
         //JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       }
       
    }

    @Override
    public void atualizar(Object o) {
        Reserva r = (Reserva) o;
         String sql = "UPDATE Reservas SET mesa=?,datareserva=?,periodo=?,qtdpessoas=?,cliente=? WHERE idreserva=?";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setInt(1,r.getMesa());
           ps.setString(2,r.getDatareserva());
           ps.setString(3,r.getPeriodo());
           ps.setInt(4, r.getQtdpessoas());
           ps.setInt(5, r.getCliente());
           ps.setString(6,r.getIdreserva());
           ps.execute();
           ps.close(); 
           JOptionPane.showMessageDialog(null,"Cadastro Atualizado!");
         } catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       } 
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Reservas WHERE idreserva=" + o;
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
