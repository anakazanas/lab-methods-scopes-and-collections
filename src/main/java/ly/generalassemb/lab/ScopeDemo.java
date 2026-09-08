package ly.generalassemb.lab;

public class ScopeDemo {
    private static int instanceCount = 0;
    private int instanceId;

    public ScopeDemo() {
        instanceCount++;
        instanceId = instanceCount;
    }

    public static void demonstrateStaticScope() {
        System.out.println("Instances created so far: " + instanceCount);
    }

    public void demonstrateInstanceScope() {
        System.out.println("This object's ID: " + instanceId);
    }

    public void demonstrateLocalScope() {
        int localVar = 42;
        System.out.println("Local variable: " + localVar);
    }
}