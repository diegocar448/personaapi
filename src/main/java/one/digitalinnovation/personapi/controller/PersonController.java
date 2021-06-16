package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*@RestController significa que é um controller que será acessado por uma apiRest*/
@RestController
/*@RequestMapping mostrando qual será o caminho principal para a nossa api*/
@RequestMapping("/api/v1/people")
public class PersonController {

    /*@GetMapping um operação do tipo http usando verbo Get*/
    @GetMapping
    public String getBook(){
        return "API test!";
    }


}
