package springtutorial.api;

import springtutorial.domain.User;

public interface UserRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
