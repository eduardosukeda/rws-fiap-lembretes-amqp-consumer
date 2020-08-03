package br.com.fiap.rwsfiaplembretesamqpconsumer.config;

import br.com.fiap.rwsfiaplembretesamqpconsumer.service.LembretesConsumer;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LembreteAMQPConfig {

    @Value("lembretes")
    String queueName;

    @Value("ozkzkoca")
    String username;

    @Value("3rOq9kTTeHsgnz_VUTug9ttNneQhvPxD")
    private String password;

    @Bean
    Queue queue() {
        return new Queue(queueName, true);
    }

    @Bean
    MessageListenerContainer messageListenerContainer(ConnectionFactory connectionFactory ) {
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setConnectionFactory(connectionFactory);
        simpleMessageListenerContainer.setQueues(queue());
        simpleMessageListenerContainer.setMessageListener(new LembretesConsumer());
        return simpleMessageListenerContainer;

    }
}