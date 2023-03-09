package topicos1.unitins.repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import topicos1.unitins.model.Equipe;

@ApplicationScoped
public class EquipeRepository implements PanacheRepository<Equipe>{

    public List<Equipe> findByNomeIgnoreCase(String nome) {
        if (nome == null){
            return null;
        }
        // return find("LOWER(nome) LIKE LOWER(concat('%', ?1, '%'))", nome).list();
         return find("UPPER(nome) LIKE ?1", "%"+nome+"%").list();
        // return find("nome LIKE ?1", "%"+nome+"%").list();
    }
    
    
}
