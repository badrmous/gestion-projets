package sys.gestionprojets.gestion.projets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionProjetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProjetsApplication.class, args);
	}

}
