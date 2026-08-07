interface IResourceWithPolicy {
  readonly env: string;
  addToPolicy(statement: string): void;
}

class MyResource implements IResourceWithPolicy {
  public readonly env: string;

  constructor(env: string) {
    this.env = env;
  }

  public addToPolicy(statement: string): void {
    console.log(statement);
  }
}

const r = new MyResource('production');
console.log(r.env);
