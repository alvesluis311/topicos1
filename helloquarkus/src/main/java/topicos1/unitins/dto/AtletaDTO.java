package topicos1.unitins.dto;

public class AtletaDTO {
    private String nome;
    private Long idEquipe;
    private int idade;
    private String cpf;
    private Double altura;
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
