package one.digitalinnovation.personapi.dto.response.mapper;

import one.digitalinnovation.personapi.dto.response.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


/*@Mapper anotação que indica que a classe mapper irá processar*/
@Mapper(componentModel = "spring")
public interface PersonMapper {

    /*Aqui definimos que a data terá apenas dia, mês e ano*/
    /*@Mapping informamos o alvo*/
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
