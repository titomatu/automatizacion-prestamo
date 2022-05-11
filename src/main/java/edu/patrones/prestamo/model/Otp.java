package edu.patrones.prestamo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "OTP_DATOS")
public class Otp implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 8210108450348949087L;

	@Id
    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Id
    @Column(name = "numero_documento")
    private Long numeroDocumento;

    @Column(name = "correoElectronico")
    private String correoElectronico;

    @Column(name = "vlrOtp_E")
    private String vlrOtpE;
}
