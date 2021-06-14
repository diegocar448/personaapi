package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
<<<<<<< HEAD
import one.digitalinnovation.personapi.service.PersonService;
=======
import one.digitalinnovation.personapi.repository.PersonRepository;
>>>>>>> parent of 6273f0e (Estruturando a camada Service)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@Validated
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
<<<<<<< HEAD
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
=======
    /* Passamos o corpo da requisição no parâmetro do método
        e informamos que esta passando no corpo da Requisição com @RequestBody
     */
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
>>>>>>> parent of 6273f0e (Estruturando a camada Service)
    }

    /*BD JDBC URL = jdbc:h2:mem:testdb*/



}
