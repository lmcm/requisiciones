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
import javax.persistence.ManyToOne;
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
@Table(name = "aspnet_PersonalizationPerUser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetPersonalizationPerUser.findAll", query = "SELECT a FROM AspnetPersonalizationPerUser a"),
    @NamedQuery(name = "AspnetPersonalizationPerUser.findById", query = "SELECT a FROM AspnetPersonalizationPerUser a WHERE a.id = :id"),
    @NamedQuery(name = "AspnetPersonalizationPerUser.findByLastUpdatedDate", query = "SELECT a FROM AspnetPersonalizationPerUser a WHERE a.lastUpdatedDate = :lastUpdatedDate")})
public class AspnetPersonalizationPerUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Basic(optional = false)
    @Lob
    @Column(name = "PageSettings")
    private byte[] pageSettings;
    @Basic(optional = false)
    @Column(name = "LastUpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;
    @JoinColumn(name = "UserId", referencedColumnName = "UserId")
    @ManyToOne
    private AspnetUsers userId;
    @JoinColumn(name = "PathId", referencedColumnName = "PathId")
    @ManyToOne
    private AspnetPaths pathId;

    public AspnetPersonalizationPerUser() {
    }

    public AspnetPersonalizationPerUser(String id) {
        this.id = id;
    }

    public AspnetPersonalizationPerUser(String id, byte[] pageSettings, Date lastUpdatedDate) {
        this.id = id;
        this.pageSettings = pageSettings;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public AspnetUsers getUserId() {
        return userId;
    }

    public void setUserId(AspnetUsers userId) {
        this.userId = userId;
    }

    public AspnetPaths getPathId() {
        return pathId;
    }

    public void setPathId(AspnetPaths pathId) {
        this.pathId = pathId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetPersonalizationPerUser)) {
            return false;
        }
        AspnetPersonalizationPerUser other = (AspnetPersonalizationPerUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetPersonalizationPerUser[ id=" + id + " ]";
    }
    
}
