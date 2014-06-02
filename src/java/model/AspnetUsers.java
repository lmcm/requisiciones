/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "aspnet_Users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetUsers.findAll", query = "SELECT a FROM AspnetUsers a"),
    @NamedQuery(name = "AspnetUsers.findByUserId", query = "SELECT a FROM AspnetUsers a WHERE a.userId = :userId"),
    @NamedQuery(name = "AspnetUsers.findByUserName", query = "SELECT a FROM AspnetUsers a WHERE a.userName = :userName"),
    @NamedQuery(name = "AspnetUsers.findByLoweredUserName", query = "SELECT a FROM AspnetUsers a WHERE a.loweredUserName = :loweredUserName"),
    @NamedQuery(name = "AspnetUsers.findByMobileAlias", query = "SELECT a FROM AspnetUsers a WHERE a.mobileAlias = :mobileAlias"),
    @NamedQuery(name = "AspnetUsers.findByIsAnonymous", query = "SELECT a FROM AspnetUsers a WHERE a.isAnonymous = :isAnonymous"),
    @NamedQuery(name = "AspnetUsers.findByLastActivityDate", query = "SELECT a FROM AspnetUsers a WHERE a.lastActivityDate = :lastActivityDate")})
public class AspnetUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
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
    @ManyToMany(mappedBy = "aspnetUsersList")
    private List<AspnetRoles> aspnetRolesList;
    @ManyToMany(mappedBy = "aspnetUsersList1")
    private List<AspnetRoles> aspnetRolesList1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "aspnetUsers")
    private AspnetProfile aspnetProfile;
    @OneToMany(mappedBy = "userId")
    private List<AspnetPersonalizationPerUser> aspnetPersonalizationPerUserList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "aspnetUsers")
    private AspnetMembership aspnetMembership;
    @JoinColumn(name = "ApplicationId", referencedColumnName = "ApplicationId")
    @ManyToOne(optional = false)
    private AspnetApplications applicationId;

    public AspnetUsers() {
    }

    public AspnetUsers(String userId) {
        this.userId = userId;
    }

    public AspnetUsers(String userId, String userName, String loweredUserName, boolean isAnonymous, Date lastActivityDate) {
        this.userId = userId;
        this.userName = userName;
        this.loweredUserName = loweredUserName;
        this.isAnonymous = isAnonymous;
        this.lastActivityDate = lastActivityDate;
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

    @XmlTransient
    public List<AspnetRoles> getAspnetRolesList() {
        return aspnetRolesList;
    }

    public void setAspnetRolesList(List<AspnetRoles> aspnetRolesList) {
        this.aspnetRolesList = aspnetRolesList;
    }

    @XmlTransient
    public List<AspnetRoles> getAspnetRolesList1() {
        return aspnetRolesList1;
    }

    public void setAspnetRolesList1(List<AspnetRoles> aspnetRolesList1) {
        this.aspnetRolesList1 = aspnetRolesList1;
    }

    public AspnetProfile getAspnetProfile() {
        return aspnetProfile;
    }

    public void setAspnetProfile(AspnetProfile aspnetProfile) {
        this.aspnetProfile = aspnetProfile;
    }

    @XmlTransient
    public List<AspnetPersonalizationPerUser> getAspnetPersonalizationPerUserList() {
        return aspnetPersonalizationPerUserList;
    }

    public void setAspnetPersonalizationPerUserList(List<AspnetPersonalizationPerUser> aspnetPersonalizationPerUserList) {
        this.aspnetPersonalizationPerUserList = aspnetPersonalizationPerUserList;
    }

    public AspnetMembership getAspnetMembership() {
        return aspnetMembership;
    }

    public void setAspnetMembership(AspnetMembership aspnetMembership) {
        this.aspnetMembership = aspnetMembership;
    }

    public AspnetApplications getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(AspnetApplications applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetUsers)) {
            return false;
        }
        AspnetUsers other = (AspnetUsers) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetUsers[ userId=" + userId + " ]";
    }
    
}
