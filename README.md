# rws-fiap-lembretes-amqp-consumer
Microserviço com o objetivo de ser consumidor de um produtor (https://github.com/eduardosukeda/rws-fiap-lembretes) que cadastra lembretes por usuário e realiza o envio de um e-mail informando para o usuário a prioridade, conteudo e que seu lembrete foi adicionado/editado.

## Pré-requisitos para execução do rws-fiap-lembretes-amqp-consumer

1 - Para executar o projeto é necessário ter o JRE 8 ou JDK 8 instalado.

2 - Possuir uma IDE para execução.


## Spring Framework

- Spring Web
- Spring AMQP (RabbitMQ)


## Heroku

Foi realizado o deploy da aplicação rws-fiap-lembretes-amqp-consumer no Heroku que é uma plataforma em nuvem, onde é possível realizar o acesso através da mesma.

Acesso - https://rws-fiap-lembretes.herokuapp.com/


## Instalação e execução do rws-fiap-lembretes-amqp-consumer

1 - Realizar o clone `$ git clone https://github.com/eduardosukeda/rws-fiap-lembretes-amqp-consumer.git`

2 - Importar o projeto em sua IDE e realizar Update Maven

3 - Selecionar a classe principal RwsFiapLembretesAmqpConsumerApplication

4 - Run
