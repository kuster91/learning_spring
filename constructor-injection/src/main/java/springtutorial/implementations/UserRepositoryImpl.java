package springtutorial.implementations;

import springtutorial.api.Logger;
import springtutorial.api.UserRepository;
import springtutorial.domain.User;

public class UserRepositoryImpl implements UserRepository {
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie uzytkownika " + name);
		return new User(name);
	}

	public UserRepositoryImpl(Logger logger, String location, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repo: " + location+'/'+dbName);
	}
}
