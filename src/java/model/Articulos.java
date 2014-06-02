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
@Table(name = "Articulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articulos.findAll", query = "SELECT a FROM Articulos a"),
    @NamedQuery(name = "Articulos.findByPkArticulo", query = "SELECT a FROM Articulos a WHERE a.pkArticulo = :pkArticulo"),
    @NamedQuery(name = "Articulos.findByClaveSap", query = "SELECT a FROM Articulos a WHERE a.claveSap = :claveSap"),
    @NamedQuery(name = "Articulos.findByDescripcion", query = "SELECT a FROM Articulos a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Articulos.findByStatus", query = "SELECT a FROM Articulos a WHERE a.status = :status"),
    @NamedQuery(name = "Articulos.findByUnidad", query = "SELECT a FROM Articulos a WHERE a.unidad = :unidad")})
public class Articulos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pkArticulo")
    private Long pkArticulo;
    @Basic(optional = false)
    @Column(name = "ClaveSap")
    private String claveSap;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Status")
    private Character status;
    @Column(name = "Unidad")
    private String unidad;

    public Articulos() {
    }

    public Articulos(Long pkArticulo) {
        this.pkArticulo = pkArticulo;
    }

    public Articulos(Long pkArticulo, String claveSap, String descripcion, Character status) {
        this.pkArticulo = pkArticulo;
        this.claveSap = claveSap;
        this.descripcion = descripcion;
        this.status = status;
    }

    public Long getPkArticulo() {
        return pkArticulo;
    }

    public void setPkArticulo(Long pkArticulo) {
        this.pkArticulo = pkArticulo;
    }

    public String getClaveSap() {
        return claveSap;
    }

    public void setClaveSap(String claveSap) {
        this.claveSap = claveSap;
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

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkArticulo != null ? pkArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulos)) {
            return false;
        }
        Articulos other = (Articulos) object;
        if ((this.pkArticulo == null && other.pkArticulo != null) || (this.pkArticulo != null && !this.pkArticulo.equals(other.pkArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Articulos[ pkArticulo=" + pkArticulo + " ]";
    }
    
}
