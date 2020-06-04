package br.com.bossini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bossini.model.Aluno;
import br.com.bossini.service.AlunosService;

@Controller
@RequestMapping
public class AlunosController {

	@Autowired
	private AlunosService alunosService;
	
	@GetMapping("/alunos")
	public ModelAndView findAlunos() {
		List<Aluno> alunos = alunosService.listarTodos();
		ModelAndView mv = new ModelAndView("alunos");
		mv.addObject(new Aluno());
		mv.addObject("alunos", alunos);
		return mv;
	}
	
	@PostMapping("/alunos")
	public String createAlunos(Aluno aluno) {
		alunosService.salvar(aluno);
		return "redirect:/alunos";
	}
	
}
