package topicos1.unitins.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import topicos1.unitins.dto.AtletaDTO;
import topicos1.unitins.dto.AtletaResponseDTO;
import topicos1.unitins.model.Atleta;
import topicos1.unitins.repository.EquipeRepository;
import topicos1.unitins.repository.AtletaRepository;

@ApplicationScoped
public class AtletaImplService implements AtletaService {

    @Inject
    AtletaRepository atletaRepository;

    @Inject
    EquipeRepository equipeRepository;

    @Override
    public List<AtletaResponseDTO> getAll() {
        return atletaRepository.findAll()
        .stream()
        .map(AtletaResponseDTO::new)
        .collect(Collectors.toList());
      //  return atletaRepository.findAll()
      //  .stream()
      //  .map(atleta -> new AtletaResponseDTO(atleta))
     //   .collect(Collectors.toList());
    }

    @Override
    public AtletaResponseDTO findById(Long id) {
        Atleta atleta = atletaRepository.findById(id);
        return new AtletaResponseDTO(atleta);
    }

    @Override
    @Transactional
    public AtletaResponseDTO insert(AtletaDTO dto) {
        Atleta entity = new Atleta();
        entity.setNome(dto.getNome());
        entity.setEquipe(equipeRepository.findById(dto.getIdEquipe()));
        entity.setIdade(dto.getIdade());
        entity.setCpf(dto.getCpf());
        entity.setAltura(dto.getAltura());
        entity.setEsporte(dto.getEsporte());

        atletaRepository.persist(entity);
        return new AtletaResponseDTO(entity);
    }

    @Override
    @Transactional
    public AtletaResponseDTO update(Long id, AtletaDTO dto) {
        Atleta entity = atletaRepository.findById(id);

       entity.setNome(dto.getNome());
       entity.setEquipe(equipeRepository.findById(dto.getIdEquipe()));
       entity.setIdade(dto.getIdade());
       entity.setCpf(dto.getCpf());
       entity.setAltura(dto.getAltura());
       entity.setEsporte(dto.getEsporte());

       return new AtletaResponseDTO(entity);
    }

    @Override
    public void delete(Long id) {
        Atleta entity = atletaRepository.findById(id);

        if (atletaRepository.isPersistent(entity))
            atletaRepository.delete(entity);
    }

    @Override
    public List<AtletaResponseDTO> findByNome(String nome) {
        List<Atleta> list = atletaRepository.findByNome(nome);
        return list
        .stream()
        .map(AtletaResponseDTO::new)
        .collect(Collectors.toList());
    }

    @Override
    public long count() {
        return atletaRepository.count();
    }    
}
