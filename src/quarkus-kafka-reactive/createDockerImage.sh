

./mvnw clean package -Pnative \
					 -Dquarkus.container-image.build=true \
					 -Dquarkus.container-image.group=sameerean \
					 -Dquarkus.container-image.name=quarkus-kafka-reactive \
					 -Dquarkus.container-image.tag=0.1 \
					 -Dquarkus.docker.dockerfile-native-path=src/main/docker/Dockerfile.native


#./mvnw clean package -Dquarkus.container-image.build=true \
#					 -Dquarkus.container-image.group=sameerean \
#					 -Dquarkus.container-image.name=quarkus-kafka-reactive \
#					 -Dquarkus.container-image.tag=0.1 \
#					 -Dquarkus.docker.dockerfile-jvm-path=./Dockerfile2.jvm

