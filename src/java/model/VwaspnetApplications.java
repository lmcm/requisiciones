/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "vw_aspnet_Applications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwaspnetApplications.findAll", query = "SELECT v FROM VwaspnetApplications v"),
    @NamedQuery(name = "VwaspnetApplications.findByApplicationName", query = "SELECT v FROM VwaspnetApplications v WHERE v.applicationName = :applicationName"),
    @NamedQuery(name = "VwaspnetApplications.findByLoweredApplicationName", query = "SELECT v FROM VwaspnetApplications v WHERE v.loweredApplicationName = :loweredApplicationName"),
    @NamedQuery(name = "VwaspnetApplications.findByApplicationId", query = "SELECT v FROM VwaspnetApplications v WHERE v.applicationId = :applicationId"),
    @NamedQuery(name = "VwaspnetApplications.findByDescription", query = "SELECT v FROM VwaspnetApplications v WHERE v.description = :description")})
public class VwaspnetApplications implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ApplicationName")
    @Id
    private String applicationName;
    @Basic(optional = false)
    @Column(name = "LoweredApplicationName")
    private String loweredApplicationName;
    @Basic(optional = false)
    @Column(name = "ApplicationId")
    private String applicationId;
    @Column(name = "Description")
    private String description;

    public VwaspnetApplications() {
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
    
}
