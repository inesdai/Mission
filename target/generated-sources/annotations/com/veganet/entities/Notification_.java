package com.veganet.entities;

import com.veganet.entities.Mission;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-17T12:05:35")
@StaticMetamodel(Notification.class)
public class Notification_ { 

    public static volatile SingularAttribute<Notification, Integer> notifId;
    public static volatile SingularAttribute<Notification, Date> creactionDate;
    public static volatile SingularAttribute<Notification, Integer> persId;
    public static volatile SingularAttribute<Notification, Mission> missionId;
    public static volatile SingularAttribute<Notification, String> description;
    public static volatile SingularAttribute<Notification, String> type;
    public static volatile SingularAttribute<Notification, Integer> status;

}