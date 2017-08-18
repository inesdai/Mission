/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veganet.session;

import com.veganet.entities.Responsable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ines
 */
@Stateless
public class ResponsableFacade extends AbstractFacade<Responsable> {

    @PersistenceContext(unitName = "com.veganet_Mission_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResponsableFacade() {
        super(Responsable.class);
    }
    
}
