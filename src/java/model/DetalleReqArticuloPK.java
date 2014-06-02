/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author pciai275
 */
@Embeddable
public class DetalleReqArticuloPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "fkRequisicion")
    private long fkRequisicion;
    @Basic(optional = false)
    @Column(name = "Partida")
    private int partida;

    public DetalleReqArticuloPK() {
    }

    public DetalleReqArticuloPK(long fkRequisicion, int partida) {
        this.fkRequisicion = fkRequisicion;
        this.partida = partida;
    }

    public long getFkRequisicion() {
        return fkRequisicion;
    }

    public void setFkRequisicion(long fkRequisicion) {
        this.fkRequisicion = fkRequisicion;
    }

    public int getPartida() {
        return partida;
    }

    public void setPartida(int partida) {
        this.partida = partida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fkRequisicion;
        hash += (int) partida;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleReqArticuloPK)) {
            return false;
        }
        DetalleReqArticuloPK other = (DetalleReqArticuloPK) object;
        if (this.fkRequisicion != other.fkRequisicion) {
            return false;
        }
        if (this.partida != other.partida) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DetalleReqArticuloPK[ fkRequisicion=" + fkRequisicion + ", partida=" + partida + " ]";
    }
    
}
