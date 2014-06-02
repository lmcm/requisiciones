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
@Table(name = "Areas_Usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreasUsuarios.findAll", query = "SELECT a FROM AreasUsuarios a"),
    @NamedQuery(name = "AreasUsuarios.findById", query = "SELECT a FROM AreasUsuarios a WHERE a.id = :id"),
    @NamedQuery(name = "AreasUsuarios.findByIdArea", query = "SELECT a FROM AreasUsuarios a WHERE a.idArea = :idArea"),
    @NamedQuery(name = "AreasUsuarios.findByIdUsuario", query = "SELECT a FROM AreasUsuarios a WHERE a.idUsuario = :idUsuario")})
public class AreasUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "IdArea")
    private int idArea;
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private String idUsuario;

    public AreasUsuarios() {
    }

    public AreasUsuarios(Integer id) {
        this.id = id;
    }

    public AreasUsuarios(Integer id, int idArea, String idUsuario) {
        this.id = id;
        this.idArea = idArea;
        this.idUsuario = idUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof AreasUsuarios)) {
            return false;
        }
        AreasUsuarios other = (AreasUsuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AreasUsuarios[ id=" + id + " ]";
    }

}
