package edu.patrones.prestamo.controller;

import edu.patrones.prestamo.model.dto.SolicitudDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/solicitud")
public class SolicitudController {

    @PostMapping(value = "/radicar")
    public ResponseEntity<SolicitudDto> fileApplication(@RequestBody SolicitudDto solicitudDto){

        return new ResponseEntity<>(solicitudDto, HttpStatus.OK);
    }
}
