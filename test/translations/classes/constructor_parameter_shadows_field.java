public class MyResource {
    private final String env;
    public String getEnv() {
        return this.env;
    }
    private final String resource;

    public MyResource(String resource) {
        this.resource = resource;
        this.env = "production";
    }

    public String description() {
        return this.resource;
    }
}

MyResource r = new MyResource("bucket");
