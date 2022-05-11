package edu.patrones.prestamo.model.dto;

public class OtpDtoS {

	private char[] vlrOtp;
	private int code;
	private String mensaje;
	
	public char[] getVlrOtp() {
		return vlrOtp;
	}
	public void setVlrOtp(char[] vlrOtp) {
		this.vlrOtp = vlrOtp;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}	
}
