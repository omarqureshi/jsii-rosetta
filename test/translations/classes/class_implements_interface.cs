interface IResourceWithPolicy
{
    string Env { get; }
    void AddToPolicy(string statement);
}

class MyResource : IResourceWithPolicy
{
    public string Env { get; }

    public MyResource(string env)
    {
        Env = env;
    }

    public void AddToPolicy(string statement)
    {
        Console.WriteLine(statement);
    }
}

var r = new MyResource("production");
Console.WriteLine(r.Env);
