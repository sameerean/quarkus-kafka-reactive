package ae.zg.quarkus.mongoreactive.rest.json;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ae.zg.quarkus.mongoreactive.repo.ReactiveFruitRepository;
import ae.zg.quarkus.mongoreactive.rest.model.Fruit;
import io.smallrye.mutiny.Uni;

@Path("/reactive-fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReactiveFruitResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReactiveFruitResource.class);

	@Inject
	ReactiveFruitRepository repo;

	@GET
	public Uni<List<Fruit>> list() {
		return repo.listAll();
	}

	@POST
	public Uni<List<Fruit>> add(Fruit fruit) {
		LOGGER.info("Saving Fruit....");
		return repo.persist(fruit).onItem().apply(i ->  {
			LOGGER.info("Fruit saved successfully - ID = {} ------", fruit.id); 
			return i;
			}).onItem().ignore().andSwitchTo(this::list);
	}

}
