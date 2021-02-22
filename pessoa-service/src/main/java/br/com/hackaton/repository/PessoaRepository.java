package br.com.hackaton.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hackaton.entity.Pessoa;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

	/*void save(Pessoa pessoa);*/
	
	void delete(Pessoa pessoa);
	
	List<Pessoa> findAll();
	
	Pessoa findOne(Integer id);

	Pessoa findPessoaByUsuarioAndSenha(String usuario, String senha);
}
