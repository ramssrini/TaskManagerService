package com.cts.fsd.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cts.fsd.taskmanager.controller.TaskController;
import com.cts.fsd.taskmanager.service.TaskManagerService;

@SpringBootApplication(scanBasePackages={"com.cts.fsd.taskmanager.service","com.cts.fsd.taskmanager.controller"})
@ComponentScan
@CrossOrigin
public class TaskManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerServiceApplication.class, args);
	}
}
