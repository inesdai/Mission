package com.veganet.entities;

import com.veganet.entities.Notification;
import com.veganet.entities.Personne;
import com.veganet.entities.Vehicle;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-17T12:05:35")
@StaticMetamodel(Mission.class)
public class Mission_ { 

    public static volatile SingularAttribute<Mission, String> note;
    public static volatile CollectionAttribute<Mission, Notification> notificationCollection;
    public static volatile SingularAttribute<Mission, Integer> amountGs;
    public static volatile SingularAttribute<Mission, Vehicle> vehiculeId;
    public static volatile SingularAttribute<Mission, String> accompaying;
    public static volatile SingularAttribute<Mission, Date> endDate;
    public static volatile SingularAttribute<Mission, Integer> amountPg;
    public static volatile SingularAttribute<Mission, Date> validationDate;
    public static volatile SingularAttribute<Mission, String> path;
    public static volatile SingularAttribute<Mission, Integer> kmCourseGs;
    public static volatile SingularAttribute<Mission, Personne> persId;
    public static volatile SingularAttribute<Mission, Short> arrangment;
    public static volatile SingularAttribute<Mission, Short> numberOfTickets;
    public static volatile SingularAttribute<Mission, Short> reimbursement;
    public static volatile SingularAttribute<Mission, Integer> missionId;
    public static volatile SingularAttribute<Mission, Integer> amountParking;
    public static volatile SingularAttribute<Mission, Short> numberOfNights;
    public static volatile SingularAttribute<Mission, Date> creationDate;
    public static volatile SingularAttribute<Mission, Integer> totalAmount;
    public static volatile SingularAttribute<Mission, Integer> amountMeal;
    public static volatile SingularAttribute<Mission, Float> quantityGs;
    public static volatile SingularAttribute<Mission, Integer> amountHybergment;
    public static volatile SingularAttribute<Mission, Integer> globalM;
    public static volatile SingularAttribute<Mission, Date> startDate;
    public static volatile SingularAttribute<Mission, String> object;
    public static volatile SingularAttribute<Mission, Short> status;

}