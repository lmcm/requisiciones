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
@Table(name = "vw_aspnet_Profiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwaspnetProfiles.findAll", query = "SELECT v FROM VwaspnetProfiles v"),
    @NamedQuery(name = "VwaspnetProfiles.findByUserId", query = "SELECT v FROM VwaspnetProfiles v WHERE v.userId = :userId"),
    @NamedQuery(name = "VwaspnetProfiles.findByLastUpdatedDate", query = "SELECT v FROM VwaspnetProfiles v WHERE v.lastUpdatedDate = :lastUpdatedDate"),
    @NamedQuery(name = "VwaspnetProfiles.findByDataSize", query = "SELECT v FROM VwaspnetProfiles v WHERE v.dataSize = :dataSize")})
public class VwaspnetProfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "UserId")
    @Id
    private String userId;
    @Basic(optional = false)
    @Column(name = "LastUpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;
    @Column(name = "DataSize")
    private Integer dataSize;

    public VwaspnetProfiles() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Integer getDataSize() {
        return dataSize;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
    }
    
}
