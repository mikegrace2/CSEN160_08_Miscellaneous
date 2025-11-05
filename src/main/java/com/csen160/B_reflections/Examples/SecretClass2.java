package com.csen160.B_reflections.Examples;

public class SecretClass2 {
	private final String login;
	private final String password;
	private final int loginId;
	private final String cryptMessage;
	private String decryptMessage;
	
	private static String getSecretMission() {
		return "36423846236764852384876856";
	}
	
	public String getLogin() {
		return login;
	}

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
	
	private final void setDecryptMessage(String decryptMessage) {
		this.decryptMessage=decryptMessage;
	}

	@Override
	public String toString() {
		return "SecretClass [login=" + login + ", password=" + password + ", loginId=" + loginId + ", cryptMessage="
				+ cryptMessage + ", decryptMessage=" + decryptMessage + "]";
	}
	
	public SecretClass2(String login, String password, int loginId, String cryptMessage, String decryptMessage) {
		super();
		this.login = login;
		this.password = password;
		this.loginId = loginId;
		this.cryptMessage = cryptMessage;
		this.decryptMessage = decryptMessage;
	}
}