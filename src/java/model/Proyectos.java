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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "Proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p"),
    @NamedQuery(name = "Proyectos.findByPkProyecto", query = "SELECT p FROM Proyectos p WHERE p.pkProyecto = :pkProyecto"),
    @NamedQuery(name = "Proyectos.findByDescripcion", query = "SELECT p FROM Proyectos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Proyectos.findByConsecutivo", query = "SELECT p FROM Proyectos p WHERE p.consecutivo = :consecutivo"),
    @NamedQuery(name = "Proyectos.findByArea", query = "SELECT p FROM Proyectos p WHERE p.area = :area"),
    @NamedQuery(name = "Proyectos.findByAbierto", query = "SELECT p FROM Proyectos p WHERE p.abierto = :abierto"),
    @NamedQuery(name = "Proyectos.findByJefe", query = "SELECT p FROM Proyectos p WHERE p.jefe = :jefe"),
    @NamedQuery(name = "Proyectos.findByEsCentroB", query = "SELECT p FROM Proyectos p WHERE p.esCentroB = :esCentroB")})
public class Proyectos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pkProyecto")
    private String pkProyecto;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Consecutivo")
    private int consecutivo;
    @Column(name = "Area")
    private String area;
    @Basic(optional = false)
    @Column(name = "Abierto")
    private boolean abierto;
    @Column(name = "Jefe")
    private String jefe;
    @Basic(optional = false)
    @Column(name = "EsCentroB")
    private boolean esCentroB;
    @OneToMany(mappedBy = "fkProyecto")
    private List<VwRequisNoBorradores> vwRequisNoBorradoresList;
    @OneToMany(mappedBy = "fkProyecto")
    private List<VwRequisNoBorradoresSAP> vwRequisNoBorradoresSAPList;
    @OneToMany(mappedBy = "fkProyecto")
    private List<Requisiciones> requisicionesList;

    public Proyectos() {
    }

    public Proyectos(String pkProyecto) {
        this.pkProyecto = pkProyecto;
    }

    public Proyectos(String pkProyecto, String descripcion, int consecutivo, boolean abierto, boolean esCentroB) {
        this.pkProyecto = pkProyecto;
        this.descripcion = descripcion;
        this.consecutivo = consecutivo;
        this.abierto = abierto;
        this.esCentroB = esCentroB;
    }

    public String getPkProyecto() {
        return pkProyecto;
    }

    public void setPkProyecto(String pkProyecto) {
        this.pkProyecto = pkProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean getAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public boolean getEsCentroB() {
        return esCentroB;
    }

    public void setEsCentroB(boolean esCentroB) {
        this.esCentroB = esCentroB;
    }

    @XmlTransient
    public List<VwRequisNoBorradores> getVwRequisNoBorradoresList() {
        return vwRequisNoBorradoresList;
    }

    public void setVwRequisNoBorradoresList(List<VwRequisNoBorradores> vwRequisNoBorradoresList) {
        this.vwRequisNoBorradoresList = vwRequisNoBorradoresList;
    }

    @XmlTransient
    public List<VwRequisNoBorradoresSAP> getVwRequisNoBorradoresSAPList() {
        return vwRequisNoBorradoresSAPList;
    }

    public void setVwRequisNoBorradoresSAPList(List<VwRequisNoBorradoresSAP> vwRequisNoBorradoresSAPList) {
        this.vwRequisNoBorradoresSAPList = vwRequisNoBorradoresSAPList;
    }

    @XmlTransient
    public List<Requisiciones> getRequisicionesList() {
        return requisicionesList;
    }

    public void setRequisicionesList(List<Requisiciones> requisicionesList) {
        this.requisicionesList = requisicionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkProyecto != null ? pkProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyectos)) {
            return false;
        }
        Proyectos other = (Proyectos) object;
        if ((this.pkProyecto == null && other.pkProyecto != null) || (this.pkProyecto != null && !this.pkProyecto.equals(other.pkProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  pkProyecto + "";
    }
    
}
