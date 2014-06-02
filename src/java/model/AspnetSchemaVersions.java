/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "aspnet_SchemaVersions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetSchemaVersions.findAll", query = "SELECT a FROM AspnetSchemaVersions a"),
    @NamedQuery(name = "AspnetSchemaVersions.findByFeature", query = "SELECT a FROM AspnetSchemaVersions a WHERE a.aspnetSchemaVersionsPK.feature = :feature"),
    @NamedQuery(name = "AspnetSchemaVersions.findByCompatibleSchemaVersion", query = "SELECT a FROM AspnetSchemaVersions a WHERE a.aspnetSchemaVersionsPK.compatibleSchemaVersion = :compatibleSchemaVersion"),
    @NamedQuery(name = "AspnetSchemaVersions.findByIsCurrentVersion", query = "SELECT a FROM AspnetSchemaVersions a WHERE a.isCurrentVersion = :isCurrentVersion")})
public class AspnetSchemaVersions implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AspnetSchemaVersionsPK aspnetSchemaVersionsPK;
    @Basic(optional = false)
    @Column(name = "IsCurrentVersion")
    private boolean isCurrentVersion;

    public AspnetSchemaVersions() {
    }

    public AspnetSchemaVersions(AspnetSchemaVersionsPK aspnetSchemaVersionsPK) {
        this.aspnetSchemaVersionsPK = aspnetSchemaVersionsPK;
    }

    public AspnetSchemaVersions(AspnetSchemaVersionsPK aspnetSchemaVersionsPK, boolean isCurrentVersion) {
        this.aspnetSchemaVersionsPK = aspnetSchemaVersionsPK;
        this.isCurrentVersion = isCurrentVersion;
    }

    public AspnetSchemaVersions(String feature, String compatibleSchemaVersion) {
        this.aspnetSchemaVersionsPK = new AspnetSchemaVersionsPK(feature, compatibleSchemaVersion);
    }

    public AspnetSchemaVersionsPK getAspnetSchemaVersionsPK() {
        return aspnetSchemaVersionsPK;
    }

    public void setAspnetSchemaVersionsPK(AspnetSchemaVersionsPK aspnetSchemaVersionsPK) {
        this.aspnetSchemaVersionsPK = aspnetSchemaVersionsPK;
    }

    public boolean getIsCurrentVersion() {
        return isCurrentVersion;
    }

    public void setIsCurrentVersion(boolean isCurrentVersion) {
        this.isCurrentVersion = isCurrentVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aspnetSchemaVersionsPK != null ? aspnetSchemaVersionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetSchemaVersions)) {
            return false;
        }
        AspnetSchemaVersions other = (AspnetSchemaVersions) object;
        if ((this.aspnetSchemaVersionsPK == null && other.aspnetSchemaVersionsPK != null) || (this.aspnetSchemaVersionsPK != null && !this.aspnetSchemaVersionsPK.equals(other.aspnetSchemaVersionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetSchemaVersions[ aspnetSchemaVersionsPK=" + aspnetSchemaVersionsPK + " ]";
    }
    
}
