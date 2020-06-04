package br.com.bossini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bossini.model.Usuario;
import br.com.bossini.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public boolean existeUsuario(Usuario usuario) {
		return usuarioRepository.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
	
}
