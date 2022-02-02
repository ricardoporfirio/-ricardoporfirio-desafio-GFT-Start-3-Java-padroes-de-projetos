package br.com.ricardoporfirio.padrosdeprojetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadrosdeprojetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadrosdeprojetosApplication.class, args);
		// Endereço api a ser consumida: http://localhost:8080/swagger-ui/index.html
	}

}
