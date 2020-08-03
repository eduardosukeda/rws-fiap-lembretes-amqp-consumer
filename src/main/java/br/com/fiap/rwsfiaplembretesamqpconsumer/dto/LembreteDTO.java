package br.com.fiap.rwsfiaplembretesamqpconsumer.dto;

public class LembreteDTO {

    private Integer id;
    private String conteudo;
    private String prioridade;

    public LembreteDTO() {
    }

    public LembreteDTO(Integer id, String conteudo, String prioridade) {
        this.id = id;
        this.conteudo = conteudo;
        this.prioridade = prioridade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
