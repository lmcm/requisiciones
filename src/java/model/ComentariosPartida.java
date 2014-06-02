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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "ComentariosPartida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComentariosPartida.findAll", query = "SELECT c FROM ComentariosPartida c"),
    @NamedQuery(name = "ComentariosPartida.findByIdComentarioPartida", query = "SELECT c FROM ComentariosPartida c WHERE c.idComentarioPartida = :idComentarioPartida"),
    @NamedQuery(name = "ComentariosPartida.findByMensaje", query = "SELECT c FROM ComentariosPartida c WHERE c.mensaje = :mensaje"),
    @NamedQuery(name = "ComentariosPartida.findByUserName", query = "SELECT c FROM ComentariosPartida c WHERE c.userName = :userName"),
    @NamedQuery(name = "ComentariosPartida.findByNaturaleza", query = "SELECT c FROM ComentariosPartida c WHERE c.naturaleza = :naturaleza"),
    @NamedQuery(name = "ComentariosPartida.findByFechaCreacion", query = "SELECT c FROM ComentariosPartida c WHERE c.fechaCreacion = :fechaCreacion")})
public class ComentariosPartida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdComentarioPartida")
    private Long idComentarioPartida;
    @Basic(optional = false)
    @Column(name = "Mensaje")
    private String mensaje;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "Naturaleza")
    private short naturaleza;
    @Basic(optional = false)
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @JoinColumns({
        @JoinColumn(name = "IdRequisicion", referencedColumnName = "fkRequisicion"),
        @JoinColumn(name = "IdPartida", referencedColumnName = "Partida")})
    @ManyToOne(optional = false)
    private DetalleReqArticulo detalleReqArticulo;

    public ComentariosPartida() {
    }

    public ComentariosPartida(Long idComentarioPartida) {
        this.idComentarioPartida = idComentarioPartida;
    }

    public ComentariosPartida(Long idComentarioPartida, String mensaje, String userName, short naturaleza, Date fechaCreacion) {
        this.idComentarioPartida = idComentarioPartida;
        this.mensaje = mensaje;
        this.userName = userName;
        this.naturaleza = naturaleza;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdComentarioPartida() {
        return idComentarioPartida;
    }

    public void setIdComentarioPartida(Long idComentarioPartida) {
        this.idComentarioPartida = idComentarioPartida;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public short getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(short naturaleza) {
        this.naturaleza = naturaleza;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public DetalleReqArticulo getDetalleReqArticulo() {
        return detalleReqArticulo;
    }

    public void setDetalleReqArticulo(DetalleReqArticulo detalleReqArticulo) {
        this.detalleReqArticulo = detalleReqArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComentarioPartida != null ? idComentarioPartida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComentariosPartida)) {
            return false;
        }
        ComentariosPartida other = (ComentariosPartida) object;
        if ((this.idComentarioPartida == null && other.idComentarioPartida != null) || (this.idComentarioPartida != null && !this.idComentarioPartida.equals(other.idComentarioPartida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ComentariosPartida[ idComentarioPartida=" + idComentarioPartida + " ]";
    }
    
}
