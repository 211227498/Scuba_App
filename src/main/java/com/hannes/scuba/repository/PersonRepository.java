/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.repository;

import com.hannes.scuba.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hannes
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
