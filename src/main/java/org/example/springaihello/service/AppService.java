package org.example.springaihello.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    private ChatClient chatClient;

    public String generateChat(String subject, String tone, String message) {
        return chatClient
                .prompt()
                .system(sp -> sp.param("subject", subject).param("tone", tone))
                .user(message)
                .call()
                .chatResponse()
                .getResult()
                .getOutput()
                .getContent();
    }
}
