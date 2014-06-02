/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pciai275
 */
@Entity
@Table(name = "Requisiciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requisiciones.findAll", query = "SELECT r FROM Requisiciones r"),
    @NamedQuery(name = "Requisiciones.findByPkRequisicion", query = "SELECT r FROM Requisiciones r WHERE r.pkRequisicion = :pkRequisicion"),
    @NamedQuery(name = "Requisiciones.findByTipo", query = "SELECT r FROM Requisiciones r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "Requisiciones.findByStatus", query = "SELECT r FROM Requisiciones r WHERE r.status = :status"),
    @NamedQuery(name = "Requisiciones.findByNumero", query = "SELECT r FROM Requisiciones r WHERE r.numero = :numero"),
    @NamedQuery(name = "Requisiciones.findByFechaCreacion", query = "SELECT r FROM Requisiciones r WHERE r.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Requisiciones.findByFechaProceso", query = "SELECT r FROM Requisiciones r WHERE r.fechaProceso = :fechaProceso"),
    @NamedQuery(name = "Requisiciones.findByFechaOc", query = "SELECT r FROM Requisiciones r WHERE r.fechaOc = :fechaOc"),
    @NamedQuery(name = "Requisiciones.findByFechaSolicitud", query = "SELECT r FROM Requisiciones r WHERE r.fechaSolicitud = :fechaSolicitud"),
    @NamedQuery(name = "Requisiciones.findByFechaRequerida", query = "SELECT r FROM Requisiciones r WHERE r.fechaRequerida = :fechaRequerida"),
    @NamedQuery(name = "Requisiciones.findByArea", query = "SELECT distinct r.area FROM Requisiciones r WHERE r.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Requisiciones.findByProveedor", query = "SELECT r FROM Requisiciones r WHERE r.proveedor = :proveedor"),
    @NamedQuery(name = "Requisiciones.findByContacto", query = "SELECT r FROM Requisiciones r WHERE r.contacto = :contacto"),
    @NamedQuery(name = "Requisiciones.findByObservaciones", query = "SELECT r FROM Requisiciones r WHERE r.observaciones = :observaciones"),
    @NamedQuery(name = "Requisiciones.findBySolicita", query = "SELECT r FROM Requisiciones r WHERE r.solicita = :solicita"),

    @NamedQuery(name = "Requisiciones.findByTotal", query = "SELECT r FROM Requisiciones r WHERE r.total = :total"),
    @NamedQuery(name = "Requisiciones.findByCliente", query = "SELECT r FROM Requisiciones r WHERE r.cliente = :cliente"),
    @NamedQuery(name = "Requisiciones.findByFechaRecepcion", query = "SELECT r FROM Requisiciones r WHERE r.fechaRecepcion = :fechaRecepcion"),
    @NamedQuery(name = "Requisiciones.findByFechaCancelacion", query = "SELECT r FROM Requisiciones r WHERE r.fechaCancelacion = :fechaCancelacion"),
    @NamedQuery(name = "Requisiciones.findByNombreUsuModif", query = "SELECT r FROM Requisiciones r WHERE r.nombreUsuModif = :nombreUsuModif"),
    @NamedQuery(name = "Requisiciones.findByReqCalidad", query = "SELECT r FROM Requisiciones r WHERE r.reqCalidad = :reqCalidad"),
    @NamedQuery(name = "Requisiciones.findByComentarios", query = "SELECT r FROM Requisiciones r WHERE r.comentarios = :comentarios"),
    @NamedQuery(name = "Requisiciones.findByAutorizadoPor", query = "SELECT r FROM Requisiciones r WHERE r.autorizadoPor = :autorizadoPor"),
    @NamedQuery(name = "Requisiciones.findByRelSeguridad", query = "SELECT r FROM Requisiciones r WHERE r.relSeguridad = :relSeguridad"),
    @NamedQuery(name = "Requisiciones.findByCFRparte21", query = "SELECT r FROM Requisiciones r WHERE r.cFRparte21 = :cFRparte21"),
    @NamedQuery(name = "Requisiciones.findByEvaluadoPor", query = "SELECT r FROM Requisiciones r WHERE r.evaluadoPor = :evaluadoPor"),
    @NamedQuery(name = "Requisiciones.findByVerifCalidad", query = "SELECT r FROM Requisiciones r WHERE r.verifCalidad = :verifCalidad"),
    @NamedQuery(name = "Requisiciones.findByRevisaExistencia", query = "SELECT r FROM Requisiciones r WHERE r.revisaExistencia = :revisaExistencia"),
    @NamedQuery(name = "Requisiciones.findByNombreUsuarioProyecto", query = "SELECT distinct r.numero, r.fkProyecto, r.tipo  FROM Requisiciones r WHERE r.nombreUsuario = :nombreUsuario order by r.numero, r.tipo"),
    @NamedQuery(name = "Requisiciones.findByNombreUsuario2",
            query = "SELECT r.pkRequisicion,r.tipo, r.status, r.numero, "
            + "Cast(r.fechaCreacion as Date) as fechaCreacion, "
            + "Cast(r.fechaProceso as Date) as  fechaProceso, "
            + "Cast(r.fechaOc as Date) as fechaOc, "
            + "Cast(r.fechaSolicitud as  Date) as  fechaSolicitud, "
            + "Cast(r.fechaRequerida as Date) as  fechaRequerida, "
            + "r.fkProyecto, r.area, r.proveedor, r.contacto, r.observaciones, r.solicita, r.nombreUsuario, r.total, r.cliente, "
            + "Cast(r.fechaRecepcion as  Date) as fechaRecepcion, "
            + "Cast(r.fechaCancelacion as Date) as fechaCancelacion, "
            + "r.nombreUsuModif, r.reqCalidad, r.comentarios, r.autorizadoPor, r.relSeguridad,  "
            + "r.cFRparte21, r.evaluadoPor, r.verifCalidad, r.revisaExistencia "
            + "FROM Requisiciones r "
            + " WHERE r.nombreUsuario = :nombreUsuario and Cast(r.fechaCreacion As Date) >= '2014-01-01'"),

})

