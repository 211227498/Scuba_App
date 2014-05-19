/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services;

import com.hannes.scuba.domain.Branches;
import java.util.List;

/**
 *
 * @author Hannes
 */
public interface FindBranchesService {
    public List<Branches> getBranches();
}
