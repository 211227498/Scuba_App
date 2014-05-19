/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services;

import com.hannes.scuba.domain.Trips;
import java.util.List;

/**
 *
 * @author Hannes
 */
public interface FindTripsService {
    public List<Trips> getTrips();
}
