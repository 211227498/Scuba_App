/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services.impl;

import com.hannes.scuba.domain.Branches;
import com.hannes.scuba.services.FindBranchesService;
import com.hannes.scuba.services.crud.BranchesCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hannes
 */
@Service("FindBranchesService")
public class FindBranchesServiceImpl implements FindBranchesService{
    @Autowired
    private BranchesCrudService branchesCrudService;
    
    @Override
    public List<Branches> getBranches() {
        return branchesCrudService.findAll();
    }
    
}
