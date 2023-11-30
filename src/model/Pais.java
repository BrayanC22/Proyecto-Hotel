/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Guillermo
 */
public class Pais {
    
    String idPais,nomPais;

    public Pais(){
        idPais="";
        nomPais="";
    }

    public Pais(String idPais, String nomPais) {
        this.idPais = idPais;
        this.nomPais = nomPais;
    }
            
    
    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    @Override
    public String toString() {
        return  nomPais;
    }
    
    
}
