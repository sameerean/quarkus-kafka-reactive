package ae.zg.quarkus.mongoreactive.rest.json;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/api/hello")
public class HelloResource {
	
	private static final Logger LOGGER = Logger.getLogger(HelloResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	LOGGER.info("Inside Helloooo77999");
        return "hello";
    }
}