package sm.login.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@Configuration
@SpringBootApplication
public class LoginApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LoginApplication.class);
	}

	//	@PostConstruct
//	public void init() {
//		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Colombo"));
//	}
}
