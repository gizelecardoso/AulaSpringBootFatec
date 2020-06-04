package br.com.bossini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bossini.model.Aluno;
import br.com.bossini.repository.AlunosRepository;
import br.com.bossini.utils.Calculadora;

@Service
public class AlunosService {

	@Autowired
	private AlunosRepository alunosRepository;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Aluno aluno) {
		alunosRepository.save(aluno);
	}
	
	public List<Aluno> listarTodos(){
		List<Aluno> alunos =  alunosRepository.findAll();
		
		for (Aluno aluno : alunos) {
			aluno.setMediaFinal(calculadora.calculaMedia(aluno.getNota1(), aluno.getNota2()));
		}
		
		return alunos;
	}
	
	
	
}
