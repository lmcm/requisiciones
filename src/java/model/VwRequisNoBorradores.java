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
import javax.persistence.JoinColumn;
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
@Table(name = "vw_RequisNoBorradores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwRequisNoBorradores.findAll", query = "SELECT v FROM VwRequisNoBorradores v"),
    @NamedQuery(name = "VwRequisNoBorradores.findByNum4Consec", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.num4Consec = :num4Consec"),
    @NamedQuery(name = "VwRequisNoBorradores.findByPkRequisicion", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.pkRequisicion = :pkRequisicion"),
    @NamedQuery(name = "VwRequisNoBorradores.findByTipo", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.tipo = :tipo"),
    @NamedQuery(name = "VwRequisNoBorradores.findByStatus", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.status = :status"),
    @NamedQuery(name = "VwRequisNoBorradores.findByNumero", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.numero = :numero"),
    @NamedQuery(name = "VwRequisNoBorradores.findByFechaCreacion", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "VwRequisNoBorradores.findByFechaProceso", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.fechaProceso = :fechaProceso"),
    @NamedQuery(name = "VwRequisNoBorradores.findByFechaOc", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.fechaOc = :fechaOc"),
    @NamedQuery(name = "VwRequisNoBorradores.findByFechaSolicitud", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.fechaSolicitud = :fechaSolicitud"),
    @NamedQuery(name = "VwRequisNoBorradores.findByFechaRequerida", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.fechaRequerida = :fechaRequerida"),
    @NamedQuery(name = "VwRequisNoBorradores.findByArea", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.area = :area"),
    @NamedQuery(name = "VwRequisNoBorradores.findByProveedor", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.proveedor = :proveedor"),
    @NamedQuery(name = "VwRequisNoBorradores.findByContacto", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.contacto = :contacto"),
    @NamedQuery(name = "VwRequisNoBorradores.findByObservaciones", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.observaciones = :observaciones"),
    @NamedQuery(name = "VwRequisNoBorradores.findBySolicita", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.solicita = :solicita"),
    @NamedQuery(name = "VwRequisNoBorradores.findByNombreUsuario", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "VwRequisNoBorradores.findByTotal", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.total = :total"),
    @NamedQuery(name = "VwRequisNoBorradores.findByCliente", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.cliente = :cliente"),
    @NamedQuery(name = "VwRequisNoBorradores.findByFechaRecepcion", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.fechaRecepcion = :fechaRecepcion"),
    @NamedQuery(name = "VwRequisNoBorradores.findByFechaCancelacion", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.fechaCancelacion = :fechaCancelacion"),
    @NamedQuery(name = "VwRequisNoBorradores.findByNombreUsuModif", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.nombreUsuModif = :nombreUsuModif"),
    @NamedQuery(name = "VwRequisNoBorradores.findByReqCalidad", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.reqCalidad = :reqCalidad"),
    @NamedQuery(name = "VwRequisNoBorradores.findByComentarios", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.comentarios = :comentarios"),
    @NamedQuery(name = "VwRequisNoBorradores.findByAutorizadoPor", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.autorizadoPor = :autorizadoPor"),
    @NamedQuery(name = "VwRequisNoBorradores.findByRelSeguridad", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.relSeguridad = :relSeguridad"),
    @NamedQuery(name = "VwRequisNoBorradores.findByCFRparte21", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.cFRparte21 = :cFRparte21"),
    @NamedQuery(name = "VwRequisNoBorradores.findByEvaluadoPor", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.evaluadoPor = :evaluadoPor"),
    @NamedQuery(name = "VwRequisNoBorradores.findByVerifCalidad", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.verifCalidad = :verifCalidad"),
    @NamedQuery(name = "VwRequisNoBorradores.findByRevisaExistencia", query = "SELECT v FROM VwRequisNoBorradores v WHERE v.revisaExistencia = :revisaExistencia")})
public class VwRequisNoBorradores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "Num4Consec")
    private String num4Consec;
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
    @JoinColumn(name = "fkProyecto", referencedColumnName = "pkProyecto")
    @ManyToOne
    private Proyectos fkProyecto;

    public VwRequisNoBorradores() {
    }

    public VwRequisNoBorradores(Long pkRequisicion) {
        this.pkRequisicion = pkRequisicion;
    }

    public VwRequisNoBorradores(Long pkRequisicion, short tipo, short status, String numero, Date fechaCreacion, Date fechaSolicitud, Date fechaRequerida, String area, String solicita, String nombreUsuario, BigDecimal total, boolean reqCalidad) {
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

    public String getNum4Consec() {
        return num4Consec;
    }

    public void setNum4Consec(String num4Consec) {
        this.num4Consec = num4Consec;
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
        if (!(object instanceof VwRequisNoBorradores)) {
            return false;
        }
        VwRequisNoBorradores other = (VwRequisNoBorradores) object;
        if ((this.pkRequisicion == null && other.pkRequisicion != null) || (this.pkRequisicion != null && !this.pkRequisicion.equals(other.pkRequisicion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.VwRequisNoBorradores[ pkRequisicion=" + pkRequisicion + " ]";
    }
    
}
