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
@Table(name = "vw_aspnet_MembershipUsers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwaspnetMembershipUsers.findAll", query = "SELECT v FROM VwaspnetMembershipUsers v"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByUserId", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.userId = :userId"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByPasswordFormat", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.passwordFormat = :passwordFormat"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByMobilePIN", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.mobilePIN = :mobilePIN"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByEmail", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.email = :email"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByLoweredEmail", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.loweredEmail = :loweredEmail"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByPasswordQuestion", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.passwordQuestion = :passwordQuestion"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByPasswordAnswer", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.passwordAnswer = :passwordAnswer"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByIsApproved", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.isApproved = :isApproved"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByIsLockedOut", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.isLockedOut = :isLockedOut"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByCreateDate", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.createDate = :createDate"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByLastLoginDate", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.lastLoginDate = :lastLoginDate"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByLastPasswordChangedDate", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.lastPasswordChangedDate = :lastPasswordChangedDate"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByLastLockoutDate", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.lastLockoutDate = :lastLockoutDate"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByFailedPasswordAttemptCount", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.failedPasswordAttemptCount = :failedPasswordAttemptCount"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByFailedPasswordAttemptWindowStart", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.failedPasswordAttemptWindowStart = :failedPasswordAttemptWindowStart"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByFailedPasswordAnswerAttemptCount", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.failedPasswordAnswerAttemptCount = :failedPasswordAnswerAttemptCount"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByFailedPasswordAnswerAttemptWindowStart", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.failedPasswordAnswerAttemptWindowStart = :failedPasswordAnswerAttemptWindowStart"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByComment", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.comment = :comment"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByApplicationId", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.applicationId = :applicationId"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByUserName", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.userName = :userName"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByMobileAlias", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.mobileAlias = :mobileAlias"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByIsAnonymous", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.isAnonymous = :isAnonymous"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByLastActivityDate", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.lastActivityDate = :lastActivityDate"),
    @NamedQuery(name = "VwaspnetMembershipUsers.findByPassword", query = "SELECT v FROM VwaspnetMembershipUsers v WHERE v.password = :password")})
public class VwaspnetMembershipUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "UserId")
    @Id
    private String userId;
    @Basic(optional = false)
    @Column(name = "PasswordFormat")
    private int passwordFormat;
    @Column(name = "MobilePIN")
    private String mobilePIN;
    @Column(name = "Email")
    private String email;
    @Column(name = "LoweredEmail")
    private String loweredEmail;
    @Column(name = "PasswordQuestion")
    private String passwordQuestion;
    @Column(name = "PasswordAnswer")
    private String passwordAnswer;
    @Basic(optional = false)
    @Column(name = "IsApproved")
    private boolean isApproved;
    @Basic(optional = false)
    @Column(name = "IsLockedOut")
    private boolean isLockedOut;
    @Basic(optional = false)
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "LastLoginDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @Basic(optional = false)
    @Column(name = "LastPasswordChangedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPasswordChangedDate;
    @Basic(optional = false)
    @Column(name = "LastLockoutDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLockoutDate;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAttemptCount")
    private int failedPasswordAttemptCount;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAttemptWindowStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date failedPasswordAttemptWindowStart;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAnswerAttemptCount")
    private int failedPasswordAnswerAttemptCount;
    @Basic(optional = false)
    @Column(name = "FailedPasswordAnswerAttemptWindowStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date failedPasswordAnswerAttemptWindowStart;
    @Column(name = "Comment")
    private String comment;
    @Basic(optional = false)
    @Column(name = "ApplicationId")
    private String applicationId;
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Column(name = "MobileAlias")
    private String mobileAlias;
    @Basic(optional = false)
    @Column(name = "IsAnonymous")
    private boolean isAnonymous;
    @Basic(optional = false)
    @Column(name = "LastActivityDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivityDate;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;

    public VwaspnetMembershipUsers() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPasswordFormat() {
        return passwordFormat;
    }

    public void setPasswordFormat(int passwordFormat) {
        this.passwordFormat = passwordFormat;
    }

    public String getMobilePIN() {
        return mobilePIN;
    }

    public void setMobilePIN(String mobilePIN) {
        this.mobilePIN = mobilePIN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoweredEmail() {
        return loweredEmail;
    }

    public void setLoweredEmail(String loweredEmail) {
        this.loweredEmail = loweredEmail;
    }

    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    public void setPasswordQuestion(String passwordQuestion) {
        this.passwordQuestion = passwordQuestion;
    }

    public String getPasswordAnswer() {
        return passwordAnswer;
    }

    public void setPasswordAnswer(String passwordAnswer) {
        this.passwordAnswer = passwordAnswer;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public boolean getIsLockedOut() {
        return isLockedOut;
    }

    public void setIsLockedOut(boolean isLockedOut) {
        this.isLockedOut = isLockedOut;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastPasswordChangedDate() {
        return lastPasswordChangedDate;
    }

    public void setLastPasswordChangedDate(Date lastPasswordChangedDate) {
        this.lastPasswordChangedDate = lastPasswordChangedDate;
    }

    public Date getLastLockoutDate() {
        return lastLockoutDate;
    }

    public void setLastLockoutDate(Date lastLockoutDate) {
        this.lastLockoutDate = lastLockoutDate;
    }

    public int getFailedPasswordAttemptCount() {
        return failedPasswordAttemptCount;
    }

    public void setFailedPasswordAttemptCount(int failedPasswordAttemptCount) {
        this.failedPasswordAttemptCount = failedPasswordAttemptCount;
    }

    public Date getFailedPasswordAttemptWindowStart() {
        return failedPasswordAttemptWindowStart;
    }

    public void setFailedPasswordAttemptWindowStart(Date failedPasswordAttemptWindowStart) {
        this.failedPasswordAttemptWindowStart = failedPasswordAttemptWindowStart;
    }

    public int getFailedPasswordAnswerAttemptCount() {
        return failedPasswordAnswerAttemptCount;
    }

    public void setFailedPasswordAnswerAttemptCount(int failedPasswordAnswerAttemptCount) {
        this.failedPasswordAnswerAttemptCount = failedPasswordAnswerAttemptCount;
    }

    public Date getFailedPasswordAnswerAttemptWindowStart() {
        return failedPasswordAnswerAttemptWindowStart;
    }

    public void setFailedPasswordAnswerAttemptWindowStart(Date failedPasswordAnswerAttemptWindowStart) {
        this.failedPasswordAnswerAttemptWindowStart = failedPasswordAnswerAttemptWindowStart;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileAlias() {
        return mobileAlias;
    }

    public void setMobileAlias(String mobileAlias) {
        this.mobileAlias = mobileAlias;
    }

    public boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
