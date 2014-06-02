/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DetalleReqServicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleReqServicio.findAll", query = "SELECT d FROM DetalleReqServicio d"),
    @NamedQuery(name = "DetalleReqServicio.findByFkRequisicion", query = "SELECT d FROM DetalleReqServicio d WHERE d.fkRequisicion = :fkRequisicion"),
    @NamedQuery(name = "DetalleReqServicio.findByPartida", query = "SELECT d FROM DetalleReqServicio d WHERE d.partida = :partida"),
    @NamedQuery(name = "DetalleReqServicio.findByCantidad", query = "SELECT d FROM DetalleReqServicio d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleReqServicio.findByDescripcion", query = "SELECT d FROM DetalleReqServicio d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "DetalleReqServicio.findByPrecio", query = "SELECT d FROM DetalleReqServicio d WHERE d.precio = :precio"),
    @NamedQuery(name = "DetalleReqServicio.findByTotal", query = "SELECT d FROM DetalleReqServicio d WHERE d.total = :total")})
public class DetalleReqServicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "fkRequisicion")
    private long fkRequisicion;
    @Id
    @Basic(optional = false)
    @Column(name = "Partida")
    private Integer partida;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @Column(name = "Total")
    private BigDecimal total;

    public DetalleReqServicio() {
    }

    public DetalleReqServicio(Integer partida) {
        this.partida = partida;
    }

    public DetalleReqServicio(Integer partida, long fkRequisicion, double cantidad, String descripcion, BigDecimal precio, BigDecimal total) {
        this.partida = partida;
        this.fkRequisicion = fkRequisicion;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.total = total;
    }

    public long getFkRequisicion() {
        return fkRequisicion;
    }

    public void setFkRequisicion(long fkRequisicion) {
        this.fkRequisicion = fkRequisicion;
    }

    public Integer getPartida() {
        return partida;
    }

    public void setPartida(Integer partida) {
        this.partida = partida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partida != null ? partida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleReqServicio)) {
            return false;
        }
        DetalleReqServicio other = (DetalleReqServicio) object;
        if ((this.partida == null && other.partida != null) || (this.partida != null && !this.partida.equals(other.partida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DetalleReqServicio[ partida=" + partida + " ]";
    }
    
}
