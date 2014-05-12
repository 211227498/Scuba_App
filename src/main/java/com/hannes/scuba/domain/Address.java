/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Hannes
 */
@Entity
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String postalAddress;
    private String physicalAddress;
    private String postalCode;
    
    private Address(Builder builder) {
        id = builder.id;
        postalAddress = builder.postalAddress;
        physicalAddress = builder.physicalAddress;
        postalCode = builder.postalCode;
    }

    public Address() {
    }
    
    public static class Builder{
        private Long id;
        private String postalAddress;
        private String physicalAddress;
        private String postalCode;
        
        public Builder postalAddress(String value) {
            postalCode = value;
            return this;
        }
        
        public Builder physicalAddress(String value) {
            physicalAddress = value;
            return this;
        }
        
        public Builder postalCode(String value) {
            postalCode = value;
            return this;
        }
        
        public Builder id(Long value){
            id = value;
            return this;
        }
        
        public Builder address(Address address) {
            id = address.getId();
            postalAddress = address.getPostalAddress();
            physicalAddress = address.getPhysicalAddress();
            postalCode = address.getPostalCode();
            return this;
        }
        
        public Address build(){
            return new Address(this);
        }
    
        
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Long getId() {
        return id;
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
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Address[ id=" + id + " ]";
    }
    
}
