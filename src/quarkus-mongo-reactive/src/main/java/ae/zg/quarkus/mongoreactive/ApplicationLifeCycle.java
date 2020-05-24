package ae.zg.quarkus.mongoreactive;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
class ApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(ApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("The application {applicationName} is starting up...");
//        LOGGER.info("  _   _                      _    ____ ___ ");
//        LOGGER.info(" | | | | ___ _ __ ___       / \\  |  _ \\_ _|");
//        LOGGER.info(" | |_| |/ _ \\ '__/ _ \\     / _ \\ | |_) | | ");
//        LOGGER.info(" |  _  |  __/ | | (_) |   / ___ \\|  __/| | ");
//        LOGGER.info(" |_| |_|\\___|_|  \\___/   /_/   \\_\\_|  |___|");
//        LOGGER.info("                         Powered by Quarkus");
//
//        LOGGER.info("*********                Change this Banner inside ae.zg.quarkus.ApplicationLifeCycle  ********");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application {applicationName} is stopping...");
    }
}