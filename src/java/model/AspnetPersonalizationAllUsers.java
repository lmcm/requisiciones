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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "aspnet_PersonalizationAllUsers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetPersonalizationAllUsers.findAll", query = "SELECT a FROM AspnetPersonalizationAllUsers a"),
    @NamedQuery(name = "AspnetPersonalizationAllUsers.findByPathId", query = "SELECT a FROM AspnetPersonalizationAllUsers a WHERE a.pathId = :pathId"),
    @NamedQuery(name = "AspnetPersonalizationAllUsers.findByLastUpdatedDate", query = "SELECT a FROM AspnetPersonalizationAllUsers a WHERE a.lastUpdatedDate = :lastUpdatedDate")})
public class AspnetPersonalizationAllUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PathId")
    private String pathId;
    @Basic(optional = false)
    @Lob
    @Column(name = "PageSettings")
    private byte[] pageSettings;
    @Basic(optional = false)
    @Column(name = "LastUpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;
    @JoinColumn(name = "PathId", referencedColumnName = "PathId", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AspnetPaths aspnetPaths;

    public AspnetPersonalizationAllUsers() {
    }

    public AspnetPersonalizationAllUsers(String pathId) {
        this.pathId = pathId;
    }

    public AspnetPersonalizationAllUsers(String pathId, byte[] pageSettings, Date lastUpdatedDate) {
        this.pathId = pathId;
        this.pageSettings = pageSettings;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public byte[] getPageSettings() {
        return pageSettings;
    }

    public void setPageSettings(byte[] pageSettings) {
        this.pageSettings = pageSettings;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public AspnetPaths getAspnetPaths() {
        return aspnetPaths;
    }

    public void setAspnetPaths(AspnetPaths aspnetPaths) {
        this.aspnetPaths = aspnetPaths;
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
        if (!(object instanceof AspnetPersonalizationAllUsers)) {
            return false;
        }
        AspnetPersonalizationAllUsers other = (AspnetPersonalizationAllUsers) object;
        if ((this.pathId == null && other.pathId != null) || (this.pathId != null && !this.pathId.equals(other.pathId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetPersonalizationAllUsers[ pathId=" + pathId + " ]";
    }
    
}
