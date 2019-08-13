/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoEscolaa;
import javax.swing.JOptionPane;
import modelo.Escolaa;


import tela.manutencao.ManutencaoEscolaa;

/**
 *
 * @author Clovis
 */
public class ControladorEscolaa {

    public static void inserir(ManutencaoEscolaa man){
        Escolaa objeto = new Escolaa();
        objeto.setNome(man.jtfNome.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setSigla(man.jtfSigla.getText());
        objeto.setNr_alunos(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setArea(Double.parseDouble(man.jtfArea.getText()));
        
        boolean resultado = DaoEscolaa.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoEscolaa man){
        Escolaa objeto = new Escolaa();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome(man.jtfNome.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setSigla(man.jtfSigla.getText());
        objeto.setNr_alunos(Integer.parseInt(man.jtfNr_alunos.getText()));
        objeto.setArea(Double.parseDouble(man.jtfArea.getText()));
        
        boolean resultado = DaoEscolaa.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

     public static void excluir(ManutencaoEscolaa man){
        Escolaa objeto = new Escolaa();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoEscolaa.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
