package larionovoleksandr.design.patterns;

import larionovoleksandr.design.patterns.es1.AdapterInfoToUser;
import larionovoleksandr.design.patterns.es1.Info;
import larionovoleksandr.design.patterns.es2.Libro;
import larionovoleksandr.design.patterns.es2.Pagina;
import larionovoleksandr.design.patterns.es2.Sezione;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		Info info = new Info("Alex","Larionov", LocalDate.of(1991,5,23));

		AdapterInfoToUser newAdapt = new AdapterInfoToUser(info);


		System.out.println("*****************************************************************");
		Libro libro = new Libro("Gamba di legno e dove trovarla", List.of("Brazorf", "Lord Ring"),40.99);
		libro.addComponent(new Pagina(1));
		libro.addComponent(new Pagina(2));

		Sezione sezione1 = new Sezione("Gamba Scomparsa");
		sezione1.addComponent(new Pagina(3));
		sezione1.addComponent(new Pagina(4));
	}

}
