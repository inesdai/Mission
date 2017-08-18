/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veganet.session;

import com.veganet.entities.ApplicationConfig;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ines
 */
@Stateless
public class ApplicationConfigFacade extends AbstractFacade<ApplicationConfig> {

    @PersistenceContext(unitName = "com.veganet_Mission_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplicationConfigFacade() {
        super(ApplicationConfig.class);
    }
    
}
