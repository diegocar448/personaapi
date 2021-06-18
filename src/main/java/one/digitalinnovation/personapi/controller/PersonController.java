package one.digitalinnovation.personapi.controller;


import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;

import one.digitalinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    /*@Autowired injeta uma implementação do tipo Repository*/
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    /*@RequestBody informamos que vamos passar os dados do tipo Person pelo corpo da requisição*/
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }


}
