package com.csen160.B_reflections.Examples;

import javax.persistence.IdClass;

/**
 * 
 */
@Deprecated
public class SecretClass {
    public long myNumbers[]= {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4, 6, 2, 6, 4, 3, 3, 8, 3, 2, 7, 9};
	private final String login;
	private final String password;
	private final int loginId;
	private final String cryptMessage;
	private String decryptMessage;
	
	/**
	 * 
	 * @return
	 */
    @SuppressWarnings({"unused"})
	private static String getSecretMission() {
		return "36423846236764852384876856";
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	public int getLoginId() {
		return loginId;
	}

	/**
	 * 
	 * @return
	 */
	public String getCryptMessage() {
		return cryptMessage;
	}

	/**
	 * 
	 * @return
	 */
	public String getDecryptMessage() {
		return decryptMessage;
	}
	
	/**
	 * 
	 * @param decryptMessage
	 */
	private final void setDecryptMessage(String decryptMessage) {
		this.decryptMessage=decryptMessage;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "SecretClass [login=" + login + ", password=" + password + ", loginId=" + loginId + ", cryptMessage="
				+ cryptMessage + ", decryptMessage=" + decryptMessage + "]";
	}
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @param loginId
	 * @param cryptMessage
	 * @param decryptMessage
	 */
	public SecretClass(String login, String password, int loginId, String cryptMessage, String decryptMessage) {
		super();
		this.login = login;
		this.password = password;
		this.loginId = loginId;
		this.cryptMessage = cryptMessage;
		this.decryptMessage = decryptMessage;
	}
}