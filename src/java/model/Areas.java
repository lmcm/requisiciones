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
@Table(name = "Areas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Areas.findAll", query = "SELECT a FROM Areas a"),
    @NamedQuery(name = "Areas.findByIdArea", query = "SELECT a FROM Areas a WHERE a.idArea = :idArea"),
    @NamedQuery(name = "Areas.findByNomArea", query = "SELECT a FROM Areas a WHERE a.nomArea = :nomArea"),
    @NamedQuery(name = "Areas.findByNomDireccion", query = "SELECT a FROM Areas a WHERE a.nomDireccion = :nomDireccion"),
    @NamedQuery(name = "Areas.findByNomGerente", query = "SELECT a FROM Areas a WHERE a.nomGerente = :nomGerente")})
public class Areas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdArea")
    private Integer idArea;
    @Basic(optional = false)
    @Column(name = "NomArea")
    private String nomArea;
    @Column(name = "NomDireccion")
    private String nomDireccion;
    @Column(name = "NomGerente")
    private String nomGerente;

    public Areas() {
    }

    public Areas(Integer idArea) {
        this.idArea = idArea;
    }

    public Areas(Integer idArea, String nomArea) {
        this.idArea = idArea;
        this.nomArea = nomArea;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public String getNomDireccion() {
        return nomDireccion;
    }

    public void setNomDireccion(String nomDireccion) {
        this.nomDireccion = nomDireccion;
    }

    public String getNomGerente() {
        return nomGerente;
    }

    public void setNomGerente(String nomGerente) {
        this.nomGerente = nomGerente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areas)) {
            return false;
        }
        Areas other = (Areas) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Areas[ idArea=" + idArea + " ]";
    }
    
}
