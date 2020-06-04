package br.com.bossini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.bossini.utils.Calculadora;

@Configuration
public class AppConfig {
	
	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}
	
	@Autowired
	private Calculadora calculadora;
	
}
