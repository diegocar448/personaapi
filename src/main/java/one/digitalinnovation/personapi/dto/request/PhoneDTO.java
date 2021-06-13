package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    /*Bean uma forma de fazer validação de dados no sistema*/
    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    /*As vamos limitar o tamanho do campo informado*/
    @Size
    private String number;
}
