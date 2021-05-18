package it.ab.bookapi;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"it.ab.bookapi.controllers","it.ab.bookapi.services",
		"it.ab.bookapi.configs","it.ab.bookapi.dal",
		"it.ab.bookapi.exceptions","it.ab.bookapi.utilities"})
@EntityScan({"it.ab.bookapi.dal.models"})
@SpringBootApplication
public class BookapiApplication {

	public static void main(String[] args) {

		SpringApplication application= new SpringApplication(BookapiApplication.class);
		application.setAdditionalProfiles("dev");
		application.run(args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper ;
	}

}
