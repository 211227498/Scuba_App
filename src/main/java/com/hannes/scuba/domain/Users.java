/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Hannes
 */
@Entity
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String passWord;
    private boolean enabled;

    @OneToMany
    @JoinColumn(name="users_id")
    private List<Roles> roles;
    
    private Users(Builder builder) {
        id = builder.id;
        userName = builder.userName;
        passWord = builder.passWord;
        enabled = builder.enabled;
        roles = builder.roles;
    }
    
    public Users() {
        
    }
    
    private static class Builder {
        private Long id;
        private String userName;
        private String passWord;
        private boolean enabled;
        private List<Roles> roles;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder userName(String value) {
            userName = value;
            return this;
        }
        
        public Builder passWord(String value) {
            passWord = value;
            return this;
        }
        
        public Builder enabled(boolean value) {
            enabled = value;
            return this;
        }
        
        public Builder roles(List<Roles> values) {
            roles = values;
            return this;
        }
        
        public Builder users(Users users) {
            id = users.getId();
            userName = users.getUserName();
            passWord = users.getPassWord();
            enabled = users.isEnabled();
            roles = users.getRoles();
            return this;
        }
        
        public Users build() {
            return new Users(this);
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<Roles> getRoles() {
        return roles;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Users[ id=" + id + " ]";
    }
    
}
