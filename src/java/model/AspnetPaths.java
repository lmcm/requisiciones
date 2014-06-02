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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "aspnet_Paths")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetPaths.findAll", query = "SELECT a FROM AspnetPaths a"),
    @NamedQuery(name = "AspnetPaths.findByPathId", query = "SELECT a FROM AspnetPaths a WHERE a.pathId = :pathId"),
    @NamedQuery(name = "AspnetPaths.findByPath", query = "SELECT a FROM AspnetPaths a WHERE a.path = :path"),
    @NamedQuery(name = "AspnetPaths.findByLoweredPath", query = "SELECT a FROM AspnetPaths a WHERE a.loweredPath = :loweredPath")})
public class AspnetPaths implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PathId")
    private String pathId;
    @Basic(optional = false)
    @Column(name = "Path")
    private String path;
    @Basic(optional = false)
    @Column(name = "LoweredPath")
    private String loweredPath;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "aspnetPaths")
    private AspnetPersonalizationAllUsers aspnetPersonalizationAllUsers;
    @OneToMany(mappedBy = "pathId")
    private List<AspnetPersonalizationPerUser> aspnetPersonalizationPerUserList;
    @JoinColumn(name = "ApplicationId", referencedColumnName = "ApplicationId")
    @ManyToOne(optional = false)
    private AspnetApplications applicationId;

    public AspnetPaths() {
    }

    public AspnetPaths(String pathId) {
        this.pathId = pathId;
    }

    public AspnetPaths(String pathId, String path, String loweredPath) {
        this.pathId = pathId;
        this.path = path;
        this.loweredPath = loweredPath;
    }

    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLoweredPath() {
        return loweredPath;
    }

    public void setLoweredPath(String loweredPath) {
        this.loweredPath = loweredPath;
    }

    public AspnetPersonalizationAllUsers getAspnetPersonalizationAllUsers() {
        return aspnetPersonalizationAllUsers;
    }

    public void setAspnetPersonalizationAllUsers(AspnetPersonalizationAllUsers aspnetPersonalizationAllUsers) {
        this.aspnetPersonalizationAllUsers = aspnetPersonalizationAllUsers;
    }

    @XmlTransient
    public List<AspnetPersonalizationPerUser> getAspnetPersonalizationPerUserList() {
        return aspnetPersonalizationPerUserList;
    }

    public void setAspnetPersonalizationPerUserList(List<AspnetPersonalizationPerUser> aspnetPersonalizationPerUserList) {
        this.aspnetPersonalizationPerUserList = aspnetPersonalizationPerUserList;
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
        hash += (pathId != null ? pathId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetPaths)) {
            return false;
        }
        AspnetPaths other = (AspnetPaths) object;
        if ((this.pathId == null && other.pathId != null) || (this.pathId != null && !this.pathId.equals(other.pathId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetPaths[ pathId=" + pathId + " ]";
    }
    
}
