/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "aspnet_Applications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetApplications.findAll", query = "SELECT a FROM AspnetApplications a"),
    @NamedQuery(name = "AspnetApplications.findByApplicationName", query = "SELECT a FROM AspnetApplications a WHERE a.applicationName = :applicationName"),
    @NamedQuery(name = "AspnetApplications.findByLoweredApplicationName", query = "SELECT a FROM AspnetApplications a WHERE a.loweredApplicationName = :loweredApplicationName"),
    @NamedQuery(name = "AspnetApplications.findByApplicationId", query = "SELECT a FROM AspnetApplications a WHERE a.applicationId = :applicationId"),
    @NamedQuery(name = "AspnetApplications.findByDescription", query = "SELECT a FROM AspnetApplications a WHERE a.description = :description")})
public class AspnetApplications implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ApplicationName")
    private String applicationName;
    @Basic(optional = false)
    @Column(name = "LoweredApplicationName")
    private String loweredApplicationName;
    @Id
    @Basic(optional = false)
    @Column(name = "ApplicationId")
    private String applicationId;
    @Column(name = "Description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationId")
    private List<AspnetPaths> aspnetPathsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationId")
    private List<AspnetRoles> aspnetRolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationId")
    private List<AspnetMembership> aspnetMembershipList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationId")
    private List<AspnetUsers> aspnetUsersList;

    public AspnetApplications() {
    }

    public AspnetApplications(String applicationId) {
        this.applicationId = applicationId;
    }

    public AspnetApplications(String applicationId, String applicationName, String loweredApplicationName) {
        this.applicationId = applicationId;
        this.applicationName = applicationName;
        this.loweredApplicationName = loweredApplicationName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getLoweredApplicationName() {
        return loweredApplicationName;
    }

    public void setLoweredApplicationName(String loweredApplicationName) {
        this.loweredApplicationName = loweredApplicationName;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<AspnetPaths> getAspnetPathsList() {
        return aspnetPathsList;
    }

    public void setAspnetPathsList(List<AspnetPaths> aspnetPathsList) {
        this.aspnetPathsList = aspnetPathsList;
    }

    @XmlTransient
    public List<AspnetRoles> getAspnetRolesList() {
        return aspnetRolesList;
    }

    public void setAspnetRolesList(List<AspnetRoles> aspnetRolesList) {
        this.aspnetRolesList = aspnetRolesList;
    }

    @XmlTransient
    public List<AspnetMembership> getAspnetMembershipList() {
        return aspnetMembershipList;
    }

    public void setAspnetMembershipList(List<AspnetMembership> aspnetMembershipList) {
        this.aspnetMembershipList = aspnetMembershipList;
    }

    @XmlTransient
    public List<AspnetUsers> getAspnetUsersList() {
        return aspnetUsersList;
    }

    public void setAspnetUsersList(List<AspnetUsers> aspnetUsersList) {
        this.aspnetUsersList = aspnetUsersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicationId != null ? applicationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetApplications)) {
            return false;
        }
        AspnetApplications other = (AspnetApplications) object;
        if ((this.applicationId == null && other.applicationId != null) || (this.applicationId != null && !this.applicationId.equals(other.applicationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetApplications[ applicationId=" + applicationId + " ]";
    }
    
}
