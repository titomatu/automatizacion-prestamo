package edu.patrones.prestamo.model.dto;

public class OtpDto {

	private int code;
	private String mensaje;
	private char[] vlrOtp;
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
	public char[] getVlrOtp() {
		return vlrOtp;
	}
	public void setVlrOtp(char[] vlrOtp) {
		this.vlrOtp = vlrOtp;
	}
}
