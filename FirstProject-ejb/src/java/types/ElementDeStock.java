/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class ElementDeStock implements Serializable{
    private String refProduit ;
    private int Quantite ; 

    public ElementDeStock(String refProduit, int Quantite) {
        this.refProduit = refProduit;
        this.Quantite = Quantite;
    }

    public String getRefProduit() {
        return refProduit;
    }

    public void setRefProduit(String refProduit) {
        this.refProduit = refProduit;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }
    
    
    
}
