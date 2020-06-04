package br.com.bossini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bossini.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//@Query("SELECT * FROM usuario WHERE login = :login AND senha = :senha")
	public Usuario findOneByLoginAndSenha(String login, String senha);
	
}
