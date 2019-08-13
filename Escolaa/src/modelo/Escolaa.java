/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Clovis
 */
public class Escolaa {
    private int codigo;
    private String nome;
    private String endereco;
    private String sigla;
    private int nr_alunos;
    private double area;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getNr_alunos() {
        return nr_alunos;
    }

    public void setNr_alunos(int nr_alunos) {
        this.nr_alunos = nr_alunos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Escolaa{" + "sigla=" + sigla + '}';
    }

    
}
