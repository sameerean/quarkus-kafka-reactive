package ae.zg.quarkus.mongoreactive.repo;

import javax.enterprise.context.ApplicationScoped;

import ae.zg.quarkus.mongoreactive.rest.model.Fruit;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class FruitRepository implements PanacheMongoRepository<Fruit> {

//	public Fruit findByName(String name) {
//		return find("name", name).firstResult();
//	}

}
