/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Requis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requis.findAll", query = "SELECT r FROM Requis r"),
    @NamedQuery(name = "Requis.findById", query = "SELECT r FROM Requis r WHERE r.id = :id"),
    @NamedQuery(name = "Requis.findByPkRequisicion", query = "SELECT r FROM Requis r WHERE r.pkRequisicion = :pkRequisicion"),
    @NamedQuery(name = "Requis.findByTipo", query = "SELECT r FROM Requis r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "Requis.findByStatus", query = "SELECT r FROM Requis r WHERE r.status = :status"),
    @NamedQuery(name = "Requis.findByNumero", query = "SELECT r FROM Requis r WHERE r.numero = :numero"),
    @NamedQuery(name = "Requis.findByFechaCreacion", query = "SELECT r FROM Requis r WHERE r.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Requis.findByFechaProceso", query = "SELECT r FROM Requis r WHERE r.fechaProceso = :fechaProceso"),
    @NamedQuery(name = "Requis.findByFechaOc", query = "SELECT r FROM Requis r WHERE r.fechaOc = :fechaOc"),
    @NamedQuery(name = "Requis.findByFechaSolicitud", query = "SELECT r FROM Requis r WHERE r.fechaSolicitud = :fechaSolicitud"),
    @NamedQuery(name = "Requis.findByFechaRequerida", query = "SELECT r FROM Requis r WHERE r.fechaRequerida = :fechaRequerida"),
    @NamedQuery(name = "Requis.findByFkProyecto", query = "SELECT r FROM Requis r WHERE r.fkProyecto = :fkProyecto"),
    @NamedQuery(name = "Requis.findByArea", query = "SELECT r FROM Requis r WHERE r.area = :area"),
    @NamedQuery(name = "Requis.findByProveedor", query = "SELECT r FROM Requis r WHERE r.proveedor = :proveedor"),
    @NamedQuery(name = "Requis.findByContacto", query = "SELECT r FROM Requis r WHERE r.contacto = :contacto"),
    @NamedQuery(name = "Requis.findByObservaciones", query = "SELECT r FROM Requis r WHERE r.observaciones = :observaciones"),
    @NamedQuery(name = "Requis.findBySolicita", query = "SELECT r FROM Requis r WHERE r.solicita = :solicita"),
    @NamedQuery(name = "Requis.findByNombreUsuario", query = "SELECT r FROM Requis r WHERE r.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Requis.findByTotal", query = "SELECT r FROM Requis r WHERE r.total = :total"),
    @NamedQuery(name = "Requis.findByCliente", query = "SELECT r FROM Requis r WHERE r.cliente = :cliente"),
    @NamedQuery(name = "Requis.findByFechaRecepcion", query = "SELECT r FROM Requis r WHERE r.fechaRecepcion = :fechaRecepcion"),
    @NamedQuery(name = "Requis.findByFechaCancelacion", query = "SELECT r FROM Requis r WHERE r.fechaCancelacion = :fechaCancelacion"),
    @NamedQuery(name = "Requis.findByNombreUsuModif", query = "SELECT r FROM Requis r WHERE r.nombreUsuModif = :nombreUsuModif"),
    @NamedQuery(name = "Requis.findByReqCalidad", query = "SELECT r FROM Requis r WHERE r.reqCalidad = :reqCalidad"),
    @NamedQuery(name = "Requis.findByComentarios", query = "SELECT r FROM Requis r WHERE r.comentarios = :comentarios"),
    @NamedQuery(name = "Requis.findByAutorizadoPor", query = "SELECT r FROM Requis r WHERE r.autorizadoPor = :autorizadoPor"),
    @NamedQuery(name = "Requis.findByRelSeguridad", query = "SELECT r FROM Requis r WHERE r.relSeguridad = :relSeguridad"),
    @NamedQuery(name = "Requis.findByCFRparte21", query = "SELECT r FROM Requis r WHERE r.cFRparte21 = :cFRparte21"),
    @NamedQuery(name = "Requis.findByEvaluadoPor", query = "SELECT r FROM Requis r WHERE r.evaluadoPor = :evaluadoPor"),
    @NamedQuery(name = "Requis.findByVerifCalidad", query = "SELECT r FROM Requis r WHERE r.verifCalidad = :verifCalidad"),
    @NamedQuery(name = "Requis.findByRevisaExistencia", query = "SELECT r FROM Requis r WHERE r.revisaExistencia = :revisaExistencia"),
    @NamedQuery(name = "Requis.findByNum4Consec", query = "SELECT r FROM Requis r WHERE r.num4Consec = :num4Consec")})
public class Requis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "pkRequisicion")
    private long pkRequisicion;
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
    @Column(name = "fkProyecto")
    private String fkProyecto;
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
    @Column(name = "Num4Consec")
    private String num4Consec;

    public Requis() {
    }

    public Requis(Integer id) {
        this.id = id;
    }

    public Requis(Integer id, long pkRequisicion, short tipo, short status, String numero, Date fechaCreacion, Date fechaSolicitud, Date fechaRequerida, String area, String solicita, String nombreUsuario, BigDecimal total, boolean reqCalidad) {
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getPkRequisicion() {
        return pkRequisicion;
    }

    public void setPkRequisicion(long pkRequisicion) {
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

    public String getFkProyecto() {
        return fkProyecto;
    }

    public void setFkProyecto(String fkProyecto) {
        this.fkProyecto = fkProyecto;
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

    public String getNum4Consec() {
        return num4Consec;
    }

    public void setNum4Consec(String num4Consec) {
        this.num4Consec = num4Consec;
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
        if (!(object instanceof Requis)) {
            return false;
        }
        Requis other = (Requis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Requis[ id=" + id + " ]";
    }
    
}
