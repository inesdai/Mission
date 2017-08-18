/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veganet.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ines
 */
@Entity
@Table(name = "personne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p")
    , @NamedQuery(name = "Personne.findByPersId", query = "SELECT p FROM Personne p WHERE p.persId = :persId")
    , @NamedQuery(name = "Personne.findByCin", query = "SELECT p FROM Personne p WHERE p.cin = :cin")
    , @NamedQuery(name = "Personne.findByPersName", query = "SELECT p FROM Personne p WHERE p.persName = :persName")
    , @NamedQuery(name = "Personne.findByPersFirstName", query = "SELECT p FROM Personne p WHERE p.persFirstName = :persFirstName")
    , @NamedQuery(name = "Personne.findByVille", query = "SELECT p FROM Personne p WHERE p.ville = :ville")
    , @NamedQuery(name = "Personne.findByPersAdresse", query = "SELECT p FROM Personne p WHERE p.persAdresse = :persAdresse")
    , @NamedQuery(name = "Personne.findByPersTel", query = "SELECT p FROM Personne p WHERE p.persTel = :persTel")
    , @NamedQuery(name = "Personne.findByPersEmail", query = "SELECT p FROM Personne p WHERE p.persEmail = :persEmail")
    , @NamedQuery(name = "Personne.findByPostalCode", query = "SELECT p FROM Personne p WHERE p.postalCode = :postalCode")
    , @NamedQuery(name = "Personne.findByLogin", query = "SELECT p FROM Personne p WHERE p.login = :login")
    , @NamedQuery(name = "Personne.findByPassword", query = "SELECT p FROM Personne p WHERE p.password = :password")
    , @NamedQuery(name = "Personne.findByIsdelated", query = "SELECT p FROM Personne p WHERE p.isdelated = :isdelated")})
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERS_ID")
    private Integer persId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CIN")
    private String cin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PERS_NAME")
    private String persName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PERS_FIRST_NAME")
    private String persFirstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "VILLE")
    private String ville;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PERS_ADRESSE")
    private String persAdresse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERS_TEL")
    private int persTel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PERS_EMAIL")
    private String persEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POSTAL_CODE")
    private int postalCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ISDELATED")
    private short isdelated;
    @OneToMany(mappedBy = "persId")
    private Collection<Mission> missionCollection;
    @OneToMany(mappedBy = "resPersId")
    private Collection<Responsable> responsableCollection;
    @OneToMany(mappedBy = "persId")
    private Collection<Responsable> responsableCollection1;

    public Personne() {
    }

    public Personne(Integer persId) {
        this.persId = persId;
    }

    public Personne(Integer persId, String cin, String persName, String persFirstName, String ville, String persAdresse, int persTel, String persEmail, int postalCode, String login, String password, short isdelated) {
        this.persId = persId;
        this.cin = cin;
        this.persName = persName;
        this.persFirstName = persFirstName;
        this.ville = ville;
        this.persAdresse = persAdresse;
        this.persTel = persTel;
        this.persEmail = persEmail;
        this.postalCode = postalCode;
        this.login = login;
        this.password = password;
        this.isdelated = isdelated;
    }

    public Integer getPersId() {
        return persId;
    }

    public void setPersId(Integer persId) {
        this.persId = persId;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPersName() {
        return persName;
    }

    public void setPersName(String persName) {
        this.persName = persName;
    }

    public String getPersFirstName() {
        return persFirstName;
    }

    public void setPersFirstName(String persFirstName) {
        this.persFirstName = persFirstName;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPersAdresse() {
        return persAdresse;
    }

    public void setPersAdresse(String persAdresse) {
        this.persAdresse = persAdresse;
    }

    public int getPersTel() {
        return persTel;
    }

    public void setPersTel(int persTel) {
        this.persTel = persTel;
    }

    public String getPersEmail() {
        return persEmail;
    }

    public void setPersEmail(String persEmail) {
        this.persEmail = persEmail;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getIsdelated() {
        return isdelated;
    }

    public void setIsdelated(short isdelated) {
        this.isdelated = isdelated;
    }

    @XmlTransient
    public Collection<Mission> getMissionCollection() {
        return missionCollection;
    }

    public void setMissionCollection(Collection<Mission> missionCollection) {
        this.missionCollection = missionCollection;
    }

    @XmlTransient
    public Collection<Responsable> getResponsableCollection() {
        return responsableCollection;
    }

    public void setResponsableCollection(Collection<Responsable> responsableCollection) {
        this.responsableCollection = responsableCollection;
    }

    @XmlTransient
    public Collection<Responsable> getResponsableCollection1() {
        return responsableCollection1;
    }

    public void setResponsableCollection1(Collection<Responsable> responsableCollection1) {
        this.responsableCollection1 = responsableCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (persId != null ? persId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.persId == null && other.persId != null) || (this.persId != null && !this.persId.equals(other.persId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.veganet.entities.Personne[ persId=" + persId + " ]";
    }
    
}
