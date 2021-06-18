package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.response.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/*@Mapper anotação que indica que a classe mapper irá processar*/
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    /*Aqui definimos que a data terá apenas dia, mês e ano*/
    /*@Mapping informamos o alvo*/
    //@Mapping(target = "birthDay", source = "birthDate", dateFormat = "dd-MM-yyyy")

    /*toModel é uma convenção do mapStrict*/
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
