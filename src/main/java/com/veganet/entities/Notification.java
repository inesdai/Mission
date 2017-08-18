/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veganet.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ines
 */
@Entity
@Table(name = "notification")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notification.findAll", query = "SELECT n FROM Notification n")
    , @NamedQuery(name = "Notification.findByNotifId", query = "SELECT n FROM Notification n WHERE n.notifId = :notifId")
    , @NamedQuery(name = "Notification.findByPersId", query = "SELECT n FROM Notification n WHERE n.persId = :persId")
    , @NamedQuery(name = "Notification.findByDescription", query = "SELECT n FROM Notification n WHERE n.description = :description")
    , @NamedQuery(name = "Notification.findByStatus", query = "SELECT n FROM Notification n WHERE n.status = :status")
    , @NamedQuery(name = "Notification.findByType", query = "SELECT n FROM Notification n WHERE n.type = :type")
    , @NamedQuery(name = "Notification.findByCreactionDate", query = "SELECT n FROM Notification n WHERE n.creactionDate = :creactionDate")})
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOTIF_ID")
    private Integer notifId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERS_ID")
    private int persId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creactionDate;
    @JoinColumn(name = "MISSION_ID", referencedColumnName = "MISSION_ID")
    @ManyToOne
    private Mission missionId;

    public Notification() {
    }

    public Notification(Integer notifId) {
        this.notifId = notifId;
    }

    public Notification(Integer notifId, int persId, String description, int status, String type, Date creactionDate) {
        this.notifId = notifId;
        this.persId = persId;
        this.description = description;
        this.status = status;
        this.type = type;
        this.creactionDate = creactionDate;
    }

    public Integer getNotifId() {
        return notifId;
    }

    public void setNotifId(Integer notifId) {
        this.notifId = notifId;
    }

    public int getPersId() {
        return persId;
    }

    public void setPersId(int persId) {
        this.persId = persId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreactionDate() {
        return creactionDate;
    }

    public void setCreactionDate(Date creactionDate) {
        this.creactionDate = creactionDate;
    }

    public Mission getMissionId() {
        return missionId;
    }

    public void setMissionId(Mission missionId) {
        this.missionId = missionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notifId != null ? notifId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notification)) {
            return false;
        }
        Notification other = (Notification) object;
        if ((this.notifId == null && other.notifId != null) || (this.notifId != null && !this.notifId.equals(other.notifId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.veganet.entities.Notification[ notifId=" + notifId + " ]";
    }
    
}
