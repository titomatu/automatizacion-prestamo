package edu.patrones.prestamo.controller;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EnvioCorreo {
	    //Importante hacer la inyección de dependencia de JavaMailSender:
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
