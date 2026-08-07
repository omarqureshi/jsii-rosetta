public interface IResourceWithPolicy {
    String getEnv();
    void addToPolicy(String statement);
}

public class MyResource implements IResourceWithPolicy {
    private final String env;
    public String getEnv() {
        return this.env;
    }

    public MyResource(String env) {
        this.env = env;
    }

    public void addToPolicy(String statement) {
        System.out.println(statement);
    }
}

MyResource r = new MyResource("production");
System.out.println(r.getEnv());
