package com.ilyas.spring_mvc;

import com.ilyas.spring_mvc.entities.Patient;
import com.ilyas.spring_mvc.repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {
	@Autowired
	private PatientRepo patientRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patient p = new Patient();
		p.setId(null);
		p.setName("leila");
		p.setMalade(false);
		p.setScore(10);
		p.setDateNaissance(new Date());
		Patient p2 = new Patient(null, "Hamza", new Date(), true, 12);
		Patient p3 = Patient.builder().name("Yassine").score(15).build();
		patientRepo.save(p);
		patientRepo.save(p2);
		patientRepo.save(p3);
	}
}
