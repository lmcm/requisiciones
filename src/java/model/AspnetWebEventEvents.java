/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "aspnet_WebEvent_Events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AspnetWebEventEvents.findAll", query = "SELECT a FROM AspnetWebEventEvents a"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventId", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventId = :eventId"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventTimeUtc", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventTimeUtc = :eventTimeUtc"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventTime", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventTime = :eventTime"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventType", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventType = :eventType"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventSequence", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventSequence = :eventSequence"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventOccurrence", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventOccurrence = :eventOccurrence"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventCode", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventCode = :eventCode"),
    @NamedQuery(name = "AspnetWebEventEvents.findByEventDetailCode", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.eventDetailCode = :eventDetailCode"),
    @NamedQuery(name = "AspnetWebEventEvents.findByMessage", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.message = :message"),
    @NamedQuery(name = "AspnetWebEventEvents.findByApplicationPath", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.applicationPath = :applicationPath"),
    @NamedQuery(name = "AspnetWebEventEvents.findByApplicationVirtualPath", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.applicationVirtualPath = :applicationVirtualPath"),
    @NamedQuery(name = "AspnetWebEventEvents.findByMachineName", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.machineName = :machineName"),
    @NamedQuery(name = "AspnetWebEventEvents.findByRequestUrl", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.requestUrl = :requestUrl"),
    @NamedQuery(name = "AspnetWebEventEvents.findByExceptionType", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.exceptionType = :exceptionType"),
    @NamedQuery(name = "AspnetWebEventEvents.findByDetails", query = "SELECT a FROM AspnetWebEventEvents a WHERE a.details = :details")})
public class AspnetWebEventEvents implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EventId")
    private String eventId;
    @Basic(optional = false)
    @Column(name = "EventTimeUtc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventTimeUtc;
    @Basic(optional = false)
    @Column(name = "EventTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventTime;
    @Basic(optional = false)
    @Column(name = "EventType")
    private String eventType;
    @Basic(optional = false)
    @Column(name = "EventSequence")
    private BigInteger eventSequence;
    @Basic(optional = false)
    @Column(name = "EventOccurrence")
    private BigInteger eventOccurrence;
    @Basic(optional = false)
    @Column(name = "EventCode")
    private int eventCode;
    @Basic(optional = false)
    @Column(name = "EventDetailCode")
    private int eventDetailCode;
    @Column(name = "Message")
    private String message;
    @Column(name = "ApplicationPath")
    private String applicationPath;
    @Column(name = "ApplicationVirtualPath")
    private String applicationVirtualPath;
    @Basic(optional = false)
    @Column(name = "MachineName")
    private String machineName;
    @Column(name = "RequestUrl")
    private String requestUrl;
    @Column(name = "ExceptionType")
    private String exceptionType;
    @Column(name = "Details")
    private String details;

    public AspnetWebEventEvents() {
    }

    public AspnetWebEventEvents(String eventId) {
        this.eventId = eventId;
    }

    public AspnetWebEventEvents(String eventId, Date eventTimeUtc, Date eventTime, String eventType, BigInteger eventSequence, BigInteger eventOccurrence, int eventCode, int eventDetailCode, String machineName) {
        this.eventId = eventId;
        this.eventTimeUtc = eventTimeUtc;
        this.eventTime = eventTime;
        this.eventType = eventType;
        this.eventSequence = eventSequence;
        this.eventOccurrence = eventOccurrence;
        this.eventCode = eventCode;
        this.eventDetailCode = eventDetailCode;
        this.machineName = machineName;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Date getEventTimeUtc() {
        return eventTimeUtc;
    }

    public void setEventTimeUtc(Date eventTimeUtc) {
        this.eventTimeUtc = eventTimeUtc;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public BigInteger getEventSequence() {
        return eventSequence;
    }

    public void setEventSequence(BigInteger eventSequence) {
        this.eventSequence = eventSequence;
    }

    public BigInteger getEventOccurrence() {
        return eventOccurrence;
    }

    public void setEventOccurrence(BigInteger eventOccurrence) {
        this.eventOccurrence = eventOccurrence;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public int getEventDetailCode() {
        return eventDetailCode;
    }

    public void setEventDetailCode(int eventDetailCode) {
        this.eventDetailCode = eventDetailCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getApplicationPath() {
        return applicationPath;
    }

    public void setApplicationPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }

    public String getApplicationVirtualPath() {
        return applicationVirtualPath;
    }

    public void setApplicationVirtualPath(String applicationVirtualPath) {
        this.applicationVirtualPath = applicationVirtualPath;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspnetWebEventEvents)) {
            return false;
        }
        AspnetWebEventEvents other = (AspnetWebEventEvents) object;
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AspnetWebEventEvents[ eventId=" + eventId + " ]";
    }
    
}
