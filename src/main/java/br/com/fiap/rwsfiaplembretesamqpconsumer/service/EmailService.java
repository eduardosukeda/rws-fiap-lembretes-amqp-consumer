package br.com.fiap.rwsfiaplembretesamqpconsumer.service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EmailService {

    public static void sendEmail(String mensagem, String prioridade) {
        String meuemail = "";
        String senha = "";

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuemail, senha));
        email.setSSLOnConnect(true);

        try {
            email.setFrom(meuemail);
            email.setSubject(prioridade);
            email.setMsg(mensagem);
            email.addTo("");
            email.send();
        } catch (Exception e) {

        }
    }
}
