package topicos1.unitins.resource;

import java.util.List;
// import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import topicos1.unitins.dto.AtletaDTO;
import topicos1.unitins.dto.AtletaResponseDTO;
//import topicos1.unitins.model.Atleta;
//import topicos1.unitins.repository.AtletaRepository;
//import topicos1.unitins.repository.EquipeRepository;
import topicos1.unitins.service.AtletaService;

@Path("/atletas") // no plural
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AtletaResource {

    @Inject
    private AtletaService atletaService;

    @GET
    public List<AtletaResponseDTO> getAll() {

        return atletaService.getAll();

        // return repository.findAll()
        // .stream().map(atleta -> new AtletaResponseDTO(atleta))
        // .collect(Collectors.toList()); 
        // seleciona todos os Atletas do banco de dados

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response insert (@Valid AtletaDTO dto) {

        AtletaResponseDTO responseDTO = atletaService.insert(dto);

        return Response
        .status(Status.CREATED)
        .entity(responseDTO)
        .build();
        // Atleta entity = new Atleta();
        // entity.setNome(dto.getNome());
        // entity.setEquipe(equipeRepository.findById(dto.getIdEquipe()));
        // // adiciona um atleta no banco de dados
        // repository.persist(entity);

        // return new AtletaResponseDTO(entity);
    }

    @PUT //altera todo o objeto
    @Path("alter/{id}") // consulta ao ID; Entre chaves: significa que é um parametro
    @Consumes(MediaType.APPLICATION_JSON) //forma que o dado está vindo para ser consumido
    @Produces(MediaType.APPLICATION_JSON) // produz; retorna o metodo
    @Transactional // insert, delete e update
    public Response update(@Valid @PathParam("id") Long id, AtletaDTO dto) {

        atletaService.update(id, dto);
        // Atleta entity = repository.findById(id); // entity é a informação que está no BD

        // entity.setNome(atleta.getNome());
        // entity.setIdade(atleta.getIdade());
        // entity.setAltura(atleta.getAltura());
        // entity.setCpf(atleta.getCpf());
        // entity.setEsporte(atleta.getEsporte());
        
        return Response.status(Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        atletaService.delete(id);
    }

    @GET
    @Path("/{id}")
    public AtletaResponseDTO findById(@PathParam("id") Long id) {
        return atletaService.findById(id);
    // return repository.findById(id);
    }


    @GET
    @Path("/count")
    public long count(){
        return atletaService.count();
    }

    @GET
    @Path("/nome/{nome}")
    public List<AtletaResponseDTO> searchByName(@PathParam("nome") String nome) {
    return atletaService.findByNome(nome);
    //    return repository.findByNome(nome);
    }

}
