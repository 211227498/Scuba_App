/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Hannes
 */
@Entity
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String compName;
    
    @Embedded
    private Contacts contacts;
    
    @OneToOne
    private Address address;
    
    @OneToMany(cascade= CascadeType.ALL, orphanRemoval=true)
    @JoinColumn(name="company_id")
    private List<Branches> branches = new ArrayList<Branches>();

    private Company(Builder builder) {
        id = builder.id;
        compName = builder.compName;
        contacts = builder.contacts;
        address = builder.address;
        branches = builder.branches;
    }
    
    public Company() {
        
    }
    
    public static class Builder {
        private Long id;
        private String compName;
        private Contacts contacts;
        private Address address;
        private List<Branches> branches = new ArrayList<Branches>();
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder compName(String value) {
            compName = value;
            return this;
        }
        
        public Builder contacts(Contacts value) {
            contacts = value;
            return this;
        }
        
        public Builder address(Address value) {
            address = value;
            return this;
        }
        
        public Builder branches(List<Branches> values) {
            branches = values;
            return this;
        }
        
        public Builder company(Company company) {
            id = company.getId();
            compName = company.getCompName();
            contacts = company.getContacts();
            address = company.getAddress();
            branches = company.getBranches();
            return this;
        }
        
        public Company  build() {
            return new Company(this);
        }
    }
    
    public String getCompName() {
        return compName;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public Address getAddress() {
        return address;
    }

    public List<Branches> getBranches() {
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
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Company[ id=" + id + " ]";
    }
    
}
