package com.animahub.javabeans.ia.controller;

import com.animahub.javabeans.ia.dto.CenarioDTO;
import com.animahub.javabeans.ia.dto.AvaliacaoDTO;
import com.animahub.javabeans.ia.dto.AcaoJogadorDTO;
import com.animahub.javabeans.ia.engine.GameEngine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    // Novo endpoint POST para receber a jogada
    @PostMapping("/avaliar")
    public AvaliacaoDTO avaliarJogada(@RequestBody AcaoJogadorDTO acao) {
        // Repassa os dados para a nossa Engine processar
        return gameEngine.processarTurno(acao.getSessionId(), acao.getResposta());
    }
}
