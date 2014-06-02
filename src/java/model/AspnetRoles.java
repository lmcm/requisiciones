/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "aspnet_Roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetRoles.findAll", query = "SELECT a FROM AspnetRoles a"),
    @NamedQuery(name = "AspnetRoles.findByRoleId", query = "SELECT a FROM AspnetRoles a WHERE a.roleId = :roleId"),
    @NamedQuery(name = "AspnetRoles.findByRoleName", query = "SELECT a FROM AspnetRoles a WHERE a.roleName = :roleName"),
    @NamedQuery(name = "AspnetRoles.findByLoweredRoleName", query = "SELECT a FROM AspnetRoles a WHERE a.loweredRoleName = :loweredRoleName"),
    @NamedQuery(name = "AspnetRoles.findByDescription", query = "SELECT a FROM AspnetRoles a WHERE a.description = :description")})
public class AspnetRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RoleId")
    private String roleId;
    @Basic(optional = false)
    @Column(name = "RoleName")
    private String roleName;
    @Basic(optional = false)
    @Column(name = "LoweredRoleName")
    private String loweredRoleName;
    @Column(name = "Description")
    private String description;
    @JoinTable(name = "aspnet_UsersInRoles", joinColumns = {
        @JoinColumn(name = "RoleId", referencedColumnName = "RoleId")}, inverseJoinColumns = {
        @JoinColumn(name = "UserId", referencedColumnName = "UserId")})
    @ManyToMany
    private List<AspnetUsers> aspnetUsersList;
    @JoinTable(name = "vw_aspnet_UsersInRoles", joinColumns = {
        @JoinColumn(name = "RoleId", referencedColumnName = "RoleId")}, inverseJoinColumns = {
        @JoinColumn(name = "UserId", referencedColumnName = "UserId")})
    @ManyToMany
    private List<AspnetUsers> aspnetUsersList1;
    @JoinColumn(name = "ApplicationId", referencedColumnName = "ApplicationId")
    @ManyToOne(optional = false)
    private AspnetApplications applicationId;

    public AspnetRoles() {
    }

    public AspnetRoles(String roleId) {
        this.roleId = roleId;
    }

    public AspnetRoles(String roleId, String roleName, String loweredRoleName) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.loweredRoleName = loweredRoleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getLoweredRoleName() {
        return loweredRoleName;
    }

    public void setLoweredRoleName(String loweredRoleName) {
        this.loweredRoleName = loweredRoleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<AspnetUsers> getAspnetUsersList() {
        return aspnetUsersList;
    }

    public void setAspnetUsersList(List<AspnetUsers> aspnetUsersList) {
        this.aspnetUsersList = aspnetUsersList;
    }

    @XmlTransient
    public List<AspnetUsers> getAspnetUsersList1() {
        return aspnetUsersList1;
    }

    public void setAspnetUsersList1(List<AspnetUsers> aspnetUsersList1) {
        this.aspnetUsersList1 = aspnetUsersList1;
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
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetRoles)) {
            return false;
        }
        AspnetRoles other = (AspnetRoles) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetRoles[ roleId=" + roleId + " ]";
    }
    
}
