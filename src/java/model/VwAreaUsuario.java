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
@Table(name = "vw_AreaUsuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwAreaUsuario.findAll", query = "SELECT v FROM VwAreaUsuario v"),
    @NamedQuery(name = "VwAreaUsuario.findByNomArea", query = "SELECT v FROM VwAreaUsuario v WHERE v.nomArea = :nomArea"),
    @NamedQuery(name = "VwAreaUsuario.findByUserName", query = "SELECT v.nomArea FROM VwAreaUsuario v WHERE v.userName = :userName"),
    @NamedQuery(name = "VwAreaUsuario.findByComment", query = "SELECT v FROM VwAreaUsuario v WHERE v.comment = :comment")})
public class VwAreaUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NomArea")
    @Id
    private String nomArea;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Column(name = "Comment")
    private String comment;

    public VwAreaUsuario() {
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
