package come.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"come.msa","come.msa.service","come.msa.vo","come.msa.controller"})
public class LifeServiceMsaFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifeServiceMsaFrontApplication.class, args);
	}

}
