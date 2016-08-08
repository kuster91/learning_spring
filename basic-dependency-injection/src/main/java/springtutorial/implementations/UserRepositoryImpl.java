package springtutorial.implementations;

import springtutorial.api.Logger;
import springtutorial.api.UserRepository;
import springtutorial.domain.User;

public class UserRepositoryImpl implements UserRepository{
	private Logger logger;
	
	public User createUser(String name) {
		logger.log("Tworzenie uzytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger=logger;
	}

}
