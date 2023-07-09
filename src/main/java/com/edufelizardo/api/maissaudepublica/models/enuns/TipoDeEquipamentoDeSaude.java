package com.edufelizardo.api.maissaudepublica.models.enuns;
/**
 * @author Eduardo Felizardo Cândido
 * @version 0.00.00
 * @apiNote Mais Saúde Pública 07/2023
 */
public enum TipoDeEquipamentoDeSaude {
    UBS("Unidade Básica de Saúde"),
    UPA("Unidade de Pronto Atendimento"),
    HOSPITAL("Hospital"),
    CLINICA("Clínica"),
    MATERNIDADE("Maternidade"),
    AMBULATORIO("Ambulatório"),
    POSTO_DE_SAUDE("Posto de Saúde"),
    CENTRO_DE_SAUDE("Centro de Saúde"),
    LABORATORIO("Laboratório"),
    FARMACIA("Farmácia"),
    CONSULTORIO_MEDICO("Consultório Médico"),
    CONSULTORIO_ODONTOLOGICO("Consultório Odontológico"),
    CENTRO_DIAGNOSTICO("Centro de Diagnóstico"),
    CENTRO_CIRURGICO("Centro Cirúrgico"),
    CENTRO_REABILITACAO("Centro de Reabilitação"),
    HEMOCENTRO("Hemocentro"),
    SERVICO_DE_EMERGENCIA("Serviço de Emergência"),
    CENTRO_SAUDE_MENTAL("Centro de Saúde Mental"),
    CASA_DE_REPOUSO("Casa de Repouso"),
    ILPI("Instituição de Longa Permanência para Idosos (ILPI)");

    private String descricao;

    TipoDeEquipamentoDeSaude(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
