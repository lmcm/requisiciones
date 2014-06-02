/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author pciai275
 */
@Embeddable
public class AspnetSchemaVersionsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Feature")
    private String feature;
    @Basic(optional = false)
    @Column(name = "CompatibleSchemaVersion")
    private String compatibleSchemaVersion;

    public AspnetSchemaVersionsPK() {
    }

    public AspnetSchemaVersionsPK(String feature, String compatibleSchemaVersion) {
        this.feature = feature;
        this.compatibleSchemaVersion = compatibleSchemaVersion;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getCompatibleSchemaVersion() {
        return compatibleSchemaVersion;
    }

    public void setCompatibleSchemaVersion(String compatibleSchemaVersion) {
        this.compatibleSchemaVersion = compatibleSchemaVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feature != null ? feature.hashCode() : 0);
        hash += (compatibleSchemaVersion != null ? compatibleSchemaVersion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetSchemaVersionsPK)) {
            return false;
        }
        AspnetSchemaVersionsPK other = (AspnetSchemaVersionsPK) object;
        if ((this.feature == null && other.feature != null) || (this.feature != null && !this.feature.equals(other.feature))) {
            return false;
        }
        if ((this.compatibleSchemaVersion == null && other.compatibleSchemaVersion != null) || (this.compatibleSchemaVersion != null && !this.compatibleSchemaVersion.equals(other.compatibleSchemaVersion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetSchemaVersionsPK[ feature=" + feature + ", compatibleSchemaVersion=" + compatibleSchemaVersion + " ]";
    }
    
}
