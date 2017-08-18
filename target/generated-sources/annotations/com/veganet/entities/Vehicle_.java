package com.veganet.entities;

import com.veganet.entities.Mission;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-17T12:05:35")
@StaticMetamodel(Vehicle.class)
public class Vehicle_ { 

    public static volatile SingularAttribute<Vehicle, String> insurancePhone;
    public static volatile SingularAttribute<Vehicle, Integer> periodOilchange;
    public static volatile SingularAttribute<Vehicle, String> note;
    public static volatile SingularAttribute<Vehicle, Integer> vehiculeId;
    public static volatile SingularAttribute<Vehicle, String> color;
    public static volatile SingularAttribute<Vehicle, Short> isactive;
    public static volatile SingularAttribute<Vehicle, Short> icon;
    public static volatile SingularAttribute<Vehicle, String> typefuel;
    public static volatile SingularAttribute<Vehicle, String> description;
    public static volatile SingularAttribute<Vehicle, Integer> rememberBeforeoil;
    public static volatile SingularAttribute<Vehicle, Date> lastplaybackdelete;
    public static volatile SingularAttribute<Vehicle, Integer> rememberBeforetechnical;
    public static volatile SingularAttribute<Vehicle, String> model;
    public static volatile SingularAttribute<Vehicle, Float> lastOilChange;
    public static volatile SingularAttribute<Vehicle, Integer> durationPlayback;
    public static volatile SingularAttribute<Vehicle, Date> createDate;
    public static volatile CollectionAttribute<Vehicle, Mission> missionCollection;
    public static volatile SingularAttribute<Vehicle, Short> technicalInspectionperiod;
    public static volatile SingularAttribute<Vehicle, Float> startkm;
    public static volatile SingularAttribute<Vehicle, Integer> periodAssurance;
    public static volatile SingularAttribute<Vehicle, Date> technicalInspectiondate;
    public static volatile SingularAttribute<Vehicle, Integer> registrationNumber;
    public static volatile SingularAttribute<Vehicle, Date> dateAssurance;
    public static volatile SingularAttribute<Vehicle, String> problemsVehicle;
    public static volatile SingularAttribute<Vehicle, Float> fuelconsumption;
    public static volatile SingularAttribute<Vehicle, String> category;
    public static volatile SingularAttribute<Vehicle, String> mark;

}