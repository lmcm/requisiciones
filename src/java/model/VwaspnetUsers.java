/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "vw_aspnet_Users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwaspnetUsers.findAll", query = "SELECT v FROM VwaspnetUsers v"),
    @NamedQuery(name = "VwaspnetUsers.findByApplicationId", query = "SELECT v FROM VwaspnetUsers v WHERE v.applicationId = :applicationId"),
    @NamedQuery(name = "VwaspnetUsers.findByUserId", query = "SELECT v FROM VwaspnetUsers v WHERE v.userId = :userId"),
    @NamedQuery(name = "VwaspnetUsers.findByUserName", query = "SELECT v FROM VwaspnetUsers v WHERE v.userName = :userName"),
    @NamedQuery(name = "VwaspnetUsers.findByLoweredUserName", query = "SELECT v FROM VwaspnetUsers v WHERE v.loweredUserName = :loweredUserName"),
    @NamedQuery(name = "VwaspnetUsers.findByMobileAlias", query = "SELECT v FROM VwaspnetUsers v WHERE v.mobileAlias = :mobileAlias"),
    @NamedQuery(name = "VwaspnetUsers.findByIsAnonymous", query = "SELECT v FROM VwaspnetUsers v WHERE v.isAnonymous = :isAnonymous"),
    @NamedQuery(name = "VwaspnetUsers.findByLastActivityDate", query = "SELECT v FROM VwaspnetUsers v WHERE v.lastActivityDate = :lastActivityDate")})
public class VwaspnetUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ApplicationId")
    @Id
    private String applicationId;
    @Basic(optional = false)
    @Column(name = "UserId")
    private String userId;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "LoweredUserName")
    private String loweredUserName;
    @Column(name = "MobileAlias")
    private String mobileAlias;
    @Basic(optional = false)
    @Column(name = "IsAnonymous")
    private boolean isAnonymous;
    @Basic(optional = false)
    @Column(name = "LastActivityDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivityDate;

    public VwaspnetUsers() {
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoweredUserName() {
        return loweredUserName;
    }

    public void setLoweredUserName(String loweredUserName) {
        this.loweredUserName = loweredUserName;
    }

    public String getMobileAlias() {
        return mobileAlias;
    }

    public void setMobileAlias(String mobileAlias) {
        this.mobileAlias = mobileAlias;
    }

    public boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }
    
}
