package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.response.request.PersonDTO;

import one.digitalinnovation.personapi.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

@SpringBootTest
public class PersonUtils {

    private static final String FIRST_NAME = "Diego";
    private static final String LAST_NAME = "Cardoso";
    private static final String CPF_NUMBER = "123.321.159.88";
    private static final Long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1985, 10, 2);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("04-04-2020")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();

    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf("123.321.123.44")
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

}
