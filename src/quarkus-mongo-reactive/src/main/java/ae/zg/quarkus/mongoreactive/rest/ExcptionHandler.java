package ae.zg.quarkus.mongoreactive.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class ExcptionHandler implements ExceptionMapper<Throwable> {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExcptionHandler.class);

	@Override
	public Response toResponse(Throwable exception) {
		LOGGER.error("Exception: {} ", exception.getMessage(), exception);

		return Response.status(Status.BAD_REQUEST)
				.entity("{\"exception\":\"" + exception.getMessage().replace("\"", "'") + "\"}").build();

	}

}
