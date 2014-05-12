/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Hannes
 */
@Entity
public class Trips implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tripName;
    private String tripLocation;
    private boolean gearProvided;
    private double tripCost;
    private int peopleOnboard;
    
    @Embedded
    private TripDates tripDates;

    @OneToMany
    @JoinColumn(name="trips_id")
    private List<Customers> customers = new ArrayList<Customers>();
    
    @ManyToOne
    private Branches branches;
    
    private Trips(Builder builder) {
        id = builder.id;
        tripName = builder.tripName;
        tripLocation = builder.tripLocation;
        gearProvided = builder.gearProvided;
        tripCost = builder.tripCost;
        peopleOnboard = builder.peopleOnboard;
        tripDates = builder.tripDates;
        customers = builder.customers;
        branches = builder.branches; 
    }
    
    public Trips() {
        
    }
    
    private static class Builder {
        private Long id;
        private String tripName;
        private String tripLocation;
        private boolean gearProvided;
        private double tripCost;
        private int peopleOnboard;
        private TripDates tripDates;
        private List<Customers> customers = new ArrayList<Customers>();
        private Branches branches;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder tripName(String value) {
            tripName = value;
            return this;
        }
        
        public Builder tripLocation(String value) {
            tripLocation = value;
            return this;
        }
        
        public Builder gearProvider(boolean value) {
            gearProvided = value;
            return this;
        }
        
        public Builder tripCost(double value) {
            tripCost = value;
            return this;
        }
        
        public Builder peopleOnboard(int value) {
            peopleOnboard = value;
            return this; 
        }
        
        public Builder tripDates(TripDates value) {
            tripDates = value;
            return this;
        }
        
        public Builder customers(List<Customers> values) {
            customers = values;
            return this;
        }
        
        public Builder branches(Branches value) {
            branches = value;
            return this;
        }
        
        public Builder trips(Trips trips) {
            id = trips.getId();
            tripName = trips.getTripName();
            tripLocation = trips.getTripLocation();
            gearProvided = trips.isGearProvided();
            tripCost = trips.getTripCost();
            peopleOnboard = trips.getPeopleOnboard();
            tripDates = trips.getTripDates();
            customers = trips.getCustomers();
            branches = trips.getBranches();
            return this;
        }
        
        public Trips build() {
            return new Trips(this);
        }
    }

    public String getTripName() {
        return tripName;
    }

    public String getTripLocation() {
        return tripLocation;
    }

    public boolean isGearProvided() {
        return gearProvided;
    }

    public double getTripCost() {
        return tripCost;
    }

    public int getPeopleOnboard() {
        return peopleOnboard;
    }

    public TripDates getTripDates() {
        return tripDates;
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public Branches getBranches() {
        return branches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trips)) {
            return false;
        }
        Trips other = (Trips) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Trips[ id=" + id + " ]";
    }
    
}
