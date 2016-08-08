package springtutorial.implementations;

import java.util.Date;

import springtutorial.api.Logger;

public class LoggerImpl implements Logger{

	public void log(String message) {
		System.out.println(new Date()+ " : " + message);
	}

}
