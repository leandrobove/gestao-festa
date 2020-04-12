package br.com.leandrobove.gestaofesta.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leandrobove.gestaofesta.model.Convidado;
import br.com.leandrobove.gestaofesta.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	EntityManagerFactory factory;

	@Autowired
	private ConvidadoRepository convidadoRepository;

	public List<Convidado> listar() {
		return convidadoRepository.findAll();
	}

	public void salvar(Convidado c) {
		convidadoRepository.save(c);
	}
	
	public Optional<Convidado> buscarPorId(Long id) {
		return convidadoRepository.findById(id);
	}
	
	public void deletar(Long id) {
		convidadoRepository.deleteById(id);
	}

}
