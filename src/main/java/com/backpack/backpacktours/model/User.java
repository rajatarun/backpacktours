package com.backpack.backpacktours.model;



import org.hibernate.boot.model.relational.Namespace;


import javax.persistence.*;

@Entity
@Table(name = "USER_INFO")
public class User {
    public User( String USERID, String NAME,String DOB, String PASSWORD, String CONFIRMPASSWORD) {
        this.DOB = DOB;
        this.PASSWORD = PASSWORD;
        this.USERID = USERID;
        this.NAME = NAME;
        this.CONFIRMPASSWORD=CONFIRMPASSWORD;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String DOB;

    public String getCONFIRMPASSWORD() {
        return CONFIRMPASSWORD;
    }

    public void setCONFIRMPASSWORD(String CONFIRMPASSWORD) {
        this.CONFIRMPASSWORD = CONFIRMPASSWORD;
    }

    @Column
    private String CONFIRMPASSWORD;

    @Column
    private String PASSWORD;


    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @Column
    private String USERID;
    @Column
    private String NAME;


}
