/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
@Entity
public class Marque implements Serializable {

   
      @Id
     private String nom;
    
    private String origine;
    
    @OneToMany
    List<Produit> produits = new ArrayList<>();
    
    
    public Marque(){
        
    }
    
    public Marque(String nom,String origine){
        this.nom=nom;
        this.origine=origine;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    /**
     * Get the value of origine
     *
     * @return the value of origine
     */
    public String getOrigine() {
        return origine;
    }

    /**
     * Set the value of origine
     *
     * @param origine new value of origine
     */
    public void setOrigine(String origine) {
        this.origine = origine;
    }

    

   
  

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the value of nom
     *
     * @param nom new value of nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }




 

  
}
