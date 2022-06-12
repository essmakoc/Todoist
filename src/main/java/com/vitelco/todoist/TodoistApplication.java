package com.vitelco.todoist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
		/*
			1.	encapsulation - her şeyi kendi kapsülünde tutma
			2.	abstraction - detay gizlemek
		 */
@SpringBootApplication
@Slf4j
public class TodoistApplication {

	public static void main(String[] args) {

		SpringApplication.run(TodoistApplication.class, args);

		/*User user = new User(1l, "Esma","Koc", 25);
		Task task1 = new Task(1l, "Kitap okumak", user, Task.Category.PERSONAL);
		Task task2 = new Task(2l, "Egitim", user, Task.Category.WORK);
		log.info("Task1: {} - Task2: {} ", task1, task2);*/

	}

}
