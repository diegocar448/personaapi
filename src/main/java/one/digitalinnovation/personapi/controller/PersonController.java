package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*RestController significa que é um controller de uma API Rest*/
@RestController
/*Mostra o caminho principal de acesso a nossa API*/
@RequestMapping("/api/v1/people")
public class PersonController {

    /*Mapeando uma rota com o verbo HTTP do tipo GET*/
    @GetMapping
    public String getBook(){
        return "API Test!";
    }



}
