package com.animahub.javabeans.ia.controller;

import com.animahub.javabeans.ia.dto.CenarioDTO;
import com.animahub.javabeans.ia.dto.AvaliacaoDTO;
import com.animahub.javabeans.ia.dto.AcaoJogadorDTO;
import com.animahub.javabeans.ia.dto.DiagnosticoDTO;
import com.animahub.javabeans.ia.engine.GameEngine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/game")
public class GameController {
    
    private final GameEngine gameEngine;

    public GameController(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }
    
    @GetMapping("/health")
    public String health() {
        return "Game is running!";
    }
    
    @GetMapping("/cenario")
    public CenarioDTO cenario() {
        return gameEngine.carregarCenarioInicial();
    }

    @PostMapping("/avaliar")
    public AvaliacaoDTO avaliarJogada(@RequestBody AcaoJogadorDTO acao) {
        return gameEngine.processarTurno(acao.getSessionId(), acao.getResposta());
    }

    // NOVO: Endpoint de diagnóstico para o Front-end
    @GetMapping("/diagnostico")
    public DiagnosticoDTO diagnostico() {
        // Verifica de forma segura se a chave foi injetada no ambiente, sem expor o valor
        String apiKey = System.getenv("DEEPSEEK_API_KEY");
        boolean iaPronta = (apiKey != null && !apiKey.isBlank());
        
        return new DiagnosticoDTO(
            "ONLINE", 
            iaPronta, 
            LocalDateTime.now().toString()
        );
    }
}
