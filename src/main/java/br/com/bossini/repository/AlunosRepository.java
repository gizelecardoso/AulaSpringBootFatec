package br.com.bossini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bossini.model.Aluno;

@Repository
public interface AlunosRepository extends JpaRepository<Aluno, Long>{
	

}
