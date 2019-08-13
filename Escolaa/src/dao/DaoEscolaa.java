/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Escolaa;

/**
 *
 * @author Clovis
 */
public class DaoEscolaa {
     public static boolean inserir(Escolaa objeto) {
        String sql = "INSERT INTO escolaa (nome, endereco, sigla, nr_alunos, area) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setString(2, objeto.getEndereco());
            ps.setString(3, objeto.getSigla());
            ps.setInt(4, objeto.getNr_alunos());
            ps.setDouble(5, objeto.getArea());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static void main(String[] args) {
        Escolaa objeto = new Escolaa();
        objeto.setNome("Instituto Federal");
        objeto.setEndereco("Ibirubá");
        objeto.setSigla("IFRS");
        objeto.setNr_alunos(100);
        objeto.setArea(5.2);
        
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
        public static boolean alterar(Escolaa objeto) {
        String sql = "UPDATE escolaa SET nome = ?, endereco = ?, sigla = ?, nr_alunos = ?, area = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome()); 
            ps.setString(2, objeto.getEndereco());
            ps.setString(3, objeto.getSigla());
            ps.setInt(4, objeto.getCodigo());
            ps.setInt(5, objeto.getNr_alunos());
            ps.setDouble(6, objeto.getArea());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
          public static boolean excluir(Escolaa objeto) {
        String sql = "DELETE FROM escolaa WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
