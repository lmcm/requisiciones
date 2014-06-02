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
@Table(name = "CentroBeneficio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentroBeneficio.findAll", query = "SELECT c FROM CentroBeneficio c"),
    @NamedQuery(name = "CentroBeneficio.findByPkCentroBenficio", query = "SELECT c FROM CentroBeneficio c WHERE c.pkCentroBenficio = :pkCentroBenficio"),
    @NamedQuery(name = "CentroBeneficio.findByDescripcion", query = "SELECT c FROM CentroBeneficio c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CentroBeneficio.findByStatus", query = "SELECT c FROM CentroBeneficio c WHERE c.status = :status")})
public class CentroBeneficio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pkCentroBenficio")
    private String pkCentroBenficio;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Status")
    private Character status;

    public CentroBeneficio() {
    }

    public CentroBeneficio(String pkCentroBenficio) {
        this.pkCentroBenficio = pkCentroBenficio;
    }

    public CentroBeneficio(String pkCentroBenficio, String descripcion, Character status) {
        this.pkCentroBenficio = pkCentroBenficio;
        this.descripcion = descripcion;
        this.status = status;
    }

    public String getPkCentroBenficio() {
        return pkCentroBenficio;
    }

    public void setPkCentroBenficio(String pkCentroBenficio) {
        this.pkCentroBenficio = pkCentroBenficio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkCentroBenficio != null ? pkCentroBenficio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentroBeneficio)) {
            return false;
        }
        CentroBeneficio other = (CentroBeneficio) object;
        if ((this.pkCentroBenficio == null && other.pkCentroBenficio != null) || (this.pkCentroBenficio != null && !this.pkCentroBenficio.equals(other.pkCentroBenficio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CentroBeneficio[ pkCentroBenficio=" + pkCentroBenficio + " ]";
    }
    
}
