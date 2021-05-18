package it.ab.bookapi;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"it.sintegra.bookapi.controllers","it.sintegra.bookapi.services",
		"it.sintegra.bookapi.configs","it.sintegra.bookapi.dal",
		"it.sintegra.bookapi.exceptions","it.sintegra.bookapi.utilities"})
@EntityScan({"it.sintegra.bookapi.dal.models"})
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
