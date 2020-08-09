package br.com.fiap.rwsfiaplembretesamqpconsumer.dto;

public class LembreteDTO {

    private Integer id;
    private String conteudo;
    private String email;
    private String prioridade;

    public LembreteDTO() {
    }

    public LembreteDTO(Integer id, String conteudo, String email, String prioridade) {
        this.id = id;
        this.conteudo = conteudo;
        this.email = email;
        this.prioridade = prioridade;
    }

    public Integer getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getEmail() {
        return email;
    }

    public String getPrioridade() {
        return prioridade;
    }
}
