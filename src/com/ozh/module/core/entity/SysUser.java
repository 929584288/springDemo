/*
 * Web Site: http://www.ozh.com
 * Since 2010 - 2016
 */

package com.ozh.module.core.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ozh.common.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "sys_user")
public class SysUser extends  BaseEntity<Long>{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "SysUser";
	public static final String SYS_USER_ID = "sysUserId";
	public static final String LOGIN_ID = "loginId";
	public static final String IS_ADMIN = "isAdmin";
	public static final String USER_NAME = "userName";
	public static final String USER_PSW = "userPsw";
	public static final String USER_MOBILE = "userMobile";
	public static final String USER_TEL = "userTel";
	public static final String USER_SEX_CODE = "userSexCode";
	public static final String USER_EMAIL = "userEmail";
	public static final String REGISTER_DATE = "registerDate";
	public static final String REG_ORG_ID = "regOrgId";
	public static final String USER_ICON = "userIcon";
	public static final String LAST_PSW_MISTAKE_TIME = "lastPswMistakeTime";
	public static final String REMAIN_PSW_MISTAKE_TIMES = "remainPswMistakeTimes";
	public static final String IS_DELETE = "isDelete";
	public static final String LAST_PSW_MODIFY_TIME = "lastPswModifyTime";
	public static final String LAST_BUY_TIME = "lastBuyTime";
	
