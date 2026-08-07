class MyResource(IResourceWithPolicy):

    def __init__(self, env):
        self.env = env

    def add_to_policy(self, statement):
        print(statement)

r = MyResource("production")
print(r.env)
