package cl.duoc.ms_usuario_bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsUsuarioBsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUsuarioBsApplication.class, args);
	}

}
