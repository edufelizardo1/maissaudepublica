package com.edufelizardo.api.maissaudepublica.models;

import com.edufelizardo.api.maissaudepublica.models.enuns.Especialidade;
import com.edufelizardo.api.maissaudepublica.models.enuns.TipoDeEquipamentoDeSaude;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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
public class EquipamentoDeSaude {
    private Long ID;
    private String nome;
    private Endereco endereco;
    private Set<String> Telefones = new HashSet<>();
    private TipoDeEquipamentoDeSaude tipoDeEquipamentoDeSaude;
    private Integer numeroDeLeitos;
    private Set<Especialidade> especialidades = new HashSet<>();
}
