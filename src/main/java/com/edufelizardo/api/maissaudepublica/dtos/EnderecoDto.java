package com.edufelizardo.api.maissaudepublica.dtos;

public record EnderecoDto(
        String cep,
        String logradouro,
        Integer numero,
        String complemento,
        String bairro,
        String localidade,
        String uf
) {
}
