/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services;

import com.hannes.scuba.domain.Inventory;
import java.util.List;

/**
 *
 * @author Hannes
 */
public interface FindInventoryService {
    public List<Inventory> getInventory();
}
