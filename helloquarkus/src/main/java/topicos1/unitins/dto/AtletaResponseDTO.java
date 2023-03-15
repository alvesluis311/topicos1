package topicos1.unitins.dto;

import java.util.HashMap;
import java.util.Map;

import topicos1.unitins.model.Atleta;

public class AtletaResponseDTO {
    private Long id;
    private String nome;
    private Map<String, Object> equipe;
    private int idade;
    private String cpf;
    private Double altura;
    private String esporte;

    public AtletaResponseDTO(Atleta atleta) {
        this.id = atleta.getId();
        this.nome = atleta.getNome();
        this.equipe = new HashMap<String, Object>();
        this.equipe.put("nome", atleta.getEquipe().getNome());
        this.equipe.put("pais", atleta.getEquipe().getPais());
        this.idade = atleta.getIdade();
        this.cpf = atleta.getCpf();
        this.altura = atleta.getAltura();
        this.esporte = atleta.getEsporte();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Object> getEquipe() {
        return equipe;
    }

    public void setEquipe(Map<String, Object> equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

}
