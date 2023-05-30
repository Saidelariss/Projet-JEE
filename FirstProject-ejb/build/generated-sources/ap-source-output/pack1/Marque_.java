package pack1;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pack1.Produit;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-30T16:36:32")
@StaticMetamodel(Marque.class)
public class Marque_ { 

    public static volatile ListAttribute<Marque, Produit> produits;
    public static volatile SingularAttribute<Marque, String> origine;
    public static volatile SingularAttribute<Marque, String> nom;

}