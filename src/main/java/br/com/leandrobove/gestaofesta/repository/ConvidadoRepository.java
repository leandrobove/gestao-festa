package br.com.leandrobove.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.leandrobove.gestaofesta.model.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

	@Query("SELECT c FROM Convidado c WHERE c.id = :id")
	public Convidado buscarPorId(@Param("id") Long id);
}
