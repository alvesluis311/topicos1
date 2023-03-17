package topicos1.unitins.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import io.smallrye.common.constraint.NotNull;

public class AtletaDTO {
    @NotBlank(message = "O campo nome deve ser informado")
    @Size(min = 3, max = 60, message = "O tamanho máximo para o campo de nome é de 60 caracteres e o mínimo é de 3")
    @NotNull
    private String nome;
    
    @NotBlank(message = "O campo idEquipe deve ser informado")
    private Long idEquipe;
    
    @NotBlank(message = "O campo idade deve ser informado")
    private int idade;
    
    @NotBlank(message = "O campo cpf deve ser informado")
    @NotNull
    private String cpf;
    
    @NotBlank(message = "O campo altura deve ser informado")
    private Double altura;

    @NotBlank(message = "O campo esporte deve ser informado")
    private String esporte;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getIdEquipe() {
        return idEquipe;
    }
    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
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
