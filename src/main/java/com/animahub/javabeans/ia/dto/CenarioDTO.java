package com.animahub.javabeans.ia.dto;

public class CenarioDTO {
    private String id;
    private String titulo;
    private String descricaoContexto;
    private String objetivoSoftSkill;

    public CenarioDTO() {}

    public CenarioDTO(String id, String titulo, String descricaoContexto, String objetivoSoftSkill) {
        this.id = id;
        this.titulo = titulo;
        this.descricaoContexto = descricaoContexto;
        this.objetivoSoftSkill = objetivoSoftSkill;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricaoContexto() { return descricaoContexto; }
    public void setDescricaoContexto(String descricaoContexto) { this.descricaoContexto = descricaoContexto; }
    public String getObjetivoSoftSkill() { return objetivoSoftSkill; }
    public void setObjetivoSoftSkill(String objetivoSoftSkill) { this.objetivoSoftSkill = objetivoSoftSkill; }
}
