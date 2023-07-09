package com.edufelizardo.api.maissaudepublica.dtos;

import com.edufelizardo.api.maissaudepublica.models.Endereco;
import com.edufelizardo.api.maissaudepublica.models.enuns.TipoDeEquipamentoDeSaude;

import java.util.HashSet;
import java.util.Set;

public record EquipamentoDeSaudeDto(
        String nome,
        EnderecoDto endereco,
        TipoDeEquipamentoDeSaude tipoDeEquipamentoDeSaude,
        Integer numeroDeLeitos
) {
}
