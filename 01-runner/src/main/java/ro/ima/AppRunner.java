package ro.ima;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MethodHandles
			.lookup().lookupClass());

	@Override
	public void run(String... arg0) throws Exception {
		log.debug("Enter run");
		log.info("Hello {}!", "IMA");
	}

}
