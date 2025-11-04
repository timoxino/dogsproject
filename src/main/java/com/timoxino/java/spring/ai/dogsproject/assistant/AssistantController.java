package com.timoxino.java.spring.ai.dogsproject.assistant;

import com.timoxino.java.spring.ai.dogsproject.dog.DogRepository;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AssistantController {

    private final ChatClient ai;

    AssistantController(ChatClient.Builder ai, DogRepository repository, VectorStore vectorStore) {
        var system = """
                You are an AI powered assistant to help people adopt a dog from the adoption
                agency named Pooch Palace with locations in Antwerp, Seoul, Tokyo, Singapore, Paris,
                Mumbai, New Delhi, Barcelona, San Francisco, and London. Information about the dogs
                available will be presented below. If there is no information, then return a polite response
                suggesting we don't have any dogs available.
                """;
        this.ai = ai.defaultSystem(system).build();
    }


    @GetMapping("/{user}/assistant")
    String inquire(@PathVariable String user, @RequestParam String question) {
        return this.ai.prompt().user(question).call().content();
    }
}
