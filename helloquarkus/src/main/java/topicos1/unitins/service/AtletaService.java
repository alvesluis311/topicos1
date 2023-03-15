package topicos1.unitins.service;

import java.util.List;

import topicos1.unitins.dto.AtletaDTO;
import topicos1.unitins.dto.AtletaResponseDTO;

public interface AtletaService {

    List<AtletaResponseDTO>getAll();

    AtletaResponseDTO findById(Long id);

    AtletaResponseDTO insert(AtletaDTO dto);

    AtletaResponseDTO update(Long id, AtletaDTO dto);

    void delete(Long id);

    // Recurso extra

    List<AtletaResponseDTO> findByNome(String nome);

    long count();
    
}
