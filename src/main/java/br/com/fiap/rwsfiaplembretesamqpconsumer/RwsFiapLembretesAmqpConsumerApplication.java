package br.com.fiap.rwsfiaplembretesamqpconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
public class RwsFiapLembretesAmqpConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RwsFiapLembretesAmqpConsumerApplication.class, args);
	}

}
