package topicos1.unitins.repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import topicos1.unitins.model.Atleta;

@ApplicationScoped
public class AtletaRepository implements PanacheRepository<Atleta>{

    public List<Atleta> findByNomeIgnoreCase(String nome) {
        return find("LOWER(nome) LIKE LOWER(concat('%', ?1, '%'))", nome).list();
    }
    
    
}
