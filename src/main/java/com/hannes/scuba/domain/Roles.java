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
import javax.persistence.ManyToOne;

/**
 *
 * @author Hannes
 */
@Entity
public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String roleName;
    private String description;
    private String userName;
    
    @ManyToOne
    private Users users;
    
    private Roles(Builder builder) {
        id = builder.id;
        roleName = builder.roleName;
        description = builder.description;
        userName = builder.userName;
        users = builder.users;
    }
    
    public Roles() {
        
    }
    
    private static class Builder {
        private Long id;
        private String roleName;
        private String description;
        private String userName;
        private Users users;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder roleName(String value) {
            roleName = value;
            return this;
        }
        
        public Builder description(String value) {
            description = value;
            return this;
        }
        
        public Builder userName(String value) {
            userName = value;
            return this;
        }
        
        public Builder users(Users value) {
            users = value;
            return this;
        }
        
        public Builder rolse(Roles roles) {
            id = roles.getId();
            roleName = roles.getRoleName();
            description = roles.getDescription();
            userName = roles.getUserName();
            users = roles.getUsers();
            return this;
        }
        
        public Roles build() {
            return new Roles(this);
        }
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    public String getUserName() {
        return userName;
    }

    public Users getUsers() {
        return users;
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
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Roles[ id=" + id + " ]";
    }
    
}
