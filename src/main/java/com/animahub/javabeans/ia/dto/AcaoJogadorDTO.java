package com.animahub.javabeans.ia.dto;

public class AcaoJogadorDTO {
    private String sessionId;
    private String resposta;

    public AcaoJogadorDTO() {}

    public AcaoJogadorDTO(String sessionId, String resposta) {
        this.sessionId = sessionId;
        this.resposta = resposta;
    }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }
    public String getResposta() { return resposta; }
    public void setResposta(String resposta) { this.resposta = resposta; }
}
