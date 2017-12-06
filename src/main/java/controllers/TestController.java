/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.CustomerMapper;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import model.Customer;
import services.TestService;

/**
 *
 * @author USUARIO
 */
@Named("testController")
@ViewScoped
public class TestController implements Serializable{

    /**
     * Creates a new instance of TestController
     */
    @Inject
    private TestService tservice;
    @Inject
    private  CustomerMapper customermapper;
    
    private List<Customer> customers;
    public TestController() {
        
    }
    @PostConstruct
    public void init(){
       customers= customermapper.sellectAll();
         int a = 1+1;
    }

    public TestService getTservice() {
        return tservice;
    }

    public void setTservice(TestService tservice) {
        this.tservice = tservice;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    
    
}
