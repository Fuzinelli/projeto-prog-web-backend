

package com.gustavo.projetoprogweb;

		import com.gustavo.projetoprogweb.model.ClientesEntity;
		import com.gustavo.projetoprogweb.model.ProdutosEntity;
		import com.gustavo.projetoprogweb.model.VendasEntity;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.boot.autoconfigure.domain.EntityScan;
		import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = {"com.gustavo.projetoprogweb"})
@EnableAutoConfiguration
@EntityScan(basePackageClasses = {VendasEntity.class, ClientesEntity.class, ProdutosEntity.class})
@SpringBootApplication
public class ProjetoprogwebApplication {
	public static void main(String[] args){
		SpringApplication.run(ProjetoprogwebApplication.class, args);
	}
}
