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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ines
 */
@Entity
@Table(name = "application_config")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApplicationConfig.findAll", query = "SELECT a FROM ApplicationConfig a")
    , @NamedQuery(name = "ApplicationConfig.findByAppId", query = "SELECT a FROM ApplicationConfig a WHERE a.appId = :appId")
    , @NamedQuery(name = "ApplicationConfig.findByAppName", query = "SELECT a FROM ApplicationConfig a WHERE a.appName = :appName")
    , @NamedQuery(name = "ApplicationConfig.findByAppValue", query = "SELECT a FROM ApplicationConfig a WHERE a.appValue = :appValue")})
public class ApplicationConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "APP_ID")
    private Integer appId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "APP_NAME")
    private String appName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "APP_VALUE")
    private int appValue;

    public ApplicationConfig() {
    }

    public ApplicationConfig(Integer appId) {
        this.appId = appId;
    }

    public ApplicationConfig(Integer appId, String appName, int appValue) {
        this.appId = appId;
        this.appName = appName;
        this.appValue = appValue;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppValue() {
        return appValue;
    }

    public void setAppValue(int appValue) {
        this.appValue = appValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appId != null ? appId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApplicationConfig)) {
            return false;
        }
        ApplicationConfig other = (ApplicationConfig) object;
        if ((this.appId == null && other.appId != null) || (this.appId != null && !this.appId.equals(other.appId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.veganet.entities.ApplicationConfig[ appId=" + appId + " ]";
    }
    
}
