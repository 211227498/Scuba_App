/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services.impl;

import com.hannes.scuba.domain.Inventory;
import com.hannes.scuba.services.FindInventoryService;
import com.hannes.scuba.services.crud.InventoryCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hannes
 */
@Service("FindInventoryService")
public class FindInventoryServiceImpl implements FindInventoryService {
    @Autowired
    private InventoryCrudService inventoryCrudService;
    
    @Override
    public List<Inventory> getInventory() {
        return inventoryCrudService.findAll();
    }
    
}
