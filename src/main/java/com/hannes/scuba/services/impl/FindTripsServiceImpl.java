/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services.impl;

import com.hannes.scuba.domain.Trips;
import com.hannes.scuba.services.FindTripsService;
import com.hannes.scuba.services.crud.TripsCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hannes
 */
@Service("FindTripsService")
public class FindTripsServiceImpl implements FindTripsService {
    @Autowired
    private TripsCrudService tripsCrudService;
    
    @Override
    public List<Trips> getTrips() {
        return tripsCrudService.findAll();
    }
    
}
