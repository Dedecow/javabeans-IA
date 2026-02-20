package com.animahub.javabeans.ia.dto;

public class DiagnosticoDTO {
    private String statusAplicacao;
    private boolean inteligenciaArtificialPronta;
    private String timestamp;

    public DiagnosticoDTO() {}

    public DiagnosticoDTO(String statusAplicacao, boolean inteligenciaArtificialPronta, String timestamp) {
        this.statusAplicacao = statusAplicacao;
        this.inteligenciaArtificialPronta = inteligenciaArtificialPronta;
        this.timestamp = timestamp;
    }

    public String getStatusAplicacao() { return statusAplicacao; }
    public void setStatusAplicacao(String statusAplicacao) { this.statusAplicacao = statusAplicacao; }
    public boolean isInteligenciaArtificialPronta() { return inteligenciaArtificialPronta; }
    public void setInteligenciaArtificialPronta(boolean inteligenciaArtificialPronta) { this.inteligenciaArtificialPronta = inteligenciaArtificialPronta; }
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
