/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;

/**
 *
 * @author Hannes
 */
@Entity
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfBirth;
    private String middleName;
    private String gender;
    
    @Embedded
    private Contacts contacts;
    
    @OneToOne
    private Users user = new Users();
    
    @OneToMany
    @JoinColumn(name="person_id")
    private List<Address> address;
    
    @ManyToOne
    private Branches branches;
    
    private Person(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        dateOfBirth = builder.dateOfBirth;
        middleName = builder.middleName;
        gender = builder.gender;
        contacts = builder.contacts;
        user = builder.user;
        address = builder.address;
        branches = builder.branches;
    }
    
    public Person() {
        
    }
    
    private static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private Date dateOfBirth;
        private String middleName;
        private String gender;
        private Contacts contacts;
        private Users user = new Users();
        private List<Address> address;
        private Branches branches;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder firstName(String value) {
            firstName = value;
            return this;
        }
        
        public Builder lastName(String value) {
            lastName = value;
            return this;
        }
        
        public Builder dateOfBirth(Date value) {
            dateOfBirth = value;
            return this;
        }
        
        public Builder middleName(String value) {
            middleName = value;
            return this;
        }
        
        public Builder gender(String value) {
            gender = value;
            return this;
        }
        
        public Builder contacts(Contacts value) {
            contacts = value;
            return this;
        }
        
        public Builder users(Users value) {
            user = value;
            return this;
        }
        
        public Builder address(List<Address> values) {
            address = values;
            return this;
        }
        
        public Builder branches(Branches value) {
            branches = value;
            return this;
        }
        
        public Builder person(Person person) {
            id = person.getId();
            firstName = person.getFirstName();
            lastName = person.getLastName();
            dateOfBirth = person.getDateOfBirth();
            middleName = person.getMiddleName();
            gender = person.getGender();
            contacts = person.getContacts();
            user = person.getUser();
            address = person.getAddress();
            branches = person.getBranches();
            return this;
        }
        
        public Person build() {
            return new Person(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGender() {
        return gender;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public Users getUser() {
        return user;
    }

    public List<Address> getAddress() {
        return address;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Person[ id=" + id + " ]";
    }
    
}
