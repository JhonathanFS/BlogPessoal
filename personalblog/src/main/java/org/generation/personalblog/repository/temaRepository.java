package org.generation.personalblog.repository;

import java.util.List;

import org.generation.personalblog.model.tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface temaRepository extends JpaRepository<tema, Long>{

	public List<tema> findAllByNomeContainingIgnoreCase(String nome);	
}
