package edu.patrones.prestamo.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.patrones.prestamo.model.dto.OtpDto;

@RestController
@RequestMapping(path = "/Otp")
public class GenerarOTPController {
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json",  path = "/getData")
	public @ResponseBody OtpDto getData() {
		OtpDto resultado = new OtpDto();
		int length = 4;
		resultado.setVlrOtp(OTP(length));
		resultado.setCode(200);
		resultado.setMensaje("OTP GENERADA");
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

}
