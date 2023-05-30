/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> {

    @PersistenceContext(unitName = "FirstProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }
    
    
    public boolean createProduit(Produit produit){
        Produit produitExistant = em.find(Produit.class, produit.getReference());
        Marque marqueExistant = em.find(Marque.class, produit.getMarque().getNom());
        
        if((produitExistant == null) && (marqueExistant != null) ){
            em.persist(produit);
            return true;
        }else {
            return false;
        }
    }
    
    public List<Produit> ListProduit(){
        return findAll();
    }
    
}
