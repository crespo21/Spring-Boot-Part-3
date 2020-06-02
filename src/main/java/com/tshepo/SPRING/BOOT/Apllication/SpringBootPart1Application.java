package com.tshepo.SPRING.BOOT.Apllication;

import com.tshepo.SPRING.BOOT.Apllication.Controller.UserController;
import com.tshepo.SPRING.BOOT.Apllication.Dao.FakeRepo;
import com.tshepo.SPRING.BOOT.Apllication.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Collections;

@SpringBootApplication
@EnableCaching (proxyTargetClass = true)
class Application {
	public static void main(String[] args) throws NullPointerException {
			SpringApplication application = new SpringApplication(Application.class);
			application.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
//			application.run(args);

			try {
				System.out.println("*****Fake Repo Contents ******");
				FakeRepo fakeRepo = new FakeRepo();
				System.out.println(" ");
				System.out.println(FakeRepo.insertUser(1,"theo","park"));
				System.out.println(" ");
				System.out.println(fakeRepo.findUserById(1));
				System.out.println(" ");
				System.out.println(fakeRepo.deleteUser(1));
				System.out.println(" ");
				System.out.println("*****User Service Implementation Contents ******");
				UserServiceImplementation userServiceImplementation = new UserServiceImplementation(fakeRepo);
				System.out.println(" ");
				System.out.println(userServiceImplementation.addUser(1,"",""));
				System.out.println(" ");
				System.out.println(userServiceImplementation.getUser(1));
				System.out.println(" ");
				System.out.println(userServiceImplementation.removeUser(1));
				System.out.println(" ");
				System.out.println("*****User Controller Contents ******");
				UserController userController = new UserController(userServiceImplementation);
				System.out.println(" ");
				System.out.println(userController.updateUser(3));
				System.out.println(" ");
				System.out.println(userController.deleteUser(3));
				System.out.println(" ");
				System.out.println(userController.getUser(3));
			}
			catch (NullPointerException e){
				e.getMessage();
			}
	}
}


