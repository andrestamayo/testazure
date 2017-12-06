/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.CustomerMapper;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import model.Customer;

/**
 *
 * @author USUARIO
 */
public class TestService implements Serializable {
    
   @Inject
   private  CustomerMapper customermapper;

    public CustomerMapper getCustomermapper() {
        return customermapper;
    }

    public void setCustomermapper(CustomerMapper customermapper) {
        this.customermapper = customermapper;
    }
    
    public List<Customer> getAll(){
        return customermapper.sellectAll();
    }
    
}
