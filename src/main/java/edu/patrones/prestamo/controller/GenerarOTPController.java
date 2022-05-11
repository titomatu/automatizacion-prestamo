package edu.patrones.prestamo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.patrones.prestamo.model.dto.OtpDtoE;
import edu.patrones.prestamo.model.dto.OtpDtoS;


@RestController
@RequestMapping(path = "/Otp")
public class GenerarOTPController {
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json",  path = "/getData")
	public @ResponseBody OtpDtoS getData() {
		OtpDtoS resultado = new OtpDtoS();
		int length = 4;
		resultado.setVlrOtp(OTP(length));
		resultado.setCode(200);
		resultado.setMensaje("OTP GENERADA");
		return resultado;
		
	}


	@RequestMapping(method = RequestMethod.POST, 
			consumes = "application/json", produces = "application/json",
			path = "/postData")
	public @ResponseBody OtpDtoS postData(@RequestBody OtpDtoE request) {
		OtpDtoS resultado = new OtpDtoS();
		
		if(request.getVlrOtpE().equals("") ) {
			int length = 4;
			resultado.setVlrOtp(OTP(length));
			resultado.setCode(200);
			resultado.setMensaje("OTP GENERADA" + request.getCorreoElectronico());
			String correo = request.getCorreoElectronico();
			String prueba = String.valueOf(resultado.getVlrOtp());
			String mensajemail = "PRUEBA ENVIO CORREO" + prueba + "CON OTEPE GENERADA";
			System.out.print("LLEGO AQUI ..... " + correo + "--" + prueba);
		    //EnvioCorreo envioCorreo = new EnvioCorreo();
			SimpleMailMessage email = new SimpleMailMessage();
			email.setTo("luisfernando.sabroso@bbva.com");
            email.setSubject("OTP ENROLAMIENTo");
            email.setText(mensajemail);
            System.out.print("LLEGO AQUI ..... " + email.getTo() + "--" + email.getSubject() + "--" + email.getText());
            //mailSender.send(email);
			//return resultado;
		}else {
               System.out.print("AQUI LOGICA PARA PERSISTIR" + request.getCorreoElectronico());
		}
		return resultado;
	}
	
	static char[] OTP(int len)
    {
        System.out.println("Generating OTP using random() : ");
        System.out.print("You OTP is : ");
  
        // Using numeric values
        String numbers = "0123456789";
  
        // Using random method
        Random rndm_method = new Random();
  
        char[] otp = new char[len];
  
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] =
             numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        
        
        return otp;
    }
	
    @Autowired
    private static JavaMailSender mailSender;

    //Pasamos por parametro: destinatario, asunto y el mensaje
    public void sendEmail(String to, String subject, String content) {

        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo(to);
        email.setSubject(subject);
        email.setText(content);
        System.out.print("LLEGO AQUI ..... " + email.getTo() + "--" + email.getSubject() + "--" + email.getText());
        try {
			mailSender.send(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
