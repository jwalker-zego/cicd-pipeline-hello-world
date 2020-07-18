package cicd.qe.testcontainers;

import org.testcontainers.containers.GenericContainer;

public class MongoDBContainer extends GenericContainer<MongoDBContainer> {

    private static final int PORT = 27017;

    public MongoDBContainer(final String image) {
        super(image);
        this.addExposedPort(PORT);
    }

    public String getUri() {
        final String ip = this.getContainerIpAddress();
        final Integer port = this.getMappedPort(PORT);
        return String.format("mongodb://%s:%s/test", ip, port);
    }

    @Override
    public void stop() {
        // let the JVM handle the shutdown
    }

}
