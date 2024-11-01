package br.com.senac.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/olaMundo")
public class OlaMundoController {
    @GetMapping("/teste")
    public ResponseEntity<String> olaMundo() {
        return ResponseEntity.ok("Ola");
    }
}
