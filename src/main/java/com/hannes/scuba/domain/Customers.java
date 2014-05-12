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
import javax.persistence.ManyToOne;

/**
 *
 * @author Hannes
 */
@Entity
public class Customers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean custCard;
    private boolean ownsGear;
    private String divePartner;
    
    @ManyToOne
    @JoinColumn(name="customers_id")
    private Trips trip;
    
    @Embedded
    private CustomerPersonal customerPersonal;
    
    private Customers(Builder builder) {
        id = builder.id;
        custCard = builder.custCard;
        ownsGear = builder.ownsGear;
        divePartner = builder.divePartner;
        trip = builder.trip;
        customerPersonal = builder.customerPersonal;
    }
    
    public Customers() {
        
    }
    
    private static class Builder {
        private Long id;
        private boolean custCard;
        private boolean ownsGear;
        private String divePartner;
        private Trips trip;
        private CustomerPersonal customerPersonal;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder custCard(boolean value) {
            custCard = value;
            return this;
        }
        
        public Builder ownsGear(boolean value) {
            ownsGear = value;
            return this;
        }
        
        public Builder divePartner(String value) {
            divePartner = value;
            return this;
        }
        
        public Builder trips(Trips value) {
            trip = value;
            return this;
        }
        
        public Builder customerPersonal(CustomerPersonal value) {
            customerPersonal = value;
            return this;
        }
        
        public Builder customers(Customers customers) {
            id = customers.getId();
            custCard = customers.isCustCard();
            ownsGear = customers.isOwnsGear();
            divePartner = customers.getDivePartner();
            trip = customers.getTrip();
            customerPersonal = customers.getCustomerPersonal();
            return this;
        }
        
        public Customers build() {
            return new Customers(this);
        }
    }

    public boolean isCustCard() {
        return custCard;
    }

    public boolean isOwnsGear() {
        return ownsGear;
    }

    public String getDivePartner() {
        return divePartner;
    }

    public Trips getTrip() {
        return trip;
    }

    public CustomerPersonal getCustomerPersonal() {
        return customerPersonal;
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
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Customers[ id=" + id + " ]";
    }
    
}
