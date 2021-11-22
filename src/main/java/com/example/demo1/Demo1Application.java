package com.example.demo1;

import com.example.demo1.modal.*;
import com.example.demo1.repository.HumanRepository;
import com.example.demo1.repository.CustomerRepository;
import com.example.demo1.repository.StaffRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Demo1Application.class, args);

		HumanRepository staffRepository= configurableApplicationContext.getBean(StaffRepository.class);
		HumanRepository humanRepository=  configurableApplicationContext.getBean(CustomerRepository.class);

		Human staff= new Staff("Nguyen A", "aa@gmail.com", "QN", "0396432444", Degree.Excellent, 10);
		Human customer = new Customer("Nguyen B", "bb@gmail.com", "QN", "0396432444", Grade.VIP, 10);

		staffRepository.save(staff);
		humanRepository.save(customer);
	}

}
