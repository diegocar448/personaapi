package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*@Service indica para o spring que a camada service será para adicionar as regras de negocio*/
@Service
public class PersonService {

    private PersonRepository personRepository;

    /*@Autowired injeta uma implementação do tipo Repository*/
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @PostMapping
    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }


}
