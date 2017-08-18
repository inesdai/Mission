package com.veganet.entities;

import com.veganet.entities.Mission;
import com.veganet.entities.Responsable;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-17T12:05:35")
@StaticMetamodel(Personne.class)
public class Personne_ { 

    public static volatile CollectionAttribute<Personne, Mission> missionCollection;
    public static volatile SingularAttribute<Personne, String> persAdresse;
    public static volatile SingularAttribute<Personne, String> ville;
    public static volatile CollectionAttribute<Personne, Responsable> responsableCollection;
    public static volatile SingularAttribute<Personne, Integer> postalCode;
    public static volatile SingularAttribute<Personne, String> cin;
    public static volatile SingularAttribute<Personne, Integer> persTel;
    public static volatile SingularAttribute<Personne, String> persEmail;
    public static volatile SingularAttribute<Personne, String> login;
    public static volatile CollectionAttribute<Personne, Responsable> responsableCollection1;
    public static volatile SingularAttribute<Personne, Integer> persId;
    public static volatile SingularAttribute<Personne, String> password;
    public static volatile SingularAttribute<Personne, Short> isdelated;
    public static volatile SingularAttribute<Personne, String> persName;
    public static volatile SingularAttribute<Personne, String> persFirstName;

}