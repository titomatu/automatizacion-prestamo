package edu.patrones.prestamo.model.dto;

public class OtpDtoE {

    private String tipoDocumento;
    private Long numeroDocumento;
    private String correoElectronico;
	private String vlrOtpE;
	
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Long getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getVlrOtpE() {
		return vlrOtpE;
	}
	public void setVlrOtpE(String vlrOtpE) {
		this.vlrOtpE = vlrOtpE;
	}
}
