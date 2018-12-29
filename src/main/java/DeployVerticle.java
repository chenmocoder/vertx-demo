import io.vertx.core.AbstractVerticle;

public class DeployVerticle extends AbstractVerticle {

    public void start() {
        vertx.deployVerticle(new DemoVerticle());
    }

}
