/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
@Entity
public class Produit implements Serializable {

    
    @Id
    private String reference;
    
    @ManyToOne
    private String marque;
    
    private String denomination;
    
    private int prix;
    
    private double poids;
    
    private double volume;
    
    
    
    public Produit(){
        super();
        
    }

    public Produit(String reference, String marque, String denomination, int prix, double poids, double volume) {
        this.reference = reference;
        this.marque = marque;
        this.denomination = denomination;
        this.prix = prix;
        this.poids = poids;
        this.volume = volume;
    }
    
    

    /**
     * Get the value of volume
     *
     * @return the value of volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Set the value of volume
     *
     * @param volume new value of volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }


    /**
     * Get the value of poids
     *
     * @return the value of poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * Set the value of poids
     *
     * @param poids new value of poids
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    
    
    
    
    

    /**
     * Get the value of denomination
     *
     * @return the value of denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * Set the value of denomination
     *
     * @param denomination new value of denomination
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }


    /**
     * Get the value of marque
     *
     * @return the value of marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Set the value of marque
     *
     * @param marque new value of marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    
  

    

    /**
     * Get the value of reference
     *
     * @return the value of reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Set the value of reference
     *
     * @param reference new value of reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    
    
    
     
            
  

    /**
     * Get the value of prix
     *
     * @return the value of prix
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Set the value of prix
     *
     * @param prix new value of prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }


   



    


    
}
