package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    /*Que ele vai enviar uma data formato dia/mês/ano */
    //@Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    /*Para converter um model/entidade em um formato para o BD*/
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
