package com.animahub.javabeans.ia.dto;

public class AvaliacaoDTO {
    private int xpGanho;
    private String feedbackEducativo;
    private boolean personaQuebrada;
    private boolean cenarioConcluido;

    public AvaliacaoDTO() {}

    public AvaliacaoDTO(int xpGanho, String feedbackEducativo, boolean personaQuebrada, boolean cenarioConcluido) {
        this.xpGanho = xpGanho;
        this.feedbackEducativo = feedbackEducativo;
        this.personaQuebrada = personaQuebrada;
        this.cenarioConcluido = cenarioConcluido;
    }

    public int getXpGanho() { return xpGanho; }
    public void setXpGanho(int xpGanho) { this.xpGanho = xpGanho; }
    public String getFeedbackEducativo() { return feedbackEducativo; }
    public void setFeedbackEducativo(String feedbackEducativo) { this.feedbackEducativo = feedbackEducativo; }
    public boolean isPersonaQuebrada() { return personaQuebrada; }
    public void setPersonaQuebrada(boolean personaQuebrada) { this.personaQuebrada = personaQuebrada; }
    public boolean isCenarioConcluido() { return cenarioConcluido; }
    public void setCenarioConcluido(boolean cenarioConcluido) { this.cenarioConcluido = cenarioConcluido; }
}
