package com.chandler.patterns.lens;

public class LensRunner {

    public static void main(String[] args) {
        User user = new User("john");

        Lens<User, String> userNameLens = Lens.of(u -> u.name, User::withName);

        String name = userNameLens.get(user);
        System.out.println("User name: " + name);

        user = userNameLens.set(user, "Mary");
        System.out.println(user);
    }
}
