/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services.impl;

import com.hannes.scuba.domain.Customers;
import com.hannes.scuba.domain.Inventory;
import com.hannes.scuba.domain.Person;
import com.hannes.scuba.domain.Trips;
import com.hannes.scuba.services.ViewService;
import com.hannes.scuba.services.crud.CustomersCrudService;
import com.hannes.scuba.services.crud.InventoryCrudService;
import com.hannes.scuba.services.crud.PersonCrudService;
import com.hannes.scuba.services.crud.TripsCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hannes
 */
@Service("viewService")
public class ViewServiceImpl implements ViewService {
    @Autowired
    private CustomersCrudService customersCrud;
    
    @Autowired
    private InventoryCrudService inventoryCrud;
    
    @Autowired
    private TripsCrudService tripsCrud;
    
    @Autowired
    private PersonCrudService personCrud;
    
    @Override
    public List<Customers> getCustomers() {
        return customersCrud.findAll();
    }

    @Override
    public List<Inventory> getInventory() {
        return inventoryCrud.findAll();
    }

    @Override
    public List<Trips> getTrips() {
        return tripsCrud.findAll();
    }

    @Override
    public List<Person> getPersons() {
        return personCrud.findAll();
    }
    
}
