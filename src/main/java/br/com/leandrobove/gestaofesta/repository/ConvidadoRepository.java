package br.com.leandrobove.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leandrobove.gestaofesta.model.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

}
