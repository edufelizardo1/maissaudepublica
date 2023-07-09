package com.edufelizardo.api.maissaudepublica.models;

import lombok.*;

/**
 * @author Eduardo Felizardo Cândido
 * @version 0.00.00
 * @apiNote Mais Saúde Pública 07/2023
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Endereco {
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private long ibge;
    private long gia;
    private Integer ddd;
    private Integer siafi;
}
