package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    /* Usaremos as anotações JPA para fazer o mapeamento das entidades e criar todo o modelo de dados */

    /*Como essa class é uma entidade é obrigatório adicionar a anotação @Id (Chave Primaria)*/
    @Id
    /*Delegamos para o BD a geração de chave primaria*/
    /* Com o  GenerationType.IDENTITY define auto increment*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    /*@Column(nullable = false) vamos definir como campo obrigatório*/
    @Column(nullable = false)
    private PhoneType type;
    @Column(nullable = false)
    private String number;


}
