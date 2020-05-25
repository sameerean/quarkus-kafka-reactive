package ae.zg.quarkus.mongoreactive.rest.model;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;

@MongoEntity(collection = "fruit")
public class Fruit extends PanacheMongoEntity {

//	@
	public String name;
	public String description;

}
