package ae.zg.quarkus.mongoreactive.repo;

import javax.enterprise.context.ApplicationScoped;

import ae.zg.quarkus.mongoreactive.rest.model.Fruit;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class ReactiveFruitRepository implements ReactivePanacheMongoRepository<Fruit> {

	public Uni<Fruit> findByName(String name) {
		return find("name", name).firstResult();
	}

}
