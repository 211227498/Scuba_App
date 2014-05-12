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
public class Inventory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemName;
    private double itemCostP;
    private double itemSellP;
    private String itemWarranty;
    private int itemsInStock;
    
    @ManyToOne
    private Branches branches;
    
    private Inventory(Builder builder) {
        id = builder.id;
        itemName = builder.itemName;
        itemCostP = builder.itemCostP;
        itemSellP = builder.itemSellP;
        itemWarranty = builder.itemWarranty;
        itemsInStock = builder.itemsInStock;
        branches = builder.branches;
    }
    
    public Inventory() {
        
    }
    
    private static class Builder {
        private Long id;
        private String itemName;
        private double itemCostP;
        private double itemSellP;
        private String itemWarranty;
        private int itemsInStock;
        private Branches branches;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder itemName(String value) {
            itemName = value;
            return this;
        }
        
        public Builder itemCostP(double value) {
            itemCostP = value;
            return this;
        }
        
        public Builder itemSellP(double value) {
            itemSellP = value;
            return this;
        }
        
        public Builder itemWarranty(String value) {
            itemWarranty = value;
            return this;
        }
        
        public Builder itemsInStock(int value) {
            itemsInStock = value;
            return this;
        }
        
        public Builder branches(Branches value) {
            branches = value;
            return this;
        }
        
        public Builder inventory(Inventory inventory) {
            id = inventory.getId();
            itemName = inventory.getItemName();
            itemCostP = inventory.getItemCostP();
            itemSellP = inventory.getItemSellP();
            itemWarranty = inventory.getItemWarranty();
            itemsInStock = inventory.getItemsInStock();
            branches = inventory.getBranches();
            return this;
        }
        
        public Inventory build() {
            return new Inventory(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemCostP() {
        return itemCostP;
    }

    public double getItemSellP() {
        return itemSellP;
    }

    public String getItemWarranty() {
        return itemWarranty;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public Branches getBranches() {
        return branches;
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
        if (!(object instanceof Inventory)) {
            return false;
        }
        Inventory other = (Inventory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hannes.scuba.domain.Inventory[ id=" + id + " ]";
    }
    
}
