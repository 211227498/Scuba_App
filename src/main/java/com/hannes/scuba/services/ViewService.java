/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services;

import com.hannes.scuba.domain.Customers;
import com.hannes.scuba.domain.Inventory;
import com.hannes.scuba.domain.Person;
import com.hannes.scuba.domain.Trips;
import java.util.List;

/**
 *
 * @author Hannes
 */
public interface ViewService {
    public List<Customers> getCustomers();
    public List<Inventory> getInventory();
    public List<Trips> getTrips();
    public List<Person> getPersons();
}
