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
@Table(name = "Proyectos_Usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProyectosUsuarios.findAll", query = "SELECT p FROM ProyectosUsuarios p"),
    @NamedQuery(name = "ProyectosUsuarios.findById", query = "SELECT p FROM ProyectosUsuarios p WHERE p.id = :id"),
    @NamedQuery(name = "ProyectosUsuarios.findByIdUsuario", query = "SELECT p FROM ProyectosUsuarios p WHERE p.idUsuario = :idUsuario"),
    @NamedQuery(name = "ProyectosUsuarios.findByNomProyecto", query = "SELECT p FROM ProyectosUsuarios p WHERE p.nomProyecto = :nomProyecto")})
public class ProyectosUsuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "NomProyecto")
    private String nomProyecto;

    public ProyectosUsuarios() {
    }

    public ProyectosUsuarios(Integer id) {
        this.id = id;
    }

    public ProyectosUsuarios(Integer id, String idUsuario, String nomProyecto) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.nomProyecto = nomProyecto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
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
        if (!(object instanceof ProyectosUsuarios)) {
            return false;
        }
        ProyectosUsuarios other = (ProyectosUsuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ProyectosUsuarios[ id=" + id + " ]";
    }
    
}
