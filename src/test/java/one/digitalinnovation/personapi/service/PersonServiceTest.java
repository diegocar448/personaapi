package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.response.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import one.digitalinnovation.personapi.utils.PersonUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    /*@Mock indicando que criará um objeto fake dele*/
    @Mock
    private PersonRepository personRepository;

    /*@InjectMocks indicando que irá injetar um mock na class service*/
    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage(Long id) {
        PersonDTO personDTO = PersonUtils.createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        MessageResponseDTO expectedSuccessMessage = MessageResponseDTO.builder()
                .message("Create add person de "+ id)
                .build();

        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);
        MessageResponseDTO successMessage = personService.createPerson(personDTO);

        assertEquals(expectedSuccessMessage, successMessage);
    }
}