	//date formats
	public static final String FORMAT_REGISTER_DATE = DATE_FORMAT;
	public static final String FORMAT_LAST_PSW_MISTAKE_TIME = DATE_FORMAT;
	public static final String FORMAT_LAST_PSW_MODIFY_TIME = DATE_FORMAT;
	public static final String FORMAT_LAST_BUY_TIME = DATE_FORMAT;
	
	
	//columns START
	/**
	 * sysUserId	   db_column: SYS_USER_ID 
	 */	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SYS_USER_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 10)
	private Integer sysUserId;
	/**
	 * loginId	   db_column: LOGIN_ID 
	 */	
	@Column(name = "LOGIN_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 32)
	private String loginId;
	/**
	 * isAdmin	   db_column: IS_ADMIN 
	 */	
	@Column(name = "IS_ADMIN", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
	private String isAdmin;
	/**
	 * userName	   db_column: USER_NAME 
	 */	
	@Column(name = "USER_NAME", unique = false, nullable = false, insertable = true, updatable = true, length = 48)
	private String userName;
	/**
	 * userPsw	   db_column: USER_PSW 
	 */	
	@Column(name = "USER_PSW", unique = false, nullable = false, insertable = true, updatable = true, length = 32)
	private String userPsw;
	/**
	 * userMobile	   db_column: USER_MOBILE 
	 */	
	@Column(name = "USER_MOBILE", unique = false, nullable = true, insertable = true, updatable = true, length = 24)
	private String userMobile;
	/**
	 * userTel	   db_column: USER_TEL 
	 */	
	@Column(name = "USER_TEL", unique = false, nullable = true, insertable = true, updatable = true, length = 24)
	private String userTel;
	/**
	 * userSexCode	   db_column: USER_SEX_CODE 
	 */	
	@Column(name = "USER_SEX_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	private String userSexCode;
	/**
	 * userEmail	   db_column: USER_EMAIL 
	 */	
	@Column(name = "USER_EMAIL", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
	private String userEmail;
	/**
	 * registerDate	   db_column: REGISTER_DATE 
	 */	
	@Column(name = "REGISTER_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
	private java.util.Date registerDate;
	/**
	 * regOrgId	   db_column: REG_ORG_ID 
	 */	
	@Column(name = "REG_ORG_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	private Integer regOrgId;
	/**
	 * userIcon	   db_column: USER_ICON 
	 */	
	@Column(name = "USER_ICON", unique = false, nullable = false, insertable = true, updatable = true, length = 60)
	private String userIcon;
	/**
	 * lastPswMistakeTime	   db_column: LAST_PSW_MISTAKE_TIME 
	 */	
	@Column(name = "LAST_PSW_MISTAKE_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
	private java.util.Date lastPswMistakeTime;
	/**
	 * remainPswMistakeTimes	   db_column: REMAIN_PSW_MISTAKE_TIMES 
	 */	
	@Column(name = "REMAIN_PSW_MISTAKE_TIMES", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
	private Integer remainPswMistakeTimes;
	/**
	 * isDelete	   db_column: IS_DELETE 
	 */	
	@Column(name = "IS_DELETE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	private String isDelete;
	/**
	 * lastPswModifyTime	   db_column: LAST_PSW_MODIFY_TIME 
	 */	
	@Column(name = "LAST_PSW_MODIFY_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
	private java.util.Date lastPswModifyTime;
	/**
	 * lastBuyTime	   db_column: LAST_BUY_TIME 
	 */	
	@Column(name = "LAST_BUY_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
	private java.util.Date lastBuyTime;
	//columns END

	public SysUser(){
	}

	public SysUser(
		Integer sysUserId
	){
		this.sysUserId = sysUserId;
	}

	public void setSysUserId(Integer value) {
		this.sysUserId = value;
	}
	
	public Integer getSysUserId() {
		return this.sysUserId;
	}
	public void setLoginId(String value) {
		this.loginId = value;
	}
	
	public String getLoginId() {
		return this.loginId;
	}
	public void setIsAdmin(String value) {
		this.isAdmin = value;
	}
	
	public String getIsAdmin() {
		return this.isAdmin;
	}
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserPsw(String value) {
		this.userPsw = value;
	}
	
	public String getUserPsw() {
		return this.userPsw;
	}
	public void setUserMobile(String value) {
		this.userMobile = value;
	}
	
	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserTel(String value) {
		this.userTel = value;
	}
	
	public String getUserTel() {
		return this.userTel;
	}
	public void setUserSexCode(String value) {
		this.userSexCode = value;
	}
	
	public String getUserSexCode() {
		return this.userSexCode;
	}
	public void setUserEmail(String value) {
		this.userEmail = value;
	}
	
	public String getUserEmail() {
		return this.userEmail;
	}
	public String getRegisterDateString() {
		return DateConvertUtils.format(getRegisterDate(), FORMAT_REGISTER_DATE);
	}
	public void setRegisterDateString(String value) {
		setRegisterDate(DateConvertUtils.parse(value, FORMAT_REGISTER_DATE,java.util.Date.class));
	}
	
	public void setRegisterDate(java.util.Date value) {
		this.registerDate = value;
	}
	
	public java.util.Date getRegisterDate() {
		return this.registerDate;
	}
	public void setRegOrgId(Integer value) {
		this.regOrgId = value;
	}
	
	public Integer getRegOrgId() {
		return this.regOrgId;
	}
	public void setUserIcon(String value) {
		this.userIcon = value;
	}
	
	public String getUserIcon() {
		return this.userIcon;
	}
	public String getLastPswMistakeTimeString() {
		return DateConvertUtils.format(getLastPswMistakeTime(), FORMAT_LAST_PSW_MISTAKE_TIME);
	}
	public void setLastPswMistakeTimeString(String value) {
		setLastPswMistakeTime(DateConvertUtils.parse(value, FORMAT_LAST_PSW_MISTAKE_TIME,java.util.Date.class));
	}
	
	public void setLastPswMistakeTime(java.util.Date value) {
		this.lastPswMistakeTime = value;
	}
	
	public java.util.Date getLastPswMistakeTime() {
		return this.lastPswMistakeTime;
	}
	public void setRemainPswMistakeTimes(Integer value) {
		this.remainPswMistakeTimes = value;
	}
	
	public Integer getRemainPswMistakeTimes() {
		return this.remainPswMistakeTimes;
	}
	public void setIsDelete(String value) {
		this.isDelete = value;
	}
	
	public String getIsDelete() {
		return this.isDelete;
	}
	public String getLastPswModifyTimeString() {
		return DateConvertUtils.format(getLastPswModifyTime(), FORMAT_LAST_PSW_MODIFY_TIME);
	}
	public void setLastPswModifyTimeString(String value) {
		setLastPswModifyTime(DateConvertUtils.parse(value, FORMAT_LAST_PSW_MODIFY_TIME,java.util.Date.class));
	}
	
	public void setLastPswModifyTime(java.util.Date value) {
		this.lastPswModifyTime = value;
	}
	
	public java.util.Date getLastPswModifyTime() {
		return this.lastPswModifyTime;
	}
	public String getLastBuyTimeString() {
		return DateConvertUtils.format(getLastBuyTime(), FORMAT_LAST_BUY_TIME);
	}
	public void setLastBuyTimeString(String value) {
		setLastBuyTime(DateConvertUtils.parse(value, FORMAT_LAST_BUY_TIME,java.util.Date.class));
	}
	
	public void setLastBuyTime(java.util.Date value) {
		this.lastBuyTime = value;
	}
	
	public java.util.Date getLastBuyTime() {
		return this.lastBuyTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("SYS_USER_ID",getSysUserId())
			.append("LOGIN_ID",getLoginId())
			.append("IS_ADMIN",getIsAdmin())
			.append("USER_NAME",getUserName())
			.append("USER_PSW",getUserPsw())
			.append("USER_MOBILE",getUserMobile())
			.append("USER_TEL",getUserTel())
			.append("USER_SEX_CODE",getUserSexCode())
			.append("USER_EMAIL",getUserEmail())
			.append("REGISTER_DATE",getRegisterDate())
			.append("REG_ORG_ID",getRegOrgId())
			.append("USER_ICON",getUserIcon())
			.append("LAST_PSW_MISTAKE_TIME",getLastPswMistakeTime())
			.append("REMAIN_PSW_MISTAKE_TIMES",getRemainPswMistakeTimes())
			.append("IS_DELETE",getIsDelete())
			.append("LAST_PSW_MODIFY_TIME",getLastPswModifyTime())
			.append("LAST_BUY_TIME",getLastBuyTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSysUserId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(this.getSysUserId() == null){
			return false;
		}
		if(!(obj instanceof SysUser)){
			return false;
		}
		if(this == obj) {
			return true;
		}
		SysUser other = (SysUser)obj;
		return new EqualsBuilder()
			.append(getSysUserId(),other.getSysUserId())
			.isEquals();
	}
}

