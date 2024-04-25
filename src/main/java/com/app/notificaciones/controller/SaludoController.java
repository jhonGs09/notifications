
package com.app.notificaciones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/saludo")
    public String HolaMundo() {
        return "hola mundo!";
    }

    @GetMapping("/saludoname/{nombre}/{edad}")
    public String HolaMundoName(@PathVariable String nombre,
            @PathVariable String edad) {
        return "hola mundo!" + nombre + "Tu edad es: " + edad;
    }
}
