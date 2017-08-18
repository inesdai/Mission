/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veganet.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ines
 */
@Entity
@Table(name = "vehicle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
    , @NamedQuery(name = "Vehicle.findByVehiculeId", query = "SELECT v FROM Vehicle v WHERE v.vehiculeId = :vehiculeId")
    , @NamedQuery(name = "Vehicle.findByMark", query = "SELECT v FROM Vehicle v WHERE v.mark = :mark")
    , @NamedQuery(name = "Vehicle.findByCreateDate", query = "SELECT v FROM Vehicle v WHERE v.createDate = :createDate")
    , @NamedQuery(name = "Vehicle.findByDateAssurance", query = "SELECT v FROM Vehicle v WHERE v.dateAssurance = :dateAssurance")
    , @NamedQuery(name = "Vehicle.findByDescription", query = "SELECT v FROM Vehicle v WHERE v.description = :description")
    , @NamedQuery(name = "Vehicle.findByFuelconsumption", query = "SELECT v FROM Vehicle v WHERE v.fuelconsumption = :fuelconsumption")
    , @NamedQuery(name = "Vehicle.findByIcon", query = "SELECT v FROM Vehicle v WHERE v.icon = :icon")
    , @NamedQuery(name = "Vehicle.findByInsurancePhone", query = "SELECT v FROM Vehicle v WHERE v.insurancePhone = :insurancePhone")
    , @NamedQuery(name = "Vehicle.findByIsactive", query = "SELECT v FROM Vehicle v WHERE v.isactive = :isactive")
    , @NamedQuery(name = "Vehicle.findByLastOilChange", query = "SELECT v FROM Vehicle v WHERE v.lastOilChange = :lastOilChange")
    , @NamedQuery(name = "Vehicle.findByRememberBeforeoil", query = "SELECT v FROM Vehicle v WHERE v.rememberBeforeoil = :rememberBeforeoil")
    , @NamedQuery(name = "Vehicle.findByLastplaybackdelete", query = "SELECT v FROM Vehicle v WHERE v.lastplaybackdelete = :lastplaybackdelete")
    , @NamedQuery(name = "Vehicle.findByModel", query = "SELECT v FROM Vehicle v WHERE v.model = :model")
    , @NamedQuery(name = "Vehicle.findByPeriodAssurance", query = "SELECT v FROM Vehicle v WHERE v.periodAssurance = :periodAssurance")
    , @NamedQuery(name = "Vehicle.findByPeriodOilchange", query = "SELECT v FROM Vehicle v WHERE v.periodOilchange = :periodOilchange")
    , @NamedQuery(name = "Vehicle.findByProblemsVehicle", query = "SELECT v FROM Vehicle v WHERE v.problemsVehicle = :problemsVehicle")
    , @NamedQuery(name = "Vehicle.findByStartkm", query = "SELECT v FROM Vehicle v WHERE v.startkm = :startkm")
    , @NamedQuery(name = "Vehicle.findByTypefuel", query = "SELECT v FROM Vehicle v WHERE v.typefuel = :typefuel")
    , @NamedQuery(name = "Vehicle.findByTechnicalInspectiondate", query = "SELECT v FROM Vehicle v WHERE v.technicalInspectiondate = :technicalInspectiondate")
    , @NamedQuery(name = "Vehicle.findByTechnicalInspectionperiod", query = "SELECT v FROM Vehicle v WHERE v.technicalInspectionperiod = :technicalInspectionperiod")
    , @NamedQuery(name = "Vehicle.findByRememberBeforetechnical", query = "SELECT v FROM Vehicle v WHERE v.rememberBeforetechnical = :rememberBeforetechnical")
    , @NamedQuery(name = "Vehicle.findByDurationPlayback", query = "SELECT v FROM Vehicle v WHERE v.durationPlayback = :durationPlayback")
    , @NamedQuery(name = "Vehicle.findByRegistrationNumber", query = "SELECT v FROM Vehicle v WHERE v.registrationNumber = :registrationNumber")
    , @NamedQuery(name = "Vehicle.findByCategory", query = "SELECT v FROM Vehicle v WHERE v.category = :category")
    , @NamedQuery(name = "Vehicle.findByColor", query = "SELECT v FROM Vehicle v WHERE v.color = :color")
    , @NamedQuery(name = "Vehicle.findByNote", query = "SELECT v FROM Vehicle v WHERE v.note = :note")})
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VEHICULE_ID")
    private Integer vehiculeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MARK")
    private String mark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_ASSURANCE")
    @Temporal(TemporalType.DATE)
    private Date dateAssurance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUELCONSUMPTION")
    private float fuelconsumption;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ICON")
    private short icon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "INSURANCE_PHONE")
    private String insurancePhone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ISACTIVE")
    private short isactive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LAST_OIL_CHANGE")
    private float lastOilChange;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REMEMBER_BEFOREOIL")
    private int rememberBeforeoil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LASTPLAYBACKDELETE")
    @Temporal(TemporalType.DATE)
    private Date lastplaybackdelete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MODEL")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERIOD_ASSURANCE")
    private int periodAssurance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERIOD_OILCHANGE")
    private int periodOilchange;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PROBLEMS_VEHICLE")
    private String problemsVehicle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STARTKM")
    private float startkm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "TYPEFUEL")
    private String typefuel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TECHNICAL_INSPECTIONDATE")
    @Temporal(TemporalType.DATE)
    private Date technicalInspectiondate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TECHNICAL_INSPECTIONPERIOD")
    private short technicalInspectionperiod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REMEMBER_BEFORETECHNICAL")
    private int rememberBeforetechnical;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DURATION_PLAYBACK")
    private int durationPlayback;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGISTRATION_NUMBER__")
    private int registrationNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COLOR")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NOTE")
    private String note;
    @OneToMany(mappedBy = "vehiculeId")
    private Collection<Mission> missionCollection;

    public Vehicle() {
    }

    public Vehicle(Integer vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    public Vehicle(Integer vehiculeId, String mark, Date createDate, Date dateAssurance, String description, float fuelconsumption, short icon, String insurancePhone, short isactive, float lastOilChange, int rememberBeforeoil, Date lastplaybackdelete, String model, int periodAssurance, int periodOilchange, String problemsVehicle, float startkm, String typefuel, Date technicalInspectiondate, short technicalInspectionperiod, int rememberBeforetechnical, int durationPlayback, int registrationNumber, String category, String color, String note) {
        this.vehiculeId = vehiculeId;
        this.mark = mark;
        this.createDate = createDate;
        this.dateAssurance = dateAssurance;
        this.description = description;
        this.fuelconsumption = fuelconsumption;
        this.icon = icon;
        this.insurancePhone = insurancePhone;
        this.isactive = isactive;
        this.lastOilChange = lastOilChange;
        this.rememberBeforeoil = rememberBeforeoil;
        this.lastplaybackdelete = lastplaybackdelete;
        this.model = model;
        this.periodAssurance = periodAssurance;
        this.periodOilchange = periodOilchange;
        this.problemsVehicle = problemsVehicle;
        this.startkm = startkm;
        this.typefuel = typefuel;
        this.technicalInspectiondate = technicalInspectiondate;
        this.technicalInspectionperiod = technicalInspectionperiod;
        this.rememberBeforetechnical = rememberBeforetechnical;
        this.durationPlayback = durationPlayback;
        this.registrationNumber = registrationNumber;
        this.category = category;
        this.color = color;
        this.note = note;
    }

    public Integer getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(Integer vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDateAssurance() {
        return dateAssurance;
    }

    public void setDateAssurance(Date dateAssurance) {
        this.dateAssurance = dateAssurance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(float fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public short getIcon() {
        return icon;
    }

    public void setIcon(short icon) {
        this.icon = icon;
    }

    public String getInsurancePhone() {
        return insurancePhone;
    }

    public void setInsurancePhone(String insurancePhone) {
        this.insurancePhone = insurancePhone;
    }

    public short getIsactive() {
        return isactive;
    }

    public void setIsactive(short isactive) {
        this.isactive = isactive;
    }

    public float getLastOilChange() {
        return lastOilChange;
    }

    public void setLastOilChange(float lastOilChange) {
        this.lastOilChange = lastOilChange;
    }

    public int getRememberBeforeoil() {
        return rememberBeforeoil;
    }

    public void setRememberBeforeoil(int rememberBeforeoil) {
        this.rememberBeforeoil = rememberBeforeoil;
    }

    public Date getLastplaybackdelete() {
        return lastplaybackdelete;
    }

    public void setLastplaybackdelete(Date lastplaybackdelete) {
        this.lastplaybackdelete = lastplaybackdelete;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPeriodAssurance() {
        return periodAssurance;
    }

    public void setPeriodAssurance(int periodAssurance) {
        this.periodAssurance = periodAssurance;
    }

    public int getPeriodOilchange() {
        return periodOilchange;
    }

    public void setPeriodOilchange(int periodOilchange) {
        this.periodOilchange = periodOilchange;
    }

    public String getProblemsVehicle() {
        return problemsVehicle;
    }

    public void setProblemsVehicle(String problemsVehicle) {
        this.problemsVehicle = problemsVehicle;
    }

    public float getStartkm() {
        return startkm;
    }

    public void setStartkm(float startkm) {
        this.startkm = startkm;
    }

    public String getTypefuel() {
        return typefuel;
    }

    public void setTypefuel(String typefuel) {
        this.typefuel = typefuel;
    }

    public Date getTechnicalInspectiondate() {
        return technicalInspectiondate;
    }

    public void setTechnicalInspectiondate(Date technicalInspectiondate) {
        this.technicalInspectiondate = technicalInspectiondate;
    }

    public short getTechnicalInspectionperiod() {
        return technicalInspectionperiod;
    }

    public void setTechnicalInspectionperiod(short technicalInspectionperiod) {
        this.technicalInspectionperiod = technicalInspectionperiod;
    }

    public int getRememberBeforetechnical() {
        return rememberBeforetechnical;
    }

    public void setRememberBeforetechnical(int rememberBeforetechnical) {
        this.rememberBeforetechnical = rememberBeforetechnical;
    }

    public int getDurationPlayback() {
        return durationPlayback;
    }

    public void setDurationPlayback(int durationPlayback) {
        this.durationPlayback = durationPlayback;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlTransient
    public Collection<Mission> getMissionCollection() {
        return missionCollection;
    }

    public void setMissionCollection(Collection<Mission> missionCollection) {
        this.missionCollection = missionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehiculeId != null ? vehiculeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.vehiculeId == null && other.vehiculeId != null) || (this.vehiculeId != null && !this.vehiculeId.equals(other.vehiculeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.veganet.entities.Vehicle[ vehiculeId=" + vehiculeId + " ]";
    }
    
}
