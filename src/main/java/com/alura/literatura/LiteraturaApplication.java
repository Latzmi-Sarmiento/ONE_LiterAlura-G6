package com.alura.literatura;

import com.alura.literatura.principal.Principal;
import com.alura.literatura.repository.AutorRepository;
import com.alura.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot.
 */

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {
	@Autowired
	private LibroRepository libRepository;

	@Autowired
	private AutorRepository autRepository;

	/**
	 * Método principal para iniciar la aplicación Spring Boot.
	 * @param args Argumentos de la línea de comandos.
	 */

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);

	}

	/**
	 * Método para ejecutar la aplicación una vez iniciada.
	 * @param args Argumentos de la línea de comandos.
	 * @throws Exception Excepción que puede ocurrir durante la ejecución.
	 */
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libRepository, autRepository);
		principal.muestraElMenu();

	}

}
