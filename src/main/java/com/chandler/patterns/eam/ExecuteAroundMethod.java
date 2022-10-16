package com.chandler.patterns.eam;

import java.util.function.Consumer;

class Resource implements AutoCloseable {

    private Resource() {}

    public Resource operation() {
        System.out.println("Do some operation");
        return this;
    }

    public void otherOperation() {
        System.out.println("Do some other operation");
    }

    @Override
    public void close() {
        System.out.println("Closing");
    }

    public static void use(Consumer<Resource> block) {
        try (Resource resource = new Resource()) {
            block.accept(resource);
        }
    }
}

public class ExecuteAroundMethod {

    public static void main(String[] args) {
        Resource.use(resource -> resource.operation().otherOperation());
    }
}
