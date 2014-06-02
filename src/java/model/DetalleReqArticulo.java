/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DetalleReqArticulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleReqArticulo.findAll", query = "SELECT d FROM DetalleReqArticulo d"),
    @NamedQuery(name = "DetalleReqArticulo.findByFkRequisicion", query = "SELECT d FROM DetalleReqArticulo d WHERE d.detalleReqArticuloPK.fkRequisicion = :fkRequisicion"),
    @NamedQuery(name = "DetalleReqArticulo.findByPartida", query = "SELECT d FROM DetalleReqArticulo d WHERE d.detalleReqArticuloPK.partida = :partida"),
    @NamedQuery(name = "DetalleReqArticulo.findByCantidad", query = "SELECT d FROM DetalleReqArticulo d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleReqArticulo.findByUnidad", query = "SELECT d FROM DetalleReqArticulo d WHERE d.unidad = :unidad"),
    @NamedQuery(name = "DetalleReqArticulo.findByMarca", query = "SELECT d FROM DetalleReqArticulo d WHERE d.marca = :marca"),
    @NamedQuery(name = "DetalleReqArticulo.findByModelo", query = "SELECT d FROM DetalleReqArticulo d WHERE d.modelo = :modelo"),
    @NamedQuery(name = "DetalleReqArticulo.findByNoParte", query = "SELECT d FROM DetalleReqArticulo d WHERE d.noParte = :noParte"),
    @NamedQuery(name = "DetalleReqArticulo.findByFkArticulo", query = "SELECT d FROM DetalleReqArticulo d WHERE d.fkArticulo = :fkArticulo"),
    @NamedQuery(name = "DetalleReqArticulo.findByDescripcion", query = "SELECT d FROM DetalleReqArticulo d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "DetalleReqArticulo.findByPertenencia", query = "SELECT d FROM DetalleReqArticulo d WHERE d.pertenencia = :pertenencia"),
    @NamedQuery(name = "DetalleReqArticulo.findByPrecio", query = "SELECT d FROM DetalleReqArticulo d WHERE d.precio = :precio"),
    @NamedQuery(name = "DetalleReqArticulo.findByTotal", query = "SELECT d FROM DetalleReqArticulo d WHERE d.total = :total"),
    @NamedQuery(name = "DetalleReqArticulo.findByDetalleArticulo", query = "SELECT d FROM DetalleReqArticulo d WHERE d.detalleArticulo = :detalleArticulo"),
    @NamedQuery(name = "DetalleReqArticulo.findByClaseSeguridad", query = "SELECT d FROM DetalleReqArticulo d WHERE d.claseSeguridad = :claseSeguridad"),
    @NamedQuery(name = "DetalleReqArticulo.findByInstPermanente", query = "SELECT d FROM DetalleReqArticulo d WHERE d.instPermanente = :instPermanente"),
    @NamedQuery(name = "DetalleReqArticulo.findByStatusPartida", query = "SELECT d FROM DetalleReqArticulo d WHERE d.statusPartida = :statusPartida"),
    @NamedQuery(name = "DetalleReqArticulo.findByComentarios", query = "SELECT d FROM DetalleReqArticulo d WHERE d.comentarios = :comentarios"),
    @NamedQuery(name = "DetalleReqArticulo.findByObservPartida", query = "SELECT d FROM DetalleReqArticulo d WHERE d.observPartida = :observPartida")})
public class DetalleReqArticulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleReqArticuloPK detalleReqArticuloPK;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "Unidad")
    private String unidad;
    @Column(name = "Marca")
    private String marca;
    @Column(name = "Modelo")
    private String modelo;
    @Column(name = "NoParte")
    private String noParte;
    @Basic(optional = false)
    @Column(name = "fkArticulo")
    private long fkArticulo;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Pertenencia")
    private Character pertenencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @Column(name = "Total")
    private BigDecimal total;
    @Column(name = "DetalleArticulo")
    private String detalleArticulo;
    @Column(name = "ClaseSeguridad")
    private String claseSeguridad;
    @Column(name = "InstPermanente")
    private Short instPermanente;
    @Column(name = "StatusPartida")
    private Short statusPartida;
    @Column(name = "Comentarios")
    private String comentarios;
    @Column(name = "ObservPartida")
    private String observPartida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detalleReqArticulo")
    private List<ComentariosPartida> comentariosPartidaList;
    @JoinColumn(name = "fkRequisicion", referencedColumnName = "pkRequisicion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requisiciones requisiciones;

    public DetalleReqArticulo() {
    }

    public DetalleReqArticulo(DetalleReqArticuloPK detalleReqArticuloPK) {
        this.detalleReqArticuloPK = detalleReqArticuloPK;
    }

    public DetalleReqArticulo(DetalleReqArticuloPK detalleReqArticuloPK, double cantidad, String unidad, long fkArticulo, String descripcion, BigDecimal precio, BigDecimal total) {
        this.detalleReqArticuloPK = detalleReqArticuloPK;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.fkArticulo = fkArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.total = total;
    }

    public DetalleReqArticulo(long fkRequisicion, int partida) {
        this.detalleReqArticuloPK = new DetalleReqArticuloPK(fkRequisicion, partida);
    }

    public DetalleReqArticuloPK getDetalleReqArticuloPK() {
        return detalleReqArticuloPK;
    }

    public void setDetalleReqArticuloPK(DetalleReqArticuloPK detalleReqArticuloPK) {
        this.detalleReqArticuloPK = detalleReqArticuloPK;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNoParte() {
        return noParte;
    }

    public void setNoParte(String noParte) {
        this.noParte = noParte;
    }

    public long getFkArticulo() {
        return fkArticulo;
    }

    public void setFkArticulo(long fkArticulo) {
        this.fkArticulo = fkArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(Character pertenencia) {
        this.pertenencia = pertenencia;
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

    public String getDetalleArticulo() {
        return detalleArticulo;
    }

    public void setDetalleArticulo(String detalleArticulo) {
        this.detalleArticulo = detalleArticulo;
    }

    public String getClaseSeguridad() {
        return claseSeguridad;
    }

    public void setClaseSeguridad(String claseSeguridad) {
        this.claseSeguridad = claseSeguridad;
    }

    public Short getInstPermanente() {
        return instPermanente;
    }

    public void setInstPermanente(Short instPermanente) {
        this.instPermanente = instPermanente;
    }

    public Short getStatusPartida() {
        return statusPartida;
    }

    public void setStatusPartida(Short statusPartida) {
        this.statusPartida = statusPartida;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getObservPartida() {
        return observPartida;
    }

    public void setObservPartida(String observPartida) {
        this.observPartida = observPartida;
    }

    @XmlTransient
    public List<ComentariosPartida> getComentariosPartidaList() {
        return comentariosPartidaList;
    }

    public void setComentariosPartidaList(List<ComentariosPartida> comentariosPartidaList) {
        this.comentariosPartidaList = comentariosPartidaList;
    }

    public Requisiciones getRequisiciones() {
        return requisiciones;
    }

    public void setRequisiciones(Requisiciones requisiciones) {
        this.requisiciones = requisiciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleReqArticuloPK != null ? detalleReqArticuloPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleReqArticulo)) {
            return false;
        }
        DetalleReqArticulo other = (DetalleReqArticulo) object;
        if ((this.detalleReqArticuloPK == null && other.detalleReqArticuloPK != null) || (this.detalleReqArticuloPK != null && !this.detalleReqArticuloPK.equals(other.detalleReqArticuloPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DetalleReqArticulo[ detalleReqArticuloPK=" + detalleReqArticuloPK + " ]";
    }
    
}
