/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veganet.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ines
 */
@Entity
@Table(name = "responsable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsable.findAll", query = "SELECT r FROM Responsable r")
    , @NamedQuery(name = "Responsable.findByRes1Id", query = "SELECT r FROM Responsable r WHERE r.res1Id = :res1Id")
    , @NamedQuery(name = "Responsable.findByRes2Id", query = "SELECT r FROM Responsable r WHERE r.res2Id = :res2Id")
    , @NamedQuery(name = "Responsable.findByOrdre", query = "SELECT r FROM Responsable r WHERE r.ordre = :ordre")})
public class Responsable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RES1_ID")
    private Integer res1Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RES2_ID")
    private int res2Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDRE")
    private int ordre;
    @JoinColumn(name = "RES_PERS_ID", referencedColumnName = "PERS_ID")
    @ManyToOne
    private Personne resPersId;
    @JoinColumn(name = "PERS_ID", referencedColumnName = "PERS_ID")
    @ManyToOne
    private Personne persId;

    public Responsable() {
    }

    public Responsable(Integer res1Id) {
        this.res1Id = res1Id;
    }

    public Responsable(Integer res1Id, int res2Id, int ordre) {
        this.res1Id = res1Id;
        this.res2Id = res2Id;
        this.ordre = ordre;
    }

    public Integer getRes1Id() {
        return res1Id;
    }

    public void setRes1Id(Integer res1Id) {
        this.res1Id = res1Id;
    }

    public int getRes2Id() {
        return res2Id;
    }

    public void setRes2Id(int res2Id) {
        this.res2Id = res2Id;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public Personne getResPersId() {
        return resPersId;
    }

    public void setResPersId(Personne resPersId) {
        this.resPersId = resPersId;
    }

    public Personne getPersId() {
        return persId;
    }

    public void setPersId(Personne persId) {
        this.persId = persId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (res1Id != null ? res1Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsable)) {
            return false;
        }
        Responsable other = (Responsable) object;
        if ((this.res1Id == null && other.res1Id != null) || (this.res1Id != null && !this.res1Id.equals(other.res1Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.veganet.entities.Responsable[ res1Id=" + res1Id + " ]";
    }
    
}
