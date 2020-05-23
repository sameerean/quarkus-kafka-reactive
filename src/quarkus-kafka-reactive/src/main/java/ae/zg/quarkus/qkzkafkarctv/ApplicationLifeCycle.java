package ae.zg.quarkus.qkzkafkarctv;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
class ApplicationLifeCycle {

	private static final Logger LOGGER = Logger.getLogger(ApplicationLifeCycle.class);

	void onStart(@Observes StartupEvent ev) {

		LOGGER.info("Inside ApplicationLifeCycle.onStart() ... ");
		
//
//		LOGGER.info("		 _____                          __                             "); 
//		LOGGER.info("		/\\  __`\\                       /\\ \\                            "); 
//		LOGGER.info("		\ \\ \\/\\ \\  __  __    __    _ __\ \ \/'\   __  __   ____         ");
//		LOGGER.info("		 \ \ \ \ \/\ \/\ \ /'__`\ /\`'__\ \ , <  /\ \/\ \ /',__\        ");
//		LOGGER.info("		  \ \ \\'\\ \ \_\ /\ \L\.\\ \ \/ \ \ \\`\\ \ \_\ /\__, `\       ");
//		LOGGER.info("		   \ \___\_\ \____\ \__/.\_\ \_\  \ \_\ \_\ \____\/\____/       ");
//		LOGGER.info("		 __ \___//_/\/___/ \/___\__/\/_/   \/_/\/_/\/___/ \/___/        ");
//		LOGGER.info("		/\ \/\ \           /'___/\ \                                    ");
//		LOGGER.info("		\ \ \/'/'     __  /\ \__\ \ \/'\      __                        ");
//		LOGGER.info("		 \ \ , <    /'__`\\ \ ,__\ \ , <    /'__`\                      ");
//		LOGGER.info("		  \ \ \\`\ /\ \L\.\\ \ \_/\ \ \\`\ /\ \L\.\_                    ");
//		LOGGER.info("		   \ \_\ \_\ \__/.\_\ \_\  \ \_\ \_\ \__/.\_\                   ");
//		LOGGER.info("		 ____/_/\/_/\/__/\/_/\/_/   \/_/\__/\/__/\/_/                   ");
//		LOGGER.info("		/\  _`\                         /\ \__ __                       ");
//		LOGGER.info("		\ \ \L\ \     __     __      ___\ \ ,_/\_\  __  __    __        ");
//		LOGGER.info("		 \ \ ,  /   /'__`\ /'__`\   /'___\ \ \\/\ \/\ \/\ \ /'__`\      ");
//		LOGGER.info("		  \ \ \\ \ /\  __//\ \L\.\_/\ \__/\ \ \\ \ \ \ \_/ /\  __/      ");
//		LOGGER.info("		   \ \_\ \_\ \____\ \__/.\_\ \____\\ \__\ \_\ \___/\ \____\     ");
//		LOGGER.info("		    \/_/\/ /\/____/\/__/\/_/\/____/ \/__/\/_/\/__/  \/____/     ");
//		LOGGER.info("    	");
    }

	void onStop(@Observes ShutdownEvent ev) {
		LOGGER.info("The application {applicationName} is stopping...");
	}
}