/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class ListeDeStock implements Serializable {
      private  List<ElementDeStock> listElement ;  

    public ListeDeStock() {
        listElement = new ArrayList() ; 
    }

    public List<ElementDeStock> getListElement() {
        return listElement;
    }

    public void setListElement(List<ElementDeStock> listElement) {
        this.listElement = listElement;
    }
}
