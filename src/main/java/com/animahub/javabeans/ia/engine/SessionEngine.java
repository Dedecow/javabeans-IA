package com.animahub.javabeans.ia.engine;

import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class SessionEngine {
    public String iniciarNovaSessao() {
        return UUID.randomUUID().toString();
    }

    public boolean isSessaoValida(String sessionId) {
        return sessionId != null && !sessionId.isBlank();
    }
}
