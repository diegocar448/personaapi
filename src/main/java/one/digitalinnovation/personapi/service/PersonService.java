package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*@Service indica que essa camada terá todas regras de negocio*/
@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /*Mapeando uma rota com o verbo HTTP do tipo GET/POST(para criação)*/
    //@GetMapping
    @PostMapping
    /* Passamos o corpo da requisição no parâmetro do método
        e informamos que esta passando no corpo da Requisição com @RequestBody, indica se chegou 1 json
     */
    public MessageResponseDTO createPerson(PersonDTO personDTO){
        /*Fazer a conversao de DTO para Pessoas*/
        Person personToSave = Person.builder()
                .firstName(personDTO.getFirstName())
                .lastName(personDTO.getLastName())
                .birthDate(personDTO.getBirthDate())
                .phones(personDTO.getPhones())
                .build();

        Person savedPerson = personRepository.save(personDTO);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

    /*BD JDBC URL = jdbc:h2:mem:testdb*/


}
