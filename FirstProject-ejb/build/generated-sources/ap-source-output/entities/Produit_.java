package entities;

import entities.Marque;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-30T17:44:42")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, String> reference;
    public static volatile SingularAttribute<Produit, Double> volume;
    public static volatile SingularAttribute<Produit, Integer> prix;
    public static volatile SingularAttribute<Produit, Double> poids;
    public static volatile SingularAttribute<Produit, Marque> marque;
    public static volatile SingularAttribute<Produit, String> denomination;

}