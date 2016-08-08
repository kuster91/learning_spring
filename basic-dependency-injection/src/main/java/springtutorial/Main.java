package springtutorial;

import springtutorial.api.Logger;
import springtutorial.api.UserRepository;
import springtutorial.domain.User;
import springtutorial.implementations.LoggerImpl;
import springtutorial.implementations.UserRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UserRepository userRepository = new UserRepositoryImpl();
		userRepository.setLogger(logger);
		
		User user = userRepository.createUser("Kacper");
	}

}
