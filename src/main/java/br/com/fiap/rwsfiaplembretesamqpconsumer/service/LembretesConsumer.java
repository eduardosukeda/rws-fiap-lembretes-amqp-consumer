package br.com.fiap.rwsfiaplembretesamqpconsumer.service;

import br.com.fiap.rwsfiaplembretesamqpconsumer.dto.LembreteDTO;
import com.google.gson.Gson;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class LembretesConsumer implements MessageListener {

    public void onMessage(Message message) {
        Gson gson = new Gson();
        LembreteDTO obj = gson.fromJson(new String(message.getBody()), LembreteDTO.class);
        EmailService.sendEmail(obj.getConteudo(), obj.getPrioridade());
        System.out.println("Consuming Message - " + new String(message.getBody()));
    }
}