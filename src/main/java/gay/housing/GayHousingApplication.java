package gay.housing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
public class GayHousingApplication {


	public static void main(String[] args) {
		SpringApplication.run(GayHousingApplication.class, args);
	}


}
