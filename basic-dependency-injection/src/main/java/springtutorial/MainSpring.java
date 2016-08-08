package springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springtutorial.api.UserRepository;
import springtutorial.domain.User;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UserRepository userRepository = context.getBean("repozytoriumUzytkownikow", UserRepository.class);
		User kacper = userRepository.createUser("Kacper");
	}
}
