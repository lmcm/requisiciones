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
@Table(name = "aspnet_Profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetProfile.findAll", query = "SELECT a FROM AspnetProfile a"),
    @NamedQuery(name = "AspnetProfile.findByUserId", query = "SELECT a FROM AspnetProfile a WHERE a.userId = :userId"),
    @NamedQuery(name = "AspnetProfile.findByPropertyNames", query = "SELECT a FROM AspnetProfile a WHERE a.propertyNames = :propertyNames"),
    @NamedQuery(name = "AspnetProfile.findByPropertyValuesString", query = "SELECT a FROM AspnetProfile a WHERE a.propertyValuesString = :propertyValuesString"),
    @NamedQuery(name = "AspnetProfile.findByLastUpdatedDate", query = "SELECT a FROM AspnetProfile a WHERE a.lastUpdatedDate = :lastUpdatedDate")})
public class AspnetProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UserId")
    private String userId;
    @Basic(optional = false)
    @Column(name = "PropertyNames")
    private String propertyNames;
    @Basic(optional = false)
    @Column(name = "PropertyValuesString")
    private String propertyValuesString;
    @Basic(optional = false)
    @Lob
    @Column(name = "PropertyValuesBinary")
    private byte[] propertyValuesBinary;
    @Basic(optional = false)
    @Column(name = "LastUpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;
    @JoinColumn(name = "UserId", referencedColumnName = "UserId", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AspnetUsers aspnetUsers;

    public AspnetProfile() {
    }

    public AspnetProfile(String userId) {
        this.userId = userId;
    }

    public AspnetProfile(String userId, String propertyNames, String propertyValuesString, byte[] propertyValuesBinary, Date lastUpdatedDate) {
        this.userId = userId;
        this.propertyNames = propertyNames;
        this.propertyValuesString = propertyValuesString;
        this.propertyValuesBinary = propertyValuesBinary;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(String propertyNames) {
        this.propertyNames = propertyNames;
    }

    public String getPropertyValuesString() {
        return propertyValuesString;
    }

    public void setPropertyValuesString(String propertyValuesString) {
        this.propertyValuesString = propertyValuesString;
    }

    public byte[] getPropertyValuesBinary() {
        return propertyValuesBinary;
    }

    public void setPropertyValuesBinary(byte[] propertyValuesBinary) {
        this.propertyValuesBinary = propertyValuesBinary;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public AspnetUsers getAspnetUsers() {
        return aspnetUsers;
    }

    public void setAspnetUsers(AspnetUsers aspnetUsers) {
        this.aspnetUsers = aspnetUsers;
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
        if (!(object instanceof AspnetProfile)) {
            return false;
        }
        AspnetProfile other = (AspnetProfile) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetProfile[ userId=" + userId + " ]";
    }
    
}
