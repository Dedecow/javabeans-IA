package com.animahub.javabeans.ia.engine;

import com.animahub.javabeans.ia.dto.CenarioDTO;
import com.animahub.javabeans.ia.dto.AvaliacaoDTO;
import org.springframework.stereotype.Service;

@Service
public class GameEngine {

    private final SessionEngine sessionEngine;

    public GameEngine(SessionEngine sessionEngine) {
        this.sessionEngine = sessionEngine;
    }

    public CenarioDTO carregarCenarioInicial() {
        return new CenarioDTO(
            "CEN-001",
            "O Cliente Apressado",
            "Um cliente entra na cafeteria pedindo um espresso para viagem, mas o sistema de pagamentos acabou de cair.",
            "Comunicação Clara e Resolução de Problemas sob Pressão"
        );
    }

    public AvaliacaoDTO processarTurno(String sessionId, String respostaAluno) {
        if (!sessionEngine.isSessaoValida(sessionId)) {
            throw new IllegalArgumentException("Sessão inválida ou expirada.");
        }
        
        int xp = respostaAluno.length() > 20 ? 50 : 10; 
        return new AvaliacaoDTO(
            xp, 
            "Boa tentativa! Tente oferecer uma alternativa ao cliente na próxima vez.", 
            false, 
            false
        );
    }
}
