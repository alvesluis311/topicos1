package topicos1.unitins.resource;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import topicos1.unitins.model.Equipe;
import topicos1.unitins.repository.EquipeRepository;

@Path("/equipes") // no plural
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EquipeResource {

    @Inject
    private EquipeRepository repository;

    @GET
    public List<Equipe> getAll() {

        // seleciona todos os Atletas do banco de dados
        return repository.findAll().list(); 

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Equipe insert (Equipe equipe) {

        repository.persist(equipe);

        return equipe;
    }

    @PUT //altera todo o objeto
    @Path("/{id}") // consulta ao ID; Entre chaves: significa que é um parametro
    @Consumes(MediaType.APPLICATION_JSON) //forma que o dado está vindo para ser consumido
    @Produces(MediaType.APPLICATION_JSON) // produz; retorna o metodo
    @Transactional // insert, delete e update
    public Equipe update(@PathParam("id") Long id, Equipe equipe) {

        // entity é a informação que está no BD
        Equipe entity = repository.findById(id); 

        entity.setNome(equipe.getNome());
        entity.setPais(equipe.getPais());
        // não precisa de persist();
        
        return entity;
    }

    @DELETE
    @Path("delete/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id){
        Equipe equipe = repository.findById(id);
        if(repository.isPersistent(equipe))
        repository.delete(equipe);
    }

    @GET
    @Path("get/{id}")
    public Equipe getById(@PathParam("id") Long id) {
    return repository.findById(id);
    }

    @GET
    @Path("/count")
    public long count(){
        return repository.count();
    }

    @GET
    @Path("/nome/{nome}")
    public List<Equipe> searchByName(@PathParam("nome") String nome) {
    return repository.findByNomeIgnoreCase(nome);
    }

}
