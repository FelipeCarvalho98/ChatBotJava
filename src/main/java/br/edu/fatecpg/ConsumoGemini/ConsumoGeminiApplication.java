package br.edu.fatecpg.ConsumoGemini;

import br.edu.fatecpg.ConsumoGemini.service.ConsomeGemini;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class ConsumoGeminiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoGeminiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ConsomeGemini gemini = new ConsomeGemini();
		Boolean rodando = true;

		while(rodando == true){
		 System.out.println("Faça uma pergunta: ");
		 String pergunta = scan.nextLine();

		 if (pergunta.equals("fatec_sair")) {
			System.out.println("Saindo");
			rodando = false;
		}
        else {
			String resposta = gemini.fazerPergunta(pergunta);
			System.out.println(resposta);
		}
		}
	}
}

