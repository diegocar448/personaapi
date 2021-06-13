package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*RestController significa que é um controller de uma API Rest*/
@RestController
/*Mostra o caminho principal de acesso a nossa API*/
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    /*@Autowired Aqui ele injeta uma implementação do tipo PersonRepository*/
    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /*Mapeando uma rota com o verbo HTTP do tipo GET/POST(para criação)*/
    //@GetMapping
    @PostMapping
    /* Passamos o corpo da requisição no parâmetro do método
        e informamos que esta passando no corpo da Requisição com @RequestBody
     */
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

    /*BD JDBC URL = jdbc:h2:mem:testdb*/



}
