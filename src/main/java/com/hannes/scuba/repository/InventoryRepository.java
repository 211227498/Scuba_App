/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.repository;

import com.hannes.scuba.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hannes
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    
}
