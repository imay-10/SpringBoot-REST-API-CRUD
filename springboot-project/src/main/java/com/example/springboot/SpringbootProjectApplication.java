package com.example.springboot;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		Employee employee = new Employee();
		employee.setFirstName("Ayush");
		employee.setLastName("Mishra");
		employee.setEmailId("ayush@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Anunay");
		employee1.setLastName("Choudhury");
		employee1.setEmailId("ninja_anunay@gmail.com");
		employeeRepository.save(employee1);
		*/

	}
}
