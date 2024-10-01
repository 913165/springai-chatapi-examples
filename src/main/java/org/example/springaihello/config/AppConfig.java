package org.example.springaihello.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Configuration
    class Config {

        @Bean
        ChatClient chatClient(ChatClient.Builder builder) {
            return builder.defaultSystem("You are an AI assistant that specializes in {subject}. " +
                            "You respond in a {tone} voice with detailed explanations.")
                    .build();
        }

    }

}
