package br.ufjf.dcc193.trabalho1_dcc193;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import br.ufjf.dcc193.trabalho1_dcc193.Repositorio.SedeRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx =SpringApplication.run(DemoApplication.class, args);
	SedeRepository sedrep= ctx.getBean(SedeRepository.class);
}

}
