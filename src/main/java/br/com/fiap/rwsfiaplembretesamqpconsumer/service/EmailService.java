package br.com.fiap.rwsfiaplembretesamqpconsumer.service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Base64;

public class EmailService {

    public static void sendEmail(String destinatario, String mensagem, String prioridade) {
        String emailAddress = "lembretefiap@gmail.com";
        String pw =  new String(Base64.getDecoder().decode("MTIzNGZpYXBAIw=="));

        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(emailAddress, pw));
        email.setSSLOnConnect(true);

        try {
            String content = "";
            BufferedReader in = new BufferedReader(new FileReader("src/main/resources/email/email.html"));
            String str;
            while ((str = in.readLine()) != null) {
                content += str;
            }
            in.close();

            String novaFrase = content.replaceAll("##EMAIL##", destinatario)
                    .replaceAll("##PRIORIDADE##", prioridade)
                    .replaceAll("##CONTEUDO##", mensagem);
            email.setFrom(emailAddress);
            email.setSubject("Lembrete");
            email.setHtmlMsg(novaFrase);
            email.addTo(destinatario);
            email.send();
        } catch (Exception e) {

        }
    }
}
