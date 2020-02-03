package clients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.slf4j.Slf4jLogger;

@Configuration
public class ClientsConfiguration {

	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
	
	@Bean
	public Logger logger() {
		return new Slf4jLogger();
	}
	
}