// @NamedQuery(name = "Requisiciones.findByNombreUsuario", query = "SELECT r FROM Requisiciones r WHERE r.nombreUsuario = :nombreUsuario and Cast(r.fechaCreacion As Date) >= '2014-01-01'")
public class Requisiciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pkRequisicion")
    private Long pkRequisicion;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private short tipo;
    @Basic(optional = false)
    @Column(name = "Status")
    private short status;
    @Basic(optional = false)
    @Column(name = "Numero")
    private String numero;
    @Basic(optional = false)
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "FechaProceso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProceso;
    @Column(name = "FechaOc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOc;
    @Basic(optional = false)
    @Column(name = "FechaSolicitud")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @Column(name = "FechaRequerida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRequerida;
    @Basic(optional = false)
    @Column(name = "Area")
    private String area;
    @Column(name = "Proveedor")
    private String proveedor;
    @Column(name = "Contacto")
    private String contacto;
    @Column(name = "Observaciones")
    private String observaciones;
    @Basic(optional = false)
    @Column(name = "Solicita")
    private String solicita;
    @Basic(optional = false)
    @Column(name = "NombreUsuario")
    private String nombreUsuario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Total")
    private BigDecimal total;
    @Column(name = "Cliente")
    private String cliente;
    @Column(name = "FechaRecepcion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRecepcion;
    @Column(name = "FechaCancelacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCancelacion;
    @Column(name = "NombreUsuModif")
    private String nombreUsuModif;
    @Basic(optional = false)
    @Column(name = "ReqCalidad")
    private boolean reqCalidad;
    @Column(name = "Comentarios")
    private Boolean comentarios;
    @Column(name = "AutorizadoPor")
    private String autorizadoPor;
    @Column(name = "RelSeguridad")
    private Boolean relSeguridad;
    @Column(name = "CFRparte21")
    private Boolean cFRparte21;
    @Column(name = "EvaluadoPor")
    private String evaluadoPor;
    @Column(name = "VerifCalidad")
    private String verifCalidad;
    @Column(name = "RevisaExistencia")
    private String revisaExistencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requisiciones")
    private List<DetalleReqArticulo> detalleReqArticuloList;
    @JoinColumn(name = "fkProyecto", referencedColumnName = "pkProyecto")
    @ManyToOne
    private Proyectos fkProyecto;

    public Requisiciones() {
    }

    public Requisiciones(Long pkRequisicion) {
        this.pkRequisicion = pkRequisicion;
    }

    public Requisiciones(Long pkRequisicion, short tipo, short status, String numero, Date fechaCreacion, Date fechaSolicitud, Date fechaRequerida, String area, String solicita, String nombreUsuario, BigDecimal total, boolean reqCalidad) {
        this.pkRequisicion = pkRequisicion;
        this.tipo = tipo;
        this.status = status;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaRequerida = fechaRequerida;
        this.area = area;
        this.solicita = solicita;
        this.nombreUsuario = nombreUsuario;
        this.total = total;
        this.reqCalidad = reqCalidad;
    }

    public Long getPkRequisicion() {
        return pkRequisicion;
    }

    public void setPkRequisicion(Long pkRequisicion) {
        this.pkRequisicion = pkRequisicion;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaProceso() {
        return fechaProceso;
    }

    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    public Date getFechaOc() {
        return fechaOc;
    }

    public void setFechaOc(Date fechaOc) {
        this.fechaOc = fechaOc;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaRequerida() {
        return fechaRequerida;
    }

    public void setFechaRequerida(Date fechaRequerida) {
        this.fechaRequerida = fechaRequerida;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getSolicita() {
        return solicita;
    }

    public void setSolicita(String solicita) {
        this.solicita = solicita;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public String getNombreUsuModif() {
        return nombreUsuModif;
    }

    public void setNombreUsuModif(String nombreUsuModif) {
        this.nombreUsuModif = nombreUsuModif;
    }

    public boolean getReqCalidad() {
        return reqCalidad;
    }

    public void setReqCalidad(boolean reqCalidad) {
        this.reqCalidad = reqCalidad;
    }

    public Boolean getComentarios() {
        return comentarios;
    }

    public void setComentarios(Boolean comentarios) {
        this.comentarios = comentarios;
    }

    public String getAutorizadoPor() {
        return autorizadoPor;
    }

    public void setAutorizadoPor(String autorizadoPor) {
        this.autorizadoPor = autorizadoPor;
    }

    public Boolean getRelSeguridad() {
        return relSeguridad;
    }

    public void setRelSeguridad(Boolean relSeguridad) {
        this.relSeguridad = relSeguridad;
    }

    public Boolean getCFRparte21() {
        return cFRparte21;
    }

    public void setCFRparte21(Boolean cFRparte21) {
        this.cFRparte21 = cFRparte21;
    }

    public String getEvaluadoPor() {
        return evaluadoPor;
    }

    public void setEvaluadoPor(String evaluadoPor) {
        this.evaluadoPor = evaluadoPor;
    }

    public String getVerifCalidad() {
        return verifCalidad;
    }

    public void setVerifCalidad(String verifCalidad) {
        this.verifCalidad = verifCalidad;
    }

    public String getRevisaExistencia() {
        return revisaExistencia;
    }

    public void setRevisaExistencia(String revisaExistencia) {
        this.revisaExistencia = revisaExistencia;
    }

    @XmlTransient
    public List<DetalleReqArticulo> getDetalleReqArticuloList() {
        return detalleReqArticuloList;
    }

    public void setDetalleReqArticuloList(List<DetalleReqArticulo> detalleReqArticuloList) {
        this.detalleReqArticuloList = detalleReqArticuloList;
    }

    public Proyectos getFkProyecto() {
        return fkProyecto;

    }

    public void setFkProyecto(Proyectos fkProyecto) {
        this.fkProyecto = fkProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkRequisicion != null ? pkRequisicion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requisiciones)) {
            return false;
        }
        Requisiciones other = (Requisiciones) object;
        if ((this.pkRequisicion == null && other.pkRequisicion != null) || (this.pkRequisicion != null && !this.pkRequisicion.equals(other.pkRequisicion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pkRequisicion + "";
    }

    public String convertir(Proyectos p) {

        return p.getPkProyecto();
    }

}
