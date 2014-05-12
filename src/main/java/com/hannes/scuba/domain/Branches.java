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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Hannes
 */
@Entity
public class Branches implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String branchName;
    
    @Embedded
    private Contacts contacts;
    
    @OneToOne
    private Address address;
    
    @OneToMany
    @JoinColumn(name="branches_id")
    private List<Inventory> inventory = new ArrayList<Inventory>();
    
    @OneToMany
    @JoinColumn(name="branches_id")
    private List<Person> person = new ArrayList<Person>();
    
    @OneToMany
    @JoinColumn(name="branches_id")
    private List<Trips> trips = new ArrayList<Trips>();
    
    @ManyToOne
    private Company company;
    
    private Branches(Builder builder) {
        id = builder.id;
        branchName = builder.branchName;
        contacts = builder.contacts;
        address = builder.address;
        inventory = builder.inventory;
        person = builder.person;
        trips = builder.trips;
        company = builder.company;
    }
    
    public Branches() {
        
    }

    public static class Builder {
        private Long id;
        private String branchName;
        private Contacts contacts;
        private Address address;
        private List<Inventory> inventory = new ArrayList<Inventory>();
        private List<Person> person = new ArrayList<Person>();
        private List<Trips> trips = new ArrayList<Trips>();
        private Company company;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder branchName(String value) {
            branchName = value;
            return this;
        }
        
        public Builder contacts(Contacts value) {
            contacts = value;
            return this;
        }
        
        public Builder Address(Address value) {
            address = value;
            return this;
        }
        
        public Builder inventory(List<Inventory> values) {
            inventory = values;
            return this;
        }
        
        public Builder person(List<Person> values) {
            person = values;
            return this;
        }
        
        public Builder trips(List<Trips> values) {
            trips = values;
            return this;
        }
        
        public Builder company(Company value) {
            company = value;
            return this;
        }
        
        public Builder branches(Branches branches) {
            id = branches.getId();
            branchName = branches.getBranchName();
            contacts = company.getContacts();
            address = branches.getAddress();
            inventory = branches.getInventory();
            person = branches.getPerson();
            trips = branches.getTrips();
            company = branches.getCompany();
            return this;
        }
        
        public Branches build() {
            return new Branches(this);
        }
        
    }

    public Address getAddress() {
        return address;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public List<Person> getPerson() {
        return person;
    }

    public List<Trips> getTrips() {
        return trips;
    }

    public Company getCompany() {
        return company;
    }
    
    public Long getId() {
        return id;
    }

    public String getBranchName() {
        return branchName;
    }
    
    public Contacts getContacts() {
        return contacts;
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
        if (!(object instanceof Branches)) {
            return false;
        }
        Branches other = (Branches) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Branches[ id=" + id + " ]";
    }
    
}
