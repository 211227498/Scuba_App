/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services.crud.impl;

import com.hannes.scuba.domain.Customers;
import com.hannes.scuba.services.crud.CustomersCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Hannes
 */
@Service("CustomersCrudService")
@Transactional
public class CustomersCrudServiceImpl implements CustomersCrudService {

    @Override
    public Customers find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customers persist(Customers entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customers merge(Customers entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Customers entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customers> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
