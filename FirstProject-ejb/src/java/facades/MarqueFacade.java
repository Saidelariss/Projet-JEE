/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Produit;
import entities.Marque;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class MarqueFacade extends AbstractFacade<Marque> {

    @PersistenceContext(unitName = "FirstProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarqueFacade() {
        super(Marque.class);
    }
    
    public  Boolean créer(String nom,String origine){
        Marque marque = em.find(Marque.class, nom);
        if(marque !=null) return false;
         marque = new Marque(nom,origine);
        try{
            em.persist(marque);
            return true;
        }
       catch(Exception e){
          
           return false;
       }
        
    }
    
    
    
    public Boolean Supprimer(String nom, String origine){
        Marque marque = em.find(Marque.class, nom);
         if(marque !=null) return false;
         marque = new Marque(nom,origine);
        try{
            em.remove(marque);
            return true;
        }
       catch(Exception e){
          
           return false;
       }
         
        
    }
    
    
    public List<Produit> getProduitByMarque(String nom){
        Marque marque = em.find(Marque.class, nom);
        return marque.getProduits();
        
    }
    
    public Marque getMarqueByName(String name){
        return em.find(Marque.class, name);
    }
    
    public void addProduct(Marque marque, Produit produit){
        marque.getProduits().add(produit);
        em.merge(marque);
    }
    
    
    
}