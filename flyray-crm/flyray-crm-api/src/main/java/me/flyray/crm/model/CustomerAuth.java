package me.flyray.crm.model;

import java.io.Serializable;

/** 
* @author: bolei
* @date：2017年3月6日 下午9:55:17 
* @description：客户授权登陆信息 
* 详情请参考  http://www.cnblogs.com/jiqing9006/p/5937733.html
*/

public class CustomerAuth implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 客户（会员）编号
	 */
	private String customerId;
	
	/**
	 * 登录类型（手机号 邮箱 用户名）或第三方应用名称（微信 微博等）
	 */
	private String identityType;
	
	/**
	 * 标识（手机号 邮箱 用户名或第三方应用的唯一标识）
	 */
	private String identifier;
	
	/**
	 * 密码凭证（站内的保存密码，站外的不保存或保存token）
	 */
	private String credential;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}
	
}
