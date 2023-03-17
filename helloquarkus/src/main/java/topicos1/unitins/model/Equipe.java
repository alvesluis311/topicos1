package topicos1.unitins.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    @NotBlank(message = "O campo nome deve ser informado")
    @Size(min = 3, max = 60, message = "O tamanho máximo para o campo de nome é de 60 caracteres e o mínimo é de 3")
    private String nome;

    @Column(nullable = false, length = 60)
    @NotBlank(message = "O campo país deve ser informado")
    @Size(min = 2, max = 60, message = "O tamanho máximo para o campo de país é de 60 caracteres e o mínimo é de 2")
    private String pais;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public static Object findAll() {
        return null;
    }

    public static Equipe findById(Long id2) {
        return null;
    }
}
