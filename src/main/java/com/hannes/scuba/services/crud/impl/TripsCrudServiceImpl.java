/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services.crud.impl;


import com.hannes.scuba.domain.Trips;
import com.hannes.scuba.services.crud.TripsCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Hannes
 */
@Service("TripsCrudService")
@Transactional
public class TripsCrudServiceImpl implements TripsCrudService {

    @Override
    public Trips find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trips persist(Trips entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trips merge(Trips entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Trips entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trips> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
