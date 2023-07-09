package com.edufelizardo.api.maissaudepublica.models.enuns;
/**
 * @author Eduardo Felizardo Cândido
 * @version 0.00.00
 * @apiNote Mais Saúde Pública 07/2023
 */
public enum Especialidade {
    ALERGOLOGIA("Alergologia"),
    ANESTESIOLOGIA("Anestesiologia"),
    ANGIOLOGIA("Angiologia"),
    CANCEROLOGIA("Cancerologia"),
    CARDIOLOGIA("Cardiologia"),
    CIRURGIA_CARDIOVASCULAR("Cirurgia Cardiovascular"),
    CIRURGIA_DA_MAO("Cirurgia da Mão"),
    CIRURGIA_CABECA_PESCOCO("Cirurgia de Cabeça e Pescoço"),
    CIRURGIA_APARELHO_DIGESTIVO("Cirurgia do Aparelho Digestivo"),
    CIRURGIA_GERAL("Cirurgia Geral"),
    CIRURGIA_PEDIATRICA("Cirurgia Pediátrica"),
    CIRURGIA_PLASTICA("Cirurgia Plástica"),
    CIRURGIA_TORACICA("Cirurgia Torácica"),
    CIRURGIA_VASCULAR("Cirurgia Vascular"),
    CLINICA_MEDICA("Clínica Médica"),
    COLOPROCTOLOGIA("Coloproctologia"),
    DERMATOLOGIA("Dermatologia"),
    ENDOCRINOLOGIA_METABOLOGIA("Endocrinologia e Metabologia"),
    ENDOSCOPIA("Endoscopia"),
    GASTROENTEROLOGIA("Gastroenterologia"),
    GENETICA_MEDICA("Genética Médica"),
    GERIATRIA("Geriatria"),
    GINECOLOGIA_OBSTETRICIA("Ginecologia e Obstetrícia"),
    HEMATOLOGIA_HEMOTERAPIA("Hematologia e Hemoterapia"),
    HOMEOPATIA("Homeopatia"),
    INFECTOLOGIA("Infectologia"),
    MASTOLOGIA("Mastologia"),
    MEDICINA_EMERGENCIA("Medicina de Emergência"),
    MEDICINA_FAMILIA_COMUNIDADE("Medicina de Família e Comunidade"),
    MEDICINA_TRABALHO("Medicina do Trabalho"),
    MEDICINA_ESPORTIVA("Medicina Esportiva"),
    MEDICINA_FISICA_REABILITACAO("Medicina Física e Reabilitação"),
    MEDICINA_INTENSIVA("Medicina Intensiva"),
    MEDICINA_LEGAL_PERICIA_MEDICA("Medicina Legal e Perícia Médica"),
    MEDICINA_NUCLEAR("Medicina Nuclear"),
    MEDICINA_PREVENTIVA_SOCIAL("Medicina Preventiva e Social"),
    NEFROLOGIA("Nefrologia"),
    NEUROCIRURGIA("Neurocirurgia"),
    NEUROLOGIA("Neurologia"),
    NUTROLOGIA("Nutrologia"),
    OFTALMOLOGIA("Oftalmologia"),
    ONCOLOGIA("Oncologia"),
    ORTOPEDIA_TRAUMATOLOGIA("Ortopedia e Traumatologia"),
    OTORRINOLARINGOLOGIA("Otorrinolaringologia"),
    PATOLOGIA("Patologia"),
    PATOLOGIA_CLINICA_MEDICINA_LABORATORIAL("Patologia Clínica / Medicina Laboratorial"),
    PEDIATRIA("Pediatria"),
    PNEUMOLOGIA("Pneumologia"),
    PSIQUIATRIA("Psiquiatria"),
    RADIOLOGIA_DIAGNOSTICO_IMAGEM("Radiologia e Diagnóstico por Imagem"),
    RADIOTERAPIA("Radioterapia"),
    REUMATOLOGIA("Reumatologia"),
    UROLOGIA("Urologia");

    private String descricao;

    Especialidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
